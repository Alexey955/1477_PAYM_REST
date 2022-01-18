package hello.classes.bodies;

public class ECM_1403_bodies {

    public String getBodyFiles(String uuid) {
        return "{" +
                "	\"uuid\": \"" + uuid + "\"," +
                "	\"name\": \"Заявление о предоставлении услуг.docx\"," +
                "	\"bucket\": \"main\"," +
                "	\"folder\": \"ACCR-87\"," +
                "	\"folderOwner\": \"1386\"," +
                "	\"type\": \"application/octet-stream\"," +
                "	\"uploadDate\": \"2021-03-23T08:01:05Z\"," +
                "	\"hashSum\": \"68b29b01ea994fea0d49b8cb56e41cf6fc706feebd44e9f87c08e5dfae7eb32b\"," +
                "	\"expirationDate\": null," +
                "	\"_links\": {" +
                "		\"self\": {" +
                "			\"href\": \"https://ts-ecm.k3-omni-tech-tsec.apps.kt-oscp.vtb24.ru/files-info/3b64aa99-380c-4c26-b261-fe198d98aab6\"" +
                "		}" +
                "	}" +
                "}";
    }

    public String getBodyEcmSign() {
        return  "{"+
                "	\"signature\": \"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\","+
                "	\"certificate\": {"+
                "		\"issuer\": \"CN=TestCA,O=VTB\","+
                "		\"notAfter\": \"2026-07-28T14:41:50.000Z\","+
                "		\"notBefore\": \"2020-04-28T14:41:50.000Z\","+
                "		\"serialNumber\": \"40:50:19:90:04:DF:68:FB:4F:A6:82:35:5E:A8:40:AE\","+
                "		\"subject\": \"CN=0550300001,OU=External Users,O=JSC Vneshtorgbank,ST=MSK,C=RU\","+
                "		\"fingerprint\": \"2babe4379dbe965b1cfc73b09e55e062a9a70c17\""+
                "	},"+
                "	\"signTime\": \"2021-06-02T20:00:00.000Z\""+
                "}";
    }
}