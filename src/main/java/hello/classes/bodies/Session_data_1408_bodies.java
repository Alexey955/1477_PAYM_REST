package hello.classes.bodies;

public class Session_data_1408_bodies {
    public String getBodyGetSession(String ctxi, String mdmOsn, String mdmOsnClient, String mdmPkbClient) {
        return  "{"+
                "  \"user\": {"+
                "    \"activeClient\": {"+
                "      \"mdmOsnClient\": \"" + mdmOsnClient + "\","+
                "      \"mdmPkbClient\": \"" +mdmPkbClient + "\","+
                "      \"vtbBoIdClient\": 2014335"+
                "    },"+
                "    \"emails\": ["+
                "      {"+
                "        \"email\": \"test@wetc.b\","+
                "        \"emailType\": \"cm.EmailType.Personal\","+
                "        \"isTrusted\": true"+
                "      },"+
                "      {"+
                "        \"email\": \"test@wetc.b\","+
                "        \"emailType\": \"cm.EmailType.Personal\","+
                "        \"isTrusted\": false"+
                "      }"+
                "    ],"+
                "    \"firstName\": \"Виктор\","+
                "    \"ids\": {"+
                "      \"acUniqueClientNumber\": \"20061284\","+
                "      \"login\": \"AkopVnwm\","+
                "      \"mdmOsn\": \"" + mdmOsn + "\","+
                "      \"vtbBoIdUser\": 323920"+
                "    },"+
                "    \"lastName\": \"Акоп\","+
                "    \"middleName\": \"Витальевич\","+
                "    \"phones\": ["+
                "      {"+
                "        \"fullPhoneNumber\": \"968 6000000\","+
                "        \"phoneType\": \"cm.PhoneType.BCOmain\","+
                "        \"isTrusted\": true"+
                "      },"+
                "      {"+
                "        \"fullPhoneNumber\": \"968 6085870\","+
                "        \"phoneType\": \"cm.PhoneType.BCOmain\","+
                "        \"isTrusted\": true"+
                "      }"+
                "    ],"+
                "    \"position\": \"Директор\","+
                "    \"fingerprint\": null,"+
                "    \"boRSAfingerprint\": null"+
                "  },"+
                "  \"userClients\": ["+
                "    {"+
                "      \"mdmOsnClient\": \"" + mdmOsnClient + "\","+
                "      \"mdmPkbClient\": \"" + mdmPkbClient + "\","+
                "      \"vtbBoIdClient\": 2014335,"+
                "      \"addresses\": null,"+
                "      \"crossReferences\": ["+
                "        {"+
                "          \"expiredAt\": null,"+
                "          \"externalId\": \"21783520\","+
                "          \"system\": \"cm.SystemInstance.EID_VTB\""+
                "        },"+
                "        {"+
                "          \"expiredAt\": null,"+
                "          \"externalId\": \"2014335\","+
                "          \"system\": \"cm.SystemInstance.BCO\""+
                "        }"+
                "      ],"+
                "      \"isolated\": false,"+
                "      \"opf\": null,"+
                "      \"phones\": ["+
                "        {"+
                "          \"fullPhoneNumber\": \"8442 502851\","+
                "          \"phoneType\": \"cm.PhoneType.TelephoneOrganization\","+
                "          \"isTrusted\": true"+
                "        }"+
                "      ],"+
                "      \"emails\": null,"+
                "      \"orgInfo\": {"+
                "        \"shortName\": \"OOO ALEX\","+
                "        \"fullName\": \"OOO ALEX FULL\","+
                "        \"orgType\": null,"+
                "        \"okopf\": \"cm.OKOPF.124\","+
                "        \"kpp\": \"410101001\","+
                "        \"inn\": \"4101176294\","+
                "        \"kio\": \"\","+
                "        \"ogrn\": \"1164101055832\","+
                "        \"okpo\": \"03931199\","+
                "        \"bik\": \"\","+
                "        \"swift\": null,"+
                "        \"taxSystem\": \"\""+
                "      },"+
                "      \"userAuthority\": {"+
                "        \"role\": null,"+
                "        \"roles\": ["+
                "          \"admin\""+
                "        ],"+
                "        \"position\": \"Директор\","+
                "        \"eio\": true,"+
                "        \"signaturePos\": \"1\","+
                "        \"signMethod\": \"SMS_EDS\","+
                "        \"signatureExpired\": null,"+
                "        \"allowRead\": false,"+
                "        \"allowCreate\": false,"+
                "        \"allowEdit\": false,"+
                "        \"allowDelete\": false,"+
                "        \"allowSubmit\": false,"+
                "        \"allowRevoke\": false"+
                "      },"+
                "      \"servicePermissions\": {"+
                "        \"ib.profile\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.customs.services\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.open_next_account\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.main\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.market_campaigns.offers_carousel\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.ved.consulting\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.ved_currencycontrol\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.guaranties_expressguaranties_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.credits.express_credits_request\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.help\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.my_business_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.internet-buhgalteriya_moyo_delo_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.acquiring_tradeacquiring_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.acquiring\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.payment_orders\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.notifications.settings\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.credits.express_credit_request\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.payment_order_templates\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.cifra_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.customs.cards\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.upravlenie_torgovlej_mojsklad_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.business_cards\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.guarantees\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.constructor_dokumentov_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.notifications.settings_push\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.cash\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.deposits\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.customer_claims\": ["+
                "         \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.patentovanie_izobretenij_i_poleznyh_modelej_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.nb_services\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.orders.main_page_list\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.fx_conversion\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.notifications.settings_mobile_devices\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.credits_expresscredits_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.notifications.settings_sms\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.registraciya_tovarnogo_znaka_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.accounts.special\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.chatsmb\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.registraciya_programm_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.accounts\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.yuridicheskie_uslugi_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.product_list\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.statements.download\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.stories_list\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.tariff_management\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.acquiring_internetacquiring_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.internet-buhgalteriya_1sbiznesstart_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.banking_support\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.ved.swift_confirmation\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.loyalty_program\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.salary.cards\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.vnesenie_v_reestr_vashego_po_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ]"+
                "      }"+
                "    },"+
                "    {"+
                "      \"mdmOsnClient\": \"1540956952\","+
                "      \"mdmPkbClient\": null,"+
                "      \"vtbBoIdClient\": 2014332,"+
                "      \"addresses\": null,"+
                "      \"crossReferences\": ["+
                "        {"+
                "          \"expiredAt\": null,"+
                "          \"externalId\": \"21783327\","+
                "          \"system\": \"cm.SystemInstance.EID_VTB\""+
                "        },"+
                "        {"+
                "          \"expiredAt\": null,"+
                "          \"externalId\": \"21783601\","+
                "          \"system\": \"cm.SystemInstance.EID_VTB\""+
                "        },"+
                "        {"+
                "          \"expiredAt\": null,"+
                "          \"externalId\": \"7125499\","+
                "          \"system\": \"cm.SystemInstance.EID_VTB\""+
                "        },"+
                "        {"+
                "          \"expiredAt\": null,"+
                "          \"externalId\": \"2014332\","+
                "          \"system\": \"cm.SystemInstance.BCO\""+
                "        }"+
                "      ],"+
                "      \"isolated\": false,"+
                "      \"opf\": null,"+
                "      \"phones\": [],"+
                "      \"emails\": null,"+
                "      \"orgInfo\": {"+
                "        \"shortName\": \"OOO SPARTAK\","+
                "        \"fullName\": \"OOO SPARTAK FULL\","+
                "        \"orgType\": null,"+
                "        \"okopf\": \"\","+
                "        \"kpp\": \"540601001\","+
                "        \"inn\": \"5406810414\","+
                "        \"kio\": \"\","+
                "        \"ogrn\": \"1205400061680\","+
                "        \"okpo\": \"31044445\","+
                "        \"bik\": \"\","+
                "        \"swift\": null,"+
                "        \"taxSystem\": \"\""+
                "      },"+
                "      \"userAuthority\": {"+
                "        \"role\": null,"+
                "        \"roles\": ["+
                "          \"admin\""+
                "        ],"+
                "        \"position\": \"Директор\","+
                "        \"eio\": true,"+
                "        \"signaturePos\": \"1\","+
                "        \"signMethod\": \"SMS_EDS\","+
                "        \"signatureExpired\": null,"+
                "        \"allowRead\": false,"+
                "        \"allowCreate\": false,"+
                "        \"allowEdit\": false,"+
                "        \"allowDelete\": false,"+
                "        \"allowSubmit\": false,"+
                "        \"allowRevoke\": false"+
                "      },"+
                "      \"servicePermissions\": {"+
                "        \"ib.profile\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.customs.services\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.open_next_account\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.main\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.market_campaigns.offers_carousel\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.ved_currencycontrol\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.ved.consulting\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.guaranties_expressguaranties_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.help\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.credits.express_credits_request\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.my_business_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.internet-buhgalteriya_moyo_delo_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.acquiring_tradeacquiring_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.acquiring\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.payment_orders\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.notifications.settings\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.credits.express_credit_request\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.cifra_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.payment_order_templates\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.customs.cards\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.upravlenie_torgovlej_mojsklad_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.business_cards\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.guarantees\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.constructor_dokumentov_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.notifications.settings_push\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.cash\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.deposits\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.customer_claims\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.patentovanie_izobretenij_i_poleznyh_modelej_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.nb_services\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.orders.main_page_list\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.fx_conversion\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.notifications.settings_mobile_devices\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.credits_expresscredits_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.notifications.settings_sms\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.registraciya_tovarnogo_znaka_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.accounts.special\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.registraciya_programm_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.chatsmb\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.accounts\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.yuridicheskie_uslugi_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.product_list\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.statements.download\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.stories_list\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.tariff_management\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.acquiring_internetacquiring_marketplace\": ["+
                "         \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.internet-buhgalteriya_1sbiznesstart_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.banking_support\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.ved.swift_confirmation\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.salary.cards\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.loyalty_program\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ],"+
                "        \"ib.marketplace.vnesenie_v_reestr_vashego_po_marketplace\": ["+
                "          \"allow_read\","+
                "          \"allow_revoke\","+
                "          \"allow_submit\","+
                "          \"allow_create\","+
                "          \"allow_edit\","+
                "          \"allow_delete\","+
                "          \"full_access\""+
                "        ]"+
                "      }"+
                "    }"+
                "  ],"+
                "  \"sessionId\": \"" + ctxi + "\","+
                "  \"firstFactor\": \"LOGIN\""+
                "}";
    }

    public String getSession(String mdmOsn){
        return "{"+
                "	\"user\": {"+
                "		\"activeClient\": {"+
                "			\"mdmOsnClient\": \""+mdmOsn+"\","+
                "			\"mdmPkbClient\": \"1234517659823\","+
                "			\"vtbBoIdClient\": 2014335"+
                "		},"+
                "		\"emails\": ["+
                "			{"+
                "				\"email\": \"test@wetc.b\","+
                "				\"emailType\": \"cm.EmailType.Personal\","+
                "				\"isTrusted\": true"+
                "			},"+
                "			{"+
                "				\"email\": \"test@wetc.b\","+
                "				\"emailType\": \"cm.EmailType.Personal\","+
                "				\"isTrusted\": false"+
                "			}"+
                "		],"+
                "		\"firstName\": \"??????\","+
                "		\"ids\": {"+
                "			\"acUniqueClientNumber\": \"20061284\","+
                "			\"login\": \"AkopVnwm\","+
                "			\"mdmOsn\": \""+mdmOsn+"\","+
                "			\"vtbBoIdUser\": 323920"+
                "		},"+
                "		\"lastName\": \"????\","+
                "		\"middleName\": \"??????????\","+
                "		\"phones\": ["+
                "			{"+
                "				\"fullPhoneNumber\": \"968 6000000\","+
                "				\"phoneType\": \"cm.PhoneType.BCOmain\","+
                "				\"isTrusted\": true"+
                "			},"+
                "			{"+
                "				\"fullPhoneNumber\": \"968 6085870\","+
                "				\"phoneType\": \"cm.PhoneType.BCOmain\","+
                "				\"isTrusted\": true"+
                "			}"+
                "		],"+
                "		\"position\": \"????????\","+
                "		\"fingerprint\": null,"+
                "		\"boRSAfingerprint\": null"+
                "	},"+
                "	\"userClients\": ["+
                "		{"+
                "			\"mdmOsnClient\": \""+mdmOsn+"\","+
                "			\"mdmPkbClient\": \"1234517659823\","+
                "			\"vtbBoIdClient\": 2014335,"+
                "			\"addresses\": null,"+
                "			\"crossReferences\": ["+
                "				{"+
                "					\"expiredAt\": null,"+
                "					\"externalId\": \"21783520\","+
                "					\"system\": \"cm.SystemInstance.EID_VTB\""+
                "				},"+
                "				{"+
                "					\"expiredAt\": null,"+
                "					\"externalId\": \"2014335\","+
                "					\"system\": \"cm.SystemInstance.BCO\""+
                "				}"+
                "			],"+
                "			\"isolated\": false,"+
                "			\"opf\": null,"+
                "			\"phones\": ["+
                "				{"+
                "					\"fullPhoneNumber\": \"8442 502851\","+
                "					\"phoneType\": \"cm.PhoneType.TelephoneOrganization\","+
                "					\"isTrusted\": true"+
                "				}"+
                "			],"+
                "			\"emails\": null,"+
                "			\"orgInfo\": {"+
                "				\"shortName\": \"??? \\\"??????????\\\"\","+
                "				\"fullName\": \"???????? ? ???????????? ???????????????? \\\"??????????\\\"\","+
                "				\"orgType\": null,"+
                "				\"okopf\": \"cm.OKOPF.124\","+
                "				\"kpp\": \"410101001\","+
                "				\"inn\": \"4101176294\","+
                "				\"kio\": \"\","+
                "				\"ogrn\": \"1164101055832\","+
                "				\"okpo\": \"03931199\","+
                "				\"bik\": \"\","+
                "				\"swift\": null,"+
                "				\"taxSystem\": \"\""+
                "			},"+
                "			\"userAuthority\": {"+
                "				\"role\": null,"+
                "				\"roles\": ["+
                "					\"admin\""+
                "				],"+
                "				\"position\": \"????????\","+
                "				\"eio\": true,"+
                "				\"signaturePos\": \"1\","+
                "				\"signMethod\": \"SMS_EDS\","+
                "				\"signatureExpired\": null,"+
                "				\"allowRead\": false,"+
                "				\"allowCreate\": false,"+
                "				\"allowEdit\": false,"+
                "				\"allowDelete\": false,"+
                "				\"allowSubmit\": false,"+
                "				\"allowRevoke\": false"+
                "			},"+
                "			\"servicePermissions\": {"+
                "				\"ib.profile\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.customs.services\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.open_next_account\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.main\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.market_campaigns.offers_carousel\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.ved.consulting\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.ved_currencycontrol\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.marketplace.guaranties_expressguaranties_marketplace\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.credits.express_credits_request\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.help\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.marketplace.my_business_marketplace\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.marketplace.internet-buhgalteriya_moyo_delo_marketplace\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.marketplace.acquiring_tradeacquiring_marketplace\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.acquiring\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.payment_orders\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.notifications.settings\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.credits.express_credit_request\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.payment_order_templates\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.marketplace.cifra_marketplace\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.customs.cards\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.marketplace.upravlenie_torgovlej_mojsklad_marketplace\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.business_cards\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.guarantees\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.marketplace.constructor_dokumentov_marketplace\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.notifications.settings_push\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.cash\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.deposits\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.customer_claims\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.marketplace.patentovanie_izobretenij_i_poleznyh_modelej_marketplace\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.nb_services\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.orders.main_page_list\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.fx_conversion\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.notifications.settings_mobile_devices\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.marketplace.credits_expresscredits_marketplace\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.notifications.settings_sms\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.marketplace.registraciya_tovarnogo_znaka_marketplace\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.accounts.special\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.chatsmb\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.marketplace.registraciya_programm_marketplace\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.accounts\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.marketplace.yuridicheskie_uslugi_marketplace\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.marketplace.product_list\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.statements.download\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.marketplace.stories_list\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.tariff_management\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.marketplace.acquiring_internetacquiring_marketplace\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.marketplace.internet-buhgalteriya_1sbiznesstart_marketplace\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.banking_support\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.ved.swift_confirmation\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.loyalty_program\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.salary.cards\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				],"+
                "				\"ib.marketplace.vnesenie_v_reestr_vashego_po_marketplace\": ["+
                "					\"allow_read\","+
                "					\"allow_revoke\","+
                "					\"allow_submit\","+
                "					\"allow_create\","+
                "					\"allow_edit\","+
                "					\"allow_delete\","+
                "					\"full_access\""+
                "				]"+
                "			}"+
                "		}"+
                "	],"+
                "	\"sessionId\": \"12345678-d93b-4426-9526-dbbaaf5377ab\","+
                "	\"firstFactor\": \"LOGIN\""+
                "}";
    }

    public String postValidate(){

        return "{"+
                "	\"result\": {"+
                "		\"success\": \"true\","+
                "		\"signTime\": \"2021-09-07T09:21:58\","+
                "		\"certificate\": {"+
                "			\"serialNumber\": \"014E03070930012002066E\","+
                "			\"issuer\": \"/C=RU/L=МОСКВА/O=Банк ВТБ (ПАО)/CN=ТЕСТ УЦ Банк ВТБ (ПАО)/Email=GKZI@vtb24.ru\","+
                "			\"subject\": \"/C=RU/OU=БКО/CN=Тестовый Пользователь Платежей/Email=akarlova@vtb.ru\","+
                "			\"notBefore\": \"Mar 18 14:06:40 2021 GMT\","+
                "			\"notAfter\": \"Mar 18 14:06:40 2023 GMT\""+
                "		}"+
                "	}"+
                "}";
    }

    public String putSessionAccounts(){
        return "";
    }
}
