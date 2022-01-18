package hello.classes.bodies;

public class SPM_408_bodies {
    public String getBodypostAdaptiveAuthentication() {
        return  "<s:Envelope xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\">"+
                "	<s:Body xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">"+
                "		<ns1:analyzeResponse xmlns:ns1=\"http://ws.csd.rsa.com\" xmlns:ns2=\"http://ws.kba.csd.rsa.com\" xmlns:ns4=\"http://ws.oobgen.csd.rsa.com\" xmlns:ns3=\"http://ws.oobsms.csd.rsa.com\">"+
                "			<response>"+
                "				<ns1:identificationData>"+
                "					<ns1:delegated>false</ns1:delegated>"+
                "					<ns1:transactionId>fff7-:da08a887d31:9d4d0296-_TRX</ns1:transactionId>"+
                "					<ns1:userLoginName>user38</ns1:userLoginName>"+
                "					<ns1:userName>user38</ns1:userName>"+
                "					<ns1:userStatus>NOTENROLLED</ns1:userStatus>"+
                "					<ns1:userType>NONPERSISTENT</ns1:userType>"+
                "				</ns1:identificationData>"+
                "				<ns1:statusHeader>"+
                "					<ns1:reasonCode>0</ns1:reasonCode>"+
                "					<ns1:reasonDescription>Operations were completed successfully</ns1:reasonDescription>"+
                "					<ns1:statusCode>200</ns1:statusCode>"+
                "				</ns1:statusHeader>"+
                "				<ns1:riskResult>"+
                "					<ns1:riskScore>1000</ns1:riskScore>"+
                "					<ns1:riskScoreBand>SCORE_BAND_4</ns1:riskScoreBand>"+
                "					<ns1:triggeredRule>"+
                "						<ns1:actionCode>ALLOW</ns1:actionCode>"+
                "						<ns1:actionName>1. Black lists: payee account</ns1:actionName>"+
                "						<ns1:actionType>STRICT</ns1:actionType>"+
                "						<ns1:clientFactList/>"+
                "						<ns1:ruleId>1. Black lists: payee account</ns1:ruleId>"+
                "						<ns1:ruleName>1. Black lists: payee account</ns1:ruleName>"+
                "						<ns1:ruleRecommendation>Antifraud_Рекомендация||SC_Рекомендация</ns1:ruleRecommendation>"+
                "						<ns1:delay>120||120</ns1:delay>"+
                "						<ns1:defaultResolution>ALLOW||ALLOW</ns1:defaultResolution>"+
                "					</ns1:triggeredRule>"+
                "				</ns1:riskResult>"+
                "			</response>"+
                "		</ns1:analyzeResponse>"+
                "	</s:Body>"+
                "</s:Envelope>";
    }
}
