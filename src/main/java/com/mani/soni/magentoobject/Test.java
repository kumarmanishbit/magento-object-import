package com.mani.soni.magentoobject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    // directory_country_region table


    public static void main(String[] args) {

        Map<Integer, List<String>> region= new HashMap<>() {{
            put(1, new ArrayList<>(){{add("533"); add("AN"); add("Andaman and Nicobar Islands");}});
            put(2, new ArrayList<>(){{add("534"); add("AP"); add("Andhra Pradesh");}});
            put(3, new ArrayList<>(){{add("535"); add("AR"); add("Arunachal Pradesh");}});
            put(4, new ArrayList<>(){{add("536"); add("AS"); add("Assam");}});
            put(5, new ArrayList<>(){{add("537"); add("BR"); add("Bihar");}});
            put(6, new ArrayList<>(){{add("538"); add("CH"); add("Chandigarh");}});
            put(7, new ArrayList<>(){{add("539"); add("CT"); add("Chhattisgarh");}});
            put(8, new ArrayList<>(){{add("540"); add("DN"); add("Dadra and Nagar Haveli");}});
            put(9, new ArrayList<>(){{add("541"); add("DD"); add("Daman and Diu");}});
            put(10, new ArrayList<>(){{add("542"); add("DL"); add("Delhi");}});
            put(11, new ArrayList<>(){{add("543"); add("GA"); add("Goa");}});
            put(12, new ArrayList<>(){{add("544"); add("GJ"); add("Gujarat");}});
            put(13, new ArrayList<>(){{add("545"); add("HR"); add("Haryana");}});
            put(14, new ArrayList<>(){{add("546"); add("HP"); add("Himachal Pradesh");}});
            put(15, new ArrayList<>(){{add("547"); add("JK"); add("Jammu and Kashmir");}});
            put(16, new ArrayList<>(){{add("548"); add("JH"); add("Jharkhand");}});
            put(17, new ArrayList<>(){{add("549"); add("KA"); add("Karnataka");}});
            put(18, new ArrayList<>(){{add("550"); add("KL"); add("Kerala");}});
            put(19, new ArrayList<>(){{add("551"); add("LD"); add("Lakshadweep");}});
            put(20, new ArrayList<>(){{add("552"); add("MP"); add("Madhya Pradesh");}});
            put(21, new ArrayList<>(){{add("553"); add("MH"); add("Maharashtra");}});
            put(22, new ArrayList<>(){{add("554"); add("MN"); add("Manipur");}});
            put(23, new ArrayList<>(){{add("555"); add("ML"); add("Meghalaya");}});
            put(24, new ArrayList<>(){{add("556"); add("MZ"); add("Mizoram");}});
            put(25, new ArrayList<>(){{add("557"); add("NL"); add("Nagaland");}});
            put(26, new ArrayList<>(){{add("558"); add("OR"); add("Odisha");}});
            put(27, new ArrayList<>(){{add("559"); add("PY"); add("Puducherry");}});
            put(28, new ArrayList<>(){{add("560"); add("PB"); add("Punjab");}});
            put(29, new ArrayList<>(){{add("561"); add("RJ"); add("Rajasthan");}});
            put(30, new ArrayList<>(){{add("562"); add("SK"); add("Sikkim");}});
            put(31, new ArrayList<>(){{add("563"); add("TN"); add("Tamil Nadu");}});
            put(32, new ArrayList<>(){{add("564"); add("TG"); add("Telangana");}});
            put(33, new ArrayList<>(){{add("565"); add("TR"); add("Tripura");}});
            put(34, new ArrayList<>(){{add("566"); add("UP"); add("Uttar Pradesh");}});
            put(35, new ArrayList<>(){{add("567"); add("UT"); add("Uttarakhand");}});
            put(36, new ArrayList<>(){{add("568"); add("WB"); add("West Bengal");}});
        }};

        int random = (int) (Math.random() * 100);
        System.out.println(random);
        System.out.println(region.get(random % 36));
    }
}
