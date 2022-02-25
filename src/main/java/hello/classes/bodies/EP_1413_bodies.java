package hello.classes.bodies;

public class EP_1413_bodies {
    public String getBodyPostValidate(String issuerNum) {
        return "{"+
                "	\"certificate\": {"+
                "		\"issuer\": \"issuer" + issuerNum + "\","+
                "		\"notAfter\": \"2022-02-02T10:06:14.972717\","+
                "		\"notBefore\": \"2022-01-18T10:06:14.972780\","+
                "		\"serialNumber\": \"100" + issuerNum + "\","+
                "		\"subject\": \"issuer" + issuerNum + "\","+
                "		\"fingerprint\": \"lkshgfuafkm\""+
                "	}"+
                "}";
    }

    public String getBodyGetCertIssuer(String issuer, String serialNumber, String userId) {
        return "{"+
                "	\"issuer\": \"" + issuer + "\","+
                "	\"serialNumber\": \"" + serialNumber + "\","+
                "	\"certificate\": \"certificateData\","+
                "	\"subject\": \"userIssuer\","+
                "	\"commonName\": \"certificate name\","+
                "	\"validFrom\": \"2022-01-18T10:06:15\","+
                "	\"validTo\": \"2023-02-02T10:06:15\","+
                "	\"status\": \"VALID\","+
                "	\"statusDetails\": {"+
                "		\"isRevoked\": false,"+
                "		\"isExpired\": false,"+
                "		\"invalidSignature\": false,"+
                "		\"notActiveYet\": false"+
                "	},"+
                "	\"keyAlgorithm\": \"SHA-256\","+
                "	\"signatureAlgorithm\": \"SHA-256\","+
                "	\"sha1\": \"sha1\","+
                "	\"userId\": \"" + userId + "\""+
                "}";
    }

    public String getBodyPostTechToken() {
        return "{"+
                "	\"access_token\": \"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMDAwMDAwMDAxIiwic2ZhY3RvciI6InNtcyIsIm1ldGhvZCI6ImxvZ2luIiwiY2hhbm5lbCI6IklCIiwicmVhbG0iOiIvc3RhZmYiLCJjdHhpIjoiMTAwMDAwMDEtMDliNy00OGY3LTlmZTYtNzU3ZWFmYjlmOTA2IiwiaXNzIjoiU01CSUIiLCJpYXQiOjE2MDU2ODczMTksImp0aSI6IllNN0JBbmJYRnNTb1NjanBVMUpqIiwiZXhwIjoxNzE1NjYyMTgwfT09.Ohg51pHbUTX0snRL5MAPIDoINFxaa9nQ5DIyu6_gpKs\","+
                "	\"expires_in\": \"3600\","+
                "	\"token_type\": \"Bearer\""+
                "}";
    }
}
