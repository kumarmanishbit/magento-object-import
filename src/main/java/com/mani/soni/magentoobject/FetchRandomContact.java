package com.mani.soni.magentoobject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class FetchRandomContact {

    private Logger logger = LoggerFactory.getLogger(MagentoObjectApplication.class);


    @Value("${app.magento.url:http://magento-dev.com:8181}")
    private String baseURL;

    @Value("${app.magento.code:default}")
    private String code;

    @Value("${app.magento.username}")
    private String username;

    @Value("${app.magento.password}")
    private String password;

//    http://magento-dev.com:8181/rest/all/V1/integration/admin/token

    @Autowired
    RestTemplate restTemplate;

    public ObjectDto getRandomContact() {

        String fooResourceUrl
                = "https://randomuser.me/api/";
        ResponseEntity<ObjectDto> response
                = restTemplate.getForEntity(fooResourceUrl, ObjectDto.class);

        return response.getBody();
    }

    public String getAuthToken() throws JsonProcessingException {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode rootNode = mapper.createObjectNode();
        rootNode.put("username", username);
        rootNode.put("password", password);

        HttpEntity<String> request = new HttpEntity<>(mapper.writeValueAsString(rootNode), headers);

        String authURL =  String.format(baseURL+"%s", "/rest/all/V1/integration/admin/token");

        String token = restTemplate.postForObject(authURL, request, String.class);

        logger.info("Received token from magneto {}", token);

        return token.substring(1, token.length()- 2);
    }

    public void postObject(MagentoContact contact, String authToken) throws JsonProcessingException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<MagentoContact> request = new HttpEntity<>(contact, headers);
        headers.setBearerAuth(authToken);
        String resourceURL =  String.format(baseURL+ "/rest/%s/V1/customers", code);
        logger.info("resourceURL {}", resourceURL);
        restTemplate.postForObject(resourceURL, request, MagentoContact.class);
        logger.info("Customer with email {} has been created", contact.getCustomer().getEmail());
    }
}
