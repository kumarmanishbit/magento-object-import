package com.mani.soni.magentoobject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class MagentoObjectApplication implements ApplicationRunner {

	private Logger logger = LoggerFactory.getLogger(MagentoObjectApplication.class);

	@Value("${app.record.count: 1}")
	private int recordCount;

	@Autowired
	FetchRandomContact fetchRandomContact;

	private static Map<Integer, List<String>> region = new HashMap<>() {{
		put(1, new ArrayList<>() {{
			add("533");
			add("AN");
			add("Andaman and Nicobar Islands");
		}});
		put(2, new ArrayList<>() {{
			add("534");
			add("AP");
			add("Andhra Pradesh");
		}});
		put(3, new ArrayList<>() {{
			add("535");
			add("AR");
			add("Arunachal Pradesh");
		}});
		put(4, new ArrayList<>() {{
			add("536");
			add("AS");
			add("Assam");
		}});
		put(5, new ArrayList<>() {{
			add("537");
			add("BR");
			add("Bihar");
		}});
		put(6, new ArrayList<>() {{
			add("538");
			add("CH");
			add("Chandigarh");
		}});
		put(7, new ArrayList<>() {{
			add("539");
			add("CT");
			add("Chhattisgarh");
		}});
		put(8, new ArrayList<>() {{
			add("540");
			add("DN");
			add("Dadra and Nagar Haveli");
		}});
		put(9, new ArrayList<>() {{
			add("541");
			add("DD");
			add("Daman and Diu");
		}});
		put(10, new ArrayList<>() {{
			add("542");
			add("DL");
			add("Delhi");
		}});
		put(11, new ArrayList<>() {{
			add("543");
			add("GA");
			add("Goa");
		}});
		put(12, new ArrayList<>() {{
			add("544");
			add("GJ");
			add("Gujarat");
		}});
		put(13, new ArrayList<>() {{
			add("545");
			add("HR");
			add("Haryana");
		}});
		put(14, new ArrayList<>() {{
			add("546");
			add("HP");
			add("Himachal Pradesh");
		}});
		put(15, new ArrayList<>() {{
			add("547");
			add("JK");
			add("Jammu and Kashmir");
		}});
		put(16, new ArrayList<>() {{
			add("548");
			add("JH");
			add("Jharkhand");
		}});
		put(17, new ArrayList<>() {{
			add("549");
			add("KA");
			add("Karnataka");
		}});
		put(18, new ArrayList<>() {{
			add("550");
			add("KL");
			add("Kerala");
		}});
		put(19, new ArrayList<>() {{
			add("551");
			add("LD");
			add("Lakshadweep");
		}});
		put(20, new ArrayList<>() {{
			add("552");
			add("MP");
			add("Madhya Pradesh");
		}});
		put(21, new ArrayList<>() {{
			add("553");
			add("MH");
			add("Maharashtra");
		}});
		put(22, new ArrayList<>() {{
			add("554");
			add("MN");
			add("Manipur");
		}});
		put(23, new ArrayList<>() {{
			add("555");
			add("ML");
			add("Meghalaya");
		}});
		put(24, new ArrayList<>() {{
			add("556");
			add("MZ");
			add("Mizoram");
		}});
		put(25, new ArrayList<>() {{
			add("557");
			add("NL");
			add("Nagaland");
		}});
		put(26, new ArrayList<>() {{
			add("558");
			add("OR");
			add("Odisha");
		}});
		put(27, new ArrayList<>() {{
			add("559");
			add("PY");
			add("Puducherry");
		}});
		put(28, new ArrayList<>() {{
			add("560");
			add("PB");
			add("Punjab");
		}});
		put(29, new ArrayList<>() {{
			add("561");
			add("RJ");
			add("Rajasthan");
		}});
		put(30, new ArrayList<>() {{
			add("562");
			add("SK");
			add("Sikkim");
		}});
		put(31, new ArrayList<>() {{
			add("563");
			add("TN");
			add("Tamil Nadu");
		}});
		put(32, new ArrayList<>() {{
			add("564");
			add("TG");
			add("Telangana");
		}});
		put(33, new ArrayList<>() {{
			add("565");
			add("TR");
			add("Tripura");
		}});
		put(34, new ArrayList<>() {{
			add("566");
			add("UP");
			add("Uttar Pradesh");
		}});
		put(35, new ArrayList<>() {{
			add("567");
			add("UT");
			add("Uttarakhand");
		}});
		put(36, new ArrayList<>() {{
			add("568");
			add("WB");
			add("West Bengal");
		}});
	}};

	@Autowired
	Processor processor;

	public static void main(String[] args) {
		SpringApplication.run(MagentoObjectApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		processor.buildAndPushContact();
	}

//	@Override
//	public void run(ApplicationArguments args) throws Exception {
//
//		logger.info("Application has started...");
//		Thread.sleep(500);
//
//		String authToken = fetchRandomContact.getAuthToken();
//
//		int success = 0;
//
//		while(recordCount > 0) {
//
//			logger.info("Fetching the random record");
//            try {
//				ObjectDto contact = fetchRandomContact.getRandomContact();
//				logger.info("Received record");
//				for (ObjectDto.Result result : contact.getResults()) {
//					String email = result.getEmail();
//					ObjectDto.Name name = result.getName();
//					String firstName = name.getFirst();
//					String lastName = name.getLast();
//					ObjectDto.Location location = result.getLocation();
//					String postCode = location.getPostcode();
//					String street = location.getStreet().getName();
//					String city = location.getCity();
//					String country = location.getCountry();
//					String countryId = "IN";
//					String regionCode = "IN";
//					String region = location.getCity();
//
//					String phone = result.getPhone();
//
//					String password = "Password1";
//
//					MagentoContact magentoContact = new MagentoContact();
//					MagentoContact.Customer customer = new MagentoContact.Customer();
//					customer.setEmail(email);
//					customer.setFirstname(firstName);
//					customer.setLastname(lastName);
//					MagentoContact.Address address = new MagentoContact.Address();
//
//					address.setStreet(new ArrayList<>() {{
//						add(street);
//					}});
//					address.setCity(city);
//					address.setCountryId(countryId);
//					address.setPostcode(postCode);
//					MagentoContact.Region region1 = new MagentoContact.Region();
//					List<String> tmp = getRegion();
//
//					region1.setRegion(tmp.get(2));
//					region1.setRegionCode(tmp.get(1));
//					region1.setRegionId(Integer.parseInt(tmp.get(0)));
//
//					address.setDefaultBilling(true);
//					address.setDefaultShipping(true);
//					address.setFirstname(firstName);
//					address.setLastname(lastName);
//					address.setRegion(region1);
//					address.setTelephone(phone);
//					address.setCountryId("IN");
//					customer.setAddresses(new ArrayList<>() {{
//						add(address);
//					}});
//
//					magentoContact.setCustomer(customer);
//					magentoContact.setPassword(password);
//					logger.info(magentoContact.toString());
//					fetchRandomContact.postObject(magentoContact, authToken);
//				}
//				logger.info(contact.getResults().toString());
//				success++;
//			} catch (Exception ex) {
////            	recordCount = 0;
//				logger.error("Error occurred while processing");
//			}
//			recordCount--;
//		}
//		logger.info("Total number of record inserted: {}", success);
//	}

	private List<String> getRegion() {
		int random = (int) (Math.random() * 100);
		return region.get(random % 36);
	}
}
