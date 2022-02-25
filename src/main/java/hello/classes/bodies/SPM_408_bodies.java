package hello.classes.bodies;

public class SPM_408_bodies {
    public String getBodypostAdaptiveAuthentication() {
        return  "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">"+
                "	<soapenv:Body>"+
                "		<ns1:analyzeResponse xmlns:ns1=\"http://ws.csd.rsa.com\">"+
                "			<ns1:analyzeReturn xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ns1:AnalyzeResponse\">"+
                "				<ns1:deviceResult>"+
                "					<ns1:authenticationResult>"+
                "						<ns1:authStatusCode>SUCCESS</ns1:authStatusCode>"+
                "						<ns1:risk>0</ns1:risk>"+
                "					</ns1:authenticationResult>"+
                "					<ns1:callStatus>"+
                "						<ns1:statusCode>SUCCESS</ns1:statusCode>"+
                "						<ns1:statusDescription/>"+
                "					</ns1:callStatus>"+
                "					<ns1:deviceData>"+
                "						<ns1:bindingType>HARD_BIND</ns1:bindingType>"+
                "						<ns1:deviceTokenCookie>QrvLCxjzvWBSQuQuXtXaAMMpIgZzHoMB</ns1:deviceTokenCookie>"+
                "						<ns1:deviceTokenFSO>QrvLCxjzvWBSQuQuXtXaAMMpIgZzHoMB</ns1:deviceTokenFSO>"+
                "						<ns1:lookupLabel>No Label</ns1:lookupLabel>"+
                "					</ns1:deviceData>"+
                "				</ns1:deviceResult>"+
                "				<ns1:identificationData>"+
                "					<ns1:clientTransactionId>35a71e9a-0669-4d09-8ebe-ddcc3ddfe95b</ns1:clientTransactionId>"+
                "					<ns1:delegated>false</ns1:delegated>"+
                "					<ns1:orgName>CORPORATE</ns1:orgName>"+
                "					<ns1:transactionId>ff93d4e0622a431683b7fe8898f347b9</ns1:transactionId>"+
                "					<ns1:userLoginName>Testiptk</ns1:userLoginName>"+
                "					<ns1:userName>PKBUL1540952112</ns1:userName>"+
                "					<ns1:userStatus>UNVERIFIED</ns1:userStatus>"+
                "					<ns1:userType>PERSISTENT</ns1:userType>"+
                "				</ns1:identificationData>"+
                "				<ns1:messageHeader>"+
                "					<ns1:apiType>DIRECT_SOAP_API</ns1:apiType>"+
                "					<ns1:requestType>ANALYZE</ns1:requestType>"+
                "					<ns1:timeStamp>2021-11-18 17:07:32.849</ns1:timeStamp>"+
                "					<ns1:version>7.0</ns1:version>"+
                "				</ns1:messageHeader>"+
                "				<ns1:statusHeader>"+
                "					<ns1:reasonCode>0</ns1:reasonCode>"+
                "					<ns1:reasonDescription>Operations were completed successfully</ns1:reasonDescription>"+
                "					<ns1:statusCode>200</ns1:statusCode>"+
                "				</ns1:statusHeader>"+
                "				<ns1:deviceManagementResponse>"+
                "					<ns1:acspAccountId>PKBUL1540952112@CORPORATE</ns1:acspAccountId>"+
                "					<ns1:callStatus>"+
                "						<ns1:statusCode>SUCCESS</ns1:statusCode>"+
                "						<ns1:statusDescription/>"+
                "					</ns1:callStatus>"+
                "					<ns1:deviceData>"+
                "						<ns1:bindingType>HARD_BIND</ns1:bindingType>"+
                "						<ns1:lookupLabel>No Label</ns1:lookupLabel>"+
                "					</ns1:deviceData>"+
                "				</ns1:deviceManagementResponse>"+
                "				<ns1:riskResult>"+
                "					<ns1:riskScore>0</ns1:riskScore>"+
                "					<ns1:riskScoreBand>SCORE_BAND_0</ns1:riskScoreBand>"+
                "					<ns1:triggeredRule>"+
                "						<ns1:actionCode>ALLOW</ns1:actionCode>"+
                "						<ns1:actionName>ALLOW</ns1:actionName>"+
                "						<ns1:actionType>STRICT</ns1:actionType>"+
                "						<ns1:clientFactList/>"+
                "						<ns1:ruleId>FALLBACK RULE</ns1:ruleId>"+
                "						<ns1:ruleName>FALLBACK RULE</ns1:ruleName>"+
                "					</ns1:triggeredRule>"+
                "				</ns1:riskResult>"+
                "			</ns1:analyzeReturn>"+
                "		</ns1:analyzeResponse>"+
                "	</soapenv:Body>"+
                "</soapenv:Envelope>";
    }

    public String getBodypostAdaptiveAuthentication_old() {
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
