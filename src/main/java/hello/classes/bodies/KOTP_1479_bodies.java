package hello.classes.bodies;

public class KOTP_1479_bodies {
    public String getBodyPostCalculation(String timestamp, String doc_no, String doc_date, String order_id, String castomer_tarrif) {
        return  "{"+
                "	\"timestamp\": \"" + timestamp +"\","+
                "	\"data\": {"+
                "		\"doc_no\": \"" + doc_no + "\","+
                "		\"doc_date\": \"" + doc_date + "\","+
                "		\"order_id\": \"" + order_id + "\","+
                "		\"calculation\": [{"+
                "			\"commission\":0.00,"+
                "			\"castomer_tariff\": \"" + castomer_tarrif + "\""+
                "		}]"+
                "	}"+
                "}";
    }

    public String postStatusInfo(String timestamp) {
        return  "{"+
                "	\"success\": true,"+
                "	\"timestamp\": \"" + timestamp + "\""+
                "}";
    }
}
