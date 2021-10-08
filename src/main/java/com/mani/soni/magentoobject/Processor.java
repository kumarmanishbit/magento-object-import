package com.mani.soni.magentoobject;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class Processor {

    @Autowired
    FetchRandomContact fetchRandomContact;

    public List<MagentoCustomer> getContactFromDB() {
            // create session factory
            SessionFactory factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(MagentoCustomer.class)
                    .addAnnotatedClass(List.class)
                    .buildSessionFactory();

            // create session
            Session session = factory.getCurrentSession();
            List<MagentoCustomer> entityList;

            try {
                session.beginTransaction();

                CriteriaBuilder builder = session.getCriteriaBuilder();

                // Create CriteriaQuery
                CriteriaQuery<MagentoCustomer> criteria = builder.createQuery(MagentoCustomer.class);

                // Specify criteria root
                criteria.from(MagentoCustomer.class);

                // Execute query
                entityList  = session.createQuery(criteria).setFirstResult(1000000).setMaxResults(500000).getResultList();

                // 1, 1 lakh
                // 1 lakh, 2 lakh

//                System.out.println(entityList.size());
                // commit transaction
                session.getTransaction().commit();

                System.out.println("Done!");
            } finally {
                // add clean up code
                session.close();
                factory.close();
            }
            return entityList;
        }

        public void buildAndPushContact() throws JsonProcessingException {
            List<MagentoCustomer> contacts = getContactFromDB();

            String authToken = fetchRandomContact.getAuthToken();

            for (MagentoCustomer result : contacts) {
                String email = result.getEmail();
                String firstName = result.getFirstName();
                String lastName = result.getLastName();
                String postCode = result.getPostCode();
                String street = result.getStreet();
                String city = result.getCity();
                String countryId = "IN";

//                String phone = getPhoneNumber();

                String phone = "9130678950";

                String password = "Password1";

                MagentoContact magentoContact = new MagentoContact();
                MagentoContact.Customer customer = new MagentoContact.Customer();
                customer.setEmail(email);
                customer.setFirstname(firstName);
                customer.setLastname(lastName);
                MagentoContact.Address address = new MagentoContact.Address();

                address.setStreet(new ArrayList<>() {{
                    add(street);
                }});
                address.setCity(city);
                address.setCountryId(countryId);
                address.setPostcode(postCode);
                MagentoContact.Region region1 = new MagentoContact.Region();

                region1.setRegion(result.getRegion());
                region1.setRegionCode(result.getRegionCode());
                region1.setRegionId(result.getRegionId());

                address.setDefaultBilling(true);
                address.setDefaultShipping(true);
                address.setFirstname(firstName);
                address.setLastname(lastName);
                address.setRegion(region1);
                address.setTelephone(phone);
                address.setCountryId("IN");
                customer.setAddresses(new ArrayList<>() {{
                    add(address);
                }});

                magentoContact.setCustomer(customer);
                magentoContact.setPassword(password);
//                logger.info(magentoContact.toString());
                System.out.println(magentoContact);
                CompletableFuture.runAsync(() -> {
                    try {
                        fetchRandomContact.postObject(magentoContact, authToken);
                    } catch (Exception ex) {
                        System.out.println("exception "+ ex.getMessage());
                    }
                });
            }
        }

        private String getPhoneNumber() {
            int num1, num2, num3; //3 numbers in area code
            int set2, set3; //sequence 2 and 3 of the phone number

            Random generator = new Random();

            //Area code number; Will not print 8 or 9
            num1 = generator.nextInt(10) + 1; //add 1 so there is no 0 to begin
            num1 = num1 % 10;
            num2 = generator.nextInt(10); //randomize to 8 becuase 0 counts as a number in the generator
            num3 = generator.nextInt(10);

            set2 = generator.nextInt(900) + 100;

            set3 = generator.nextInt(8999) + 1000;

            return num1 + "" + num2 + "" + num3 + "" + set2 + "" + set3;
        }
}
