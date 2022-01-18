package hello.classes.bodies;

public class ULBS_BS205_bodies {

    public String getBodyGetAccounts(String EBMID, String CreationDateTime, String SenderMessageID,
                                     String account_result_1, String account_result_2, String account_result_3,String account_result_4,String account_result_5){

        return  "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\">"+
                "	<SOAP-ENV:Header xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" name=\"GetOrganizationAccountListResponseEBM\">"+
                "   </SOAP-ENV:Header>"+
                "   <SOAP-ENV:Body>"+
                "		<GetOrganizationAccountListResponseEBM xmlns=\"http://www.vtb24.ru/EnterpriseObjectLibrary/Business/Common/Services/OrganizationAccount/V1\" xmlns:ns2=\"www.mbank.ru/CitTypes\" xmlns:ns4=\"www.mbank.ru/Account\" xmlns:ns3=\"www.mbank.ru/Document\" xmlns:ns6=\"http://www.vtb24.ru/EnterpriseObjectLibrary/Core/Common/V1\" xmlns:bs=\"http://www.mbank.ru/OrganizationAccountBS/V1\" xmlns:ns5=\"www.mbank.ru/Client\" xmlns:ns8=\"http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2\" xmlns:ns7=\"urn:oasis:names:tc:xacml:2.0:context:schema:cd:04\" xmlns:wsdl=\"http://schemas.xmlsoap.org/wsdl/\" xmlns:ns13=\"http://www.vtb24.ru/EnterpriseObjectLibrary/Business/Common/Model/CustomerParty/V1\" xmlns:ns12=\"http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2\" xmlns:ns9=\"http://www.vtb24.ru/EnterpriseObjectLibrary/Business/Common/Model/BankAccount/V1\" xmlns:ns11=\"urn:oasis:names:tc:xacml:2.0:policy:schema:cd:04\" xmlns:ns10=\"http://schemas.xmlsoap.org/ws/2003/03/addressing\" xmlns:flt=\"http://www.vtb24.ru/ULBSM/Common/V1\" xmlns:tns=\"http://www.vtb24.ru/ApplicationConnectorServiceLibrary/MBANK/Providers/OrganizationAccountMBANKProvA/V1\" xmlns:http=\"http://schemas.xmlsoap.org/wsdl/http/\" xmlns:rq=\"http://www.mbank.ru/ApplicationObjectLibrary/MBANK/Providers/OrganizationAccountMBANKProvA/V1/Request\" xmlns:ns1=\"http://www.vtb24.ru/EnterpriseObjectLibrary/Business/Common/Services/OrganizationAccount/V1\">"+
                "			<ns12:EBMHeader>"+
                "				<ns12:EBMID>" + EBMID + "</ns12:EBMID>"+
                "				<ns12:CreationDateTime>" + CreationDateTime + "</ns12:CreationDateTime>"+
                "				<ns12:Sender>"+
                "					<ns12:ID>cm.SystemInstance.SMELoansSBOS</ns12:ID>"+
                "					<ns12:SenderMessageID>" + SenderMessageID + "</ns12:SenderMessageID>"+
                "				</ns12:Sender>"+
                "			</ns12:EBMHeader>"+
                "			<ns1:DataArea>"+
                "				<ns1:BankAccountList>"+
                "					<ns9:BankAccount>"+
                "						<ns9:AccountID>"+
                "							<ns6:ID>" + account_result_1 + "</ns6:ID>"+
                "							<ns6:ContextCode>MBANK</ns6:ContextCode>"+
                "						</ns9:AccountID>"+
                "						<ns9:CurrencyCode>cm.Currency.643</ns9:CurrencyCode>"+
                "						<ns9:AssigningAccounts name=\"расчетный счет\">cm.AccountType.Checking</ns9:AssigningAccounts>"+
                "						<ns6:Status>"+
                "							<ns6:Code>cm.BankAccountStatus.Active</ns6:Code>"+
                "						</ns6:Status>"+
                "						<ns9:OpenDate>2020-07-22</ns9:OpenDate>"+
                "						<ns9:AvailableBalanceAmount>"+
                "							<ns6:Amount>104000.0</ns6:Amount>"+
                "							<ns6:BalanceDateTime>2020-12-01</ns6:BalanceDateTime>"+
                "						</ns9:AvailableBalanceAmount>"+
                "						<ns6:OrganizationUnit>"+
                "							<ns6:OrganizationUnitIdentidication>50293282</ns6:OrganizationUnitIdentidication>"+
                "							<ns6:OrganizationUnitBranchIdentidication>cm.SystemInstance.BQ00000</ns6:OrganizationUnitBranchIdentidication>"+
                "						</ns6:OrganizationUnit>"+
                "						<ns9:SourceSystem>cm.SystemInstance.MBANK</ns9:SourceSystem>"+
                "					</ns9:BankAccount>"+
                "					<ns1:BankContract>"+
                "						<ns6:ContractID>"+
                "							<ns6:ID>" + account_result_1 + "</ns6:ID>"+
                "						</ns6:ContractID>"+
                "						<ns6:OpenDate>2020-07-22</ns6:OpenDate>"+
                "					</ns1:BankContract>"+
                "				</ns1:BankAccountList>"+
                "				<ns1:BankAccountList>"+
                "					<ns9:BankAccount>"+
                "						<ns9:AccountID>"+
                "							<ns6:ID>" + account_result_2 + "</ns6:ID>"+
                "							<ns6:ContextCode>MBANK</ns6:ContextCode>"+
                "						</ns9:AccountID>"+
                "						<ns9:CurrencyCode>cm.Currency.643</ns9:CurrencyCode>"+
                "						<ns9:AssigningAccounts name=\"ООО &quot;Сибэлмаш&quot;\">cm.AccountType.Checking</ns9:AssigningAccounts>"+
                "						<ns6:Status>"+
                "							<ns6:Code>cm.BankAccountStatus.Active</ns6:Code>"+
                "						</ns6:Status>"+
                "						<ns9:OpenDate>2016-06-02</ns9:OpenDate>"+
                "						<ns9:AvailableBalanceAmount>"+
                "							<ns6:Amount>0.0</ns6:Amount>"+
                "							<ns6:BalanceDateTime>2020-12-01</ns6:BalanceDateTime>"+
                "						</ns9:AvailableBalanceAmount>"+
                "						<ns6:OrganizationUnit>"+
                "							<ns6:OrganizationUnitIdentidication>50293282</ns6:OrganizationUnitIdentidication>"+
                "							<ns6:OrganizationUnitBranchIdentidication>cm.SystemInstance.BQ00000</ns6:OrganizationUnitBranchIdentidication>"+
                "						</ns6:OrganizationUnit>"+
                "						<ns9:SourceSystem>cm.SystemInstance.MBANK</ns9:SourceSystem>"+
                "					</ns9:BankAccount>"+
                "					<ns1:BankContract>"+
                "						<ns6:ContractID>"+
                "							<ns6:ID>16.03477</ns6:ID>"+
                "						</ns6:ContractID>"+
                "						<ns6:OpenDate>2016-06-02</ns6:OpenDate>"+
                "					</ns1:BankContract>"+
                "				</ns1:BankAccountList>"+
                "				<ns1:BankAccountList>"+
                "					<ns9:BankAccount>"+
                "						<ns9:AccountID>"+
                "							<ns6:ID>" + account_result_3 + "</ns6:ID>"+
                "							<ns6:ContextCode>MBANK</ns6:ContextCode>"+
                "						</ns9:AccountID>"+
                "						<ns9:CurrencyCode>cm.Currency.643</ns9:CurrencyCode>"+
                "						<ns9:AssigningAccounts name=\"расчетный счет\">cm.AccountType.Checking</ns9:AssigningAccounts>"+
                "						<ns6:Status>"+
                "							<ns6:Code>cm.BankAccountStatus.Active</ns6:Code>"+
                "						</ns6:Status>"+
                "						<ns9:OpenDate>2020-07-22</ns9:OpenDate>"+
                "						<ns9:AvailableBalanceAmount>"+
                "							<ns6:Amount>104000.0</ns6:Amount>"+
                "							<ns6:BalanceDateTime>2020-12-01</ns6:BalanceDateTime>"+
                "						</ns9:AvailableBalanceAmount>"+
                "						<ns6:OrganizationUnit>"+
                "							<ns6:OrganizationUnitIdentidication>50293282</ns6:OrganizationUnitIdentidication>"+
                "							<ns6:OrganizationUnitBranchIdentidication>cm.SystemInstance.BQ00000</ns6:OrganizationUnitBranchIdentidication>"+
                "						</ns6:OrganizationUnit>"+
                "						<ns9:SourceSystem>cm.SystemInstance.MBANK</ns9:SourceSystem>"+
                "					</ns9:BankAccount>"+
                "					<ns1:BankContract>"+
                "						<ns6:ContractID>"+
                "							<ns6:ID>" + account_result_3 + "</ns6:ID>"+
                "						</ns6:ContractID>"+
                "						<ns6:OpenDate>2020-07-22</ns6:OpenDate>"+
                "					</ns1:BankContract>"+
                "				</ns1:BankAccountList>"+
                "				<ns1:BankAccountList>"+
                "					<ns9:BankAccount>"+
                "						<ns9:AccountID>"+
                "							<ns6:ID>" + account_result_4 + "</ns6:ID>"+
                "							<ns6:ContextCode>MBANK</ns6:ContextCode>"+
                "						</ns9:AccountID>"+
                "						<ns9:CurrencyCode>cm.Currency.643</ns9:CurrencyCode>"+
                "						<ns9:AssigningAccounts name=\"расчетный счет\">cm.AccountType.Checking</ns9:AssigningAccounts>"+
                "						<ns6:Status>"+
                "							<ns6:Code>cm.BankAccountStatus.Active</ns6:Code>"+
                "						</ns6:Status>"+
                "						<ns9:OpenDate>2020-07-22</ns9:OpenDate>"+
                "						<ns9:AvailableBalanceAmount>"+
                "							<ns6:Amount>104000.0</ns6:Amount>"+
                "							<ns6:BalanceDateTime>2020-12-01</ns6:BalanceDateTime>"+
                "						</ns9:AvailableBalanceAmount>"+
                "						<ns6:OrganizationUnit>"+
                "							<ns6:OrganizationUnitIdentidication>50293282</ns6:OrganizationUnitIdentidication>"+
                "							<ns6:OrganizationUnitBranchIdentidication>cm.SystemInstance.BQ00000</ns6:OrganizationUnitBranchIdentidication>"+
                "						</ns6:OrganizationUnit>"+
                "						<ns9:SourceSystem>cm.SystemInstance.MBANK</ns9:SourceSystem>"+
                "					</ns9:BankAccount>"+
                "					<ns1:BankContract>"+
                "						<ns6:ContractID>"+
                "							<ns6:ID>" + account_result_4 + "</ns6:ID>"+
                "						</ns6:ContractID>"+
                "						<ns6:OpenDate>2020-07-22</ns6:OpenDate>"+
                "					</ns1:BankContract>"+
                "				</ns1:BankAccountList>"+
                "				<ns1:BankAccountList>"+
                "					<ns9:BankAccount>"+
                "						<ns9:AccountID>"+
                "							<ns6:ID>" + account_result_5 + "</ns6:ID>"+
                "							<ns6:ContextCode>MBANK</ns6:ContextCode>"+
                "						</ns9:AccountID>"+
                "						<ns9:CurrencyCode>cm.Currency.643</ns9:CurrencyCode>"+
                "						<ns9:AssigningAccounts name=\"расчетный счет\">cm.AccountType.Checking</ns9:AssigningAccounts>"+
                "						<ns6:Status>"+
                "							<ns6:Code>cm.BankAccountStatus.Active</ns6:Code>"+
                "						</ns6:Status>"+
                "						<ns9:OpenDate>2020-07-22</ns9:OpenDate>"+
                "						<ns9:AvailableBalanceAmount>"+
                "							<ns6:Amount>104000.0</ns6:Amount>"+
                "							<ns6:BalanceDateTime>2020-12-01</ns6:BalanceDateTime>"+
                "						</ns9:AvailableBalanceAmount>"+
                "						<ns6:OrganizationUnit>"+
                "							<ns6:OrganizationUnitIdentidication>50293282</ns6:OrganizationUnitIdentidication>"+
                "							<ns6:OrganizationUnitBranchIdentidication>cm.SystemInstance.BQ00000</ns6:OrganizationUnitBranchIdentidication>"+
                "						</ns6:OrganizationUnit>"+
                "						<ns9:SourceSystem>cm.SystemInstance.MBANK</ns9:SourceSystem>"+
                "					</ns9:BankAccount>"+
                "					<ns1:BankContract>"+
                "						<ns6:ContractID>"+
                "							<ns6:ID>" + account_result_5 + "</ns6:ID>"+
                "						</ns6:ContractID>"+
                "						<ns6:OpenDate>2020-07-22</ns6:OpenDate>"+
                "					</ns1:BankContract>"+
                "				</ns1:BankAccountList>"+
                "			</ns1:DataArea>"+
                "		</GetOrganizationAccountListResponseEBM>"+
                "	</SOAP-ENV:Body>"+
                "</SOAP-ENV:Envelope>";
    }
}
