package com.production.qtickets.utils;

import com.production.qtickets.R;

/**
 * Created by hemanth on 4/9/2018.
 */

public class AppConstants {

    public static final String Authorization_QT5 = "c3fcd3d76192e4007dfb496cca67e13b";
    public static final String AppSource = "3";
    public static final String SERVER_BASE_URL = "https://api.q-tickets.com/V5.0/";
    public static final String COUNTRY_LIST_API = "https://api.q-tickets.com/V3.0/getqticketscountries";
    public static final String CMS_PAGE_URL = "http://api.q-tickets.com/V2.0/";

    public static final String SERVICE_URL_GET_USER_LOGIN = SERVER_BASE_URL + "loginmobile?";
    public static final String SERVICE_URL_GET_USER_REGISTRATION = SERVER_BASE_URL + "Registration?";
    public static final String SERVICE_URL_GET_HOMEPAGELOGOS = SERVER_BASE_URL + "gethomepagelogos";
    public static final String SERVICE_URL_GET_HOMEMOVIELIST = SERVER_BASE_URL + "getmoviesjson";
    public static final String SERVICE_URL_GET_HOMEEVENTLIST = SERVER_BASE_URL + "getalleventsdetailsbycountryjson?Country=";
    public static final String CMS_PAGES_URL = CMS_PAGE_URL + "getcmsjson";
    public static final String SERVICE_URL_MY_PROFILE = SERVER_BASE_URL + "profileupdationjson?";
    public static final String EVENTBOOKINGFAILEDURL = "https://events.q-tickets.com/eventbookingfailed";
    public static final String IPAY_MOVIE_FAILEDURL = "eventbookingfailed";
    public static final String IPAY_MOVIE_FAILEDURL22 = "https://www.q-tickets.com/booking/failedbookingipay";

    public static final String EVENTBOOKINGFAILEDURL22 = "eventbookingfailed";
    public static final String EVENTBOOKINGSUCESS = "https://events.q-tickets.com/eventbookingsuccess";


    public static final String EVENTBOOKINGSUCESS22 = "eventbookingsuccess";
    public static final String QTICKETSURL = "https://q-tickets.com/";
    public static final String EVENTSSURL = "https://events.q-tickets.com/Events";
    public static final String PAYMENTSUMMARY = "https://events.q-tickets.com/PaymentSummary";
    public static final String MOVIE_PAYMENT_CANCEL = "https://q-tickets.com/?result=movie";
    public static final String MOVIE_PAYMENT_CANCEL1 = "https://q-tickets.com/?result=movies";
    public static final String TIMEOUT = "action-timeout";
    public static final String EVENT_PAYMENT_CANCEL = "https://q-tickets.com/?result=event";
    //Email pattern
    public static final String REGEX_EMAIL_ADDRESS = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,64}$";
    //com.production.qtickets.login
    public static final Integer LOGIN = 1000;
    public static final String url = "http://buytickets.me/Flikcinema/Movies";

    public static final String SHARED_EVENTS_TICKET_PRICES = "SHARED_EVENTS_TICKET_PRICES";
    public static final String COUNTRY_TYPE_CURRENCY = "COUNTRY_TYPE";
    public static final String TICKET_FIELDS = "TICKET_FIELDS";

    public static final String TOTAL_TICKET_COUNT = "TOTAL_TICKET_COUNT";
    public static final String TOTAL_TICKET_COST = "TOTAL_TICKET_COST";
    public static final String TICKET_PRICE_ID_COUNT = "TICKET_PRICE_ID_COUNT";
    public static String blockCharacterSet = "÷×=%_-+#().,^[~#^|$%&*!]*~#^|$%&*!1234567890/*!@#$%^&*(){}_[]|?/<>,.:-'';§£¥.€€€₩cc\"₩";
 // sobia changes
    public static final String EVENT_ID = "EVENT_ID";
    public static final String BOAT_TYPE = "BOAT_TYPE";

    public static final String IS_PROMO_COUPON = "is_promo_code";
    public static final String IS_COUPON_CODE = "is_cupon_code";


    public static final String TOTAL_COUNT = "TOTAL_COUNT";
    public static final String TOTAL_PRICE = "TOTAL_PRICE";
    public static final String TOTAL_SERVICEPRICE_EVENT = "TOTAL_SERVICEPRICE_EVENT";
    public static final String EVENET_SELECTED_DATE = "EVENET_SELECTED_DATE";

    //novocinema username and password
    public static String user_name = "rajanpathak";
    public static String password = "QkhwnKLs";
    public static final String novo_country_id = "2";

    public static String PDF_FILES_ENABLE = "1";
    public static String PNG_FILES_ENABLE = "2";
    public static String JPG_FILES_ENABLE = "3";
    public static String XLS_FILES_ENABLE = "4";
    public static String DOC_FILES_ENABLE = "5";
    public static String TXT_FILES_ENABLE = "6";


    public static String[] country_code = {
            "+974",
            "+91",
            "+973",
            "+971",
            "+968",
            "+93",
            "+355",
            "+213",
            "+376",
            "+244",
            "+672",
            "+54",
            "+374",
            "+297",
            "+61",
            "+43",
            "+994",
            "+880",
            "+375",
            "+32",
            "+501",
            "+229",
            "+975",
            "+591",
            "+387",
            "+267",
            "+55",
            "+673",
            "+359",
            "+226",
            "+95",
            "+257",
            "+855",
            "+237",
            "+1",
            "+238",
            "+236",
            "+235",
            "+56",
            "+86",
            "+61",
            "+57",
            "+269",
            "+242",
            "+243",
            "+682",
            "+506",
            "+385",
            "+53",
            "+357",
            "+420",
            "+45",
            "+253",
            "+670",
            "+593",
            "+20",
            "+503",
            "+240",
            "+291",
            "+372",
            "+251",
            "+500",
            "+298",
            "+679",
            "+358",
            "+33",
            "+689",
            "+241",
            "+220",
            "+995",
            "+49",
            "+233",
            "+350",
            "+30",
            "+299",
            "+502",
            "+224",
            "+245",
            "+592",
            "+509",
            "+504",
            "+852",
            "+36",
            "+62",
            "+98",
            "+964",
            "+353",
            "+44",
            "+972",
            "+39",
            "+225",
            "+81",
            "+962",
            "+7",
            "+254",
            "+686",
            "+965",
            "+996",
            "+856",
            "+371",
            "+961",
            "+266",
            "+231",
            "+218",
            "+423",
            "+370",
            "+352",
            "+853",
            "+389",
            "+261",
            "+265",
            "+60",
            "+960",
            "+223",
            "+356",
            "+692",
            "+222",
            "+230",
            "+262",
            "+52",
            "+691",
            "+373",
            "+377",
            "+976",
            "+382",
            "+212",
            "+258",
            "+264",
            "+674",
            "+977",
            "+31",
            "+687",
            "+64",
            "+505",
            "+227",
            "+234",
            "+683",
            "+850",
            "+47",
            "+92",
            "+680",
            "+507",
            "+675",
            "+595",
            "+51",
            "+63",
            "+870",
            "+48",
            "+351",
            "+1",
            "+40",
            "+7",
            "+250",
            "+590",
            "+685",
            "+378",
            "+239",
            "+966",
            "+221",
            "+381"
    };


    // 241
    public static String[] country_code22 = {
            "+974",
            "+91",
            "+973",
            "+971",
            "+968",
            "+93",
            "+358",
            "+355",
            "+213",
            "+1684",
            "+376",
            "+244",
            "+1264",
            "+672",
            "+1268",
            "+54",
            "+374",
            "+297",
            "+61",
            "+43",
            "+994",
            "+1242",
            "+880",
            "+1246",
            "+375",
            "+32",
            "+501",
            "+229",
            "+1441",
            "+975",
            "+591",
            "+387",
            "+267",
            "+55",
            "+246",
            "+673",
            "+359",
            "+226",
            "+257",
            "+855",
            "+237",
            "+1",
            "+238",
            "+345",
            "+236",
            "+235",
            "+56",
            "+86",
            "+61",
            "+61",
            "+57",
            "+269",
            "+242",
            "+243",
            "+682",
            "+506",
            "+225",
            "+385",
            "+53",
            "+357",
            "+420",
            "+45",
            "+253",
            "+1767",
            "+1849",
            "+593",
            "+20",
            "+503",
            "+240",
            "+291",
            "+372",
            "+251",
            "+500",
            "+298",
            "+679",
            "+358",
            "+33",
            "+594",
            "+689",
            "+241",
            "+220",
            "+995",
            "+49",
            "+233",
            "+350",
            "+30",
            "+299",
            "+1473",
            "+590",
            "+1671",
            "+502",
            "+44",
            "+224",
            "+245",
            "+295",
            "+509",
            "+379",
            "+504",
            "+852",
            "+36",
            "+354",
            "+62",
            "+98",
            "+964",
            "+353",
            "+44",
            "+972",
            "+39",
            "+1876",
            "+81",
            "+44",
            "+962",
            "+77",
            "+254",
            "+686",
            "+850",
            "+82",
            "+965",
            "+996",
            "+856",
            "+371",
            "+961",
            "+266",
            "+231",
            "+218",
            "+423",
            "+370",
            "+352",
            "+853",
            "+389",
            "+261",
            "+265",
            "+60",
            "+960",
            "+223",
            "+356",
            "+692",
            "+596",
            "+222",
            "+230",
            "+262",
            "+52",
            "+691",
            "+373",
            "+377",
            "+976",
            "+382",
            "+1164",
            "+212",
            "+258",
            "+95",
            "+264",
            "+674",
            "+977",
            "+31",
            "+599",
            "+687",
            "+64",
            "+505",
            "+227",
            "+234",
            "+683",
            "+672",
            "+1670",
            "+47",
            "+92",
            "+680",
            "+970",
            "+507",
            "+675",
            "+595",
            "+51",
            "+63",
            "+872",
            "+48",
            "+351",
            "+1939",
            "+40",
            "+7",
            "+250",
            "+262",
            "+590",
            "+290",
            "+1869",
            "+1758",
            "+590",
            "+508",
            "+1784",
            "+685",
            "+378",
            "+239",
            "+966",
            "+221",
            "+381",
            "+248",
            "+232",
            "+65",
            "+421",
            "+386",
            "+677",
            "+252",
            "+27",
            "+211",
            "+500",
            "+34",
            "+94",
            "+249",
            "+597",
            "+47",
            "+268",
            "+46",
            "+41",
            "+963",
            "+886",
            "+992",
            "+255",
            "+66",
            "+670",
            "+228",
            "+690",
            "+676",
            "+1868",
            "+216",
            "+90",
            "+993",
            "+1649",
            "+688",
            "+256",
            "+380",
            "+44",
            "+1",
            "+598",
            "+998",
            "+678",
            "+58",
            "+84",
            "+1284",
            "+1340",
            "+681",
            "+967",
            "+260",
            "+263"
    };


 // 233 countries
    public static String[] nationality22 =
            new String[]{

            };


    public static String[] nationality =
            new String[]{

                    "Select Natoinality",
                    "Afghan", "Albanian", "Algerian", "American", "Andorran", "Angolan", "Antiguans", "Argentinean",
                    "Armenian",
                    "Australian", "Austrian", "Azerbaijani", "Bahamian", "Bahraini", "Bangladeshi", "Barbadian", "Barbudans",
                    "Batswana", "Belarusian", "Belgian", "Belizean", "Beninese", "Bhutanese", "Bolivian", "Bosnian", "Brazilian",
                    "British", "Bruneian", "Bulgarian", "Burkinabe", "Burmese", "Burundian", "Cambodian", "Cameroonian",
                    "Canadian",
                    "Cape Verdean", "Central African", "Chadian", "Chilean", "Chinese", "Colombian", "Comoran", "Congolese",
                    "Costa Rican",
                    "Croatian", "Cuban", "Cypriot", "Czech", "Danish", "Djibouti", "Dominican", "Dutch", "East Timorese", "Ecuadorean",
                    "Egyptian", "Emirian", "Equatorial Guinean", "Eritrean", "Estonian", "Ethiopian", "Fijian", "Filipino", "Finnish",
                    "French", "Gabonese", "Gambian", "Georgian", "German", "Ghanaian", "Greek", "Grenadian", "Guatemalan",
                    "Guinea-Bissauan", "Guinean", "Guyanese", "Haitian", "Herzegovinian", "Honduran", "Hungarian", "Icelander",
                    "Indian", "Indonesian", "Iranian", "Iraqi", "Irish", "Israeli", "Italian", "Ivorian", "Jamaican", "Japanese",
                    "Jordanian", "Kazakhstani", "Kenyan", "Kittian and Nevisian", "Kuwaiti", "Kyrgyz", "Laotian", "Latvian",
                    "Lebanese", "Liberian", "Libyan", "Liechtensteiner", "Lithuanian", "Luxembourger", "Macedonian", "Malagasy",
                    "Malawian", "Malaysian", "Maldivan", "Malian", "Maltese", "Marshallese", "Mauritanian", "Mauritian", "Mexican",
                    "Micronesian", "Moldovan", "Monacan", "Mongolian", "Moroccan", "Mosotho", "Motswana", "Mozambican", "Namibian",
                    "Nauruan", "Nepalese", "New Zealander", "Ni-Vanuatu", "Nicaraguan", "Nigerien", "North Korean", "Northern Irish",
                    "Norwegian", "Omani", "Pakistani", "Palauan", "Palestinian", "Panamanian", "Papua New Guinean", "Paraguayan",
                    "Peruvian", "Polish", "Portuguese", "Qatari", "Romanian", "Russian", "Rwandan", "Saint Lucian", "Salvadoran",
                    "Samoan", "San Marinese", "Sao Tomean", "Saudi", "Scottish", "Senegalese", "Serbian", "Seychellois", "Sierra Leonean",
                    "Singaporean", "Slovakian", "Slovenian", "Solomon Islander", "Somali", "South African", "South Korean", "Spanish",
                    "Sri Lankan", "Sudanese", "Surinamer", "Swazi", "Swedish", "Swiss", "Syrian", "Taiwanese", "Tajik", "Tanzanian",
                    "Thai", "Togolese", "Tongan", "Trinidadian or Tobagonian", "Tunisian", "Turkish", "Tuvaluan", "Ugandan", "Ukrainian",
                    "Uruguayan", "Uzbekistani", "Venezuelan", "Vietnamese", "Welsh", "Yemenite", "Zambian", "Zimbabwean"};


    public static int flag[]={
                R.drawable.qa,
                R.drawable.in,
                R.drawable.bh,
                R.drawable.ae,
                R.drawable.om,
                R.drawable.af,
                R.drawable.ax,
                R.drawable.al,
                R.drawable.dz,
                R.drawable.as,
                R.drawable.ad,
                R.drawable.ao,
                R.drawable.ai,

                R.drawable.aq,
                R.drawable.ag,
                R.drawable.ar,
                R.drawable.am,

                R.drawable.aw,
                R.drawable.aus,


                R.drawable.at,
                R.drawable.az,


                R.drawable.bs,
                R.drawable.bd,
                R.drawable.bb,
                R.drawable.by,
                R.drawable.be,
                R.drawable.bz,
                R.drawable.bj,
                R.drawable.bm,
                R.drawable.bt,
                R.drawable.bo,
                R.drawable.ba,
                R.drawable.bw,
                R.drawable.br,
                R.drawable.io,
                R.drawable.bn,
                R.drawable.bg,
                R.drawable.bf,
                R.drawable.bi,
                R.drawable.kh,
                R.drawable.cm,
                R.drawable.ca,
                R.drawable.cv,
                R.drawable.ky,
                R.drawable.cf,
                R.drawable.td,
                R.drawable.cl,
                R.drawable.cn,
                R.drawable.cx,
                R.drawable.cc,
                R.drawable.co,
                R.drawable.km,
                R.drawable.cg,
                R.drawable.cd,
                R.drawable.ck,
                R.drawable.cr,
                R.drawable.ci,
                R.drawable.hr,
                R.drawable.cu,
                R.drawable.cy,
                R.drawable.cz,
                R.drawable.dk,
                R.drawable.dj,
                R.drawable.dm,
                R.drawable.dos,
                R.drawable.ec,
                R.drawable.eg,
                R.drawable.sv,
                R.drawable.gq,
                R.drawable.er,
                R.drawable.ee,
                R.drawable.et,
                R.drawable.fk,
                R.drawable.fo,
                R.drawable.fj,
                R.drawable.fi,
                R.drawable.fr,
                R.drawable.gf,
                R.drawable.pf,
                R.drawable.ga,
                R.drawable.gm,
                R.drawable.ge,
                R.drawable.de,
                R.drawable.gh,
                R.drawable.gi,
                R.drawable.gr,
                R.drawable.gl,
                R.drawable.gd,
                R.drawable.gp,
                R.drawable.gu,
                R.drawable.gt,
                R.drawable.gg,
                R.drawable.gn,
                R.drawable.gw,
                R.drawable.gy,
                R.drawable.ht,
                R.drawable.va,
                R.drawable.hn,
                R.drawable.hk,
                R.drawable.hu,
                R.drawable.is,
                R.drawable.id,
                R.drawable.ir,
                R.drawable.iq,
                R.drawable.ie,
                R.drawable.im,
                R.drawable.il,
                R.drawable.it,
                R.drawable.jm,
                R.drawable.jp,
                R.drawable.je,
                R.drawable.jo,
                R.drawable.kz,
                R.drawable.ke,
                R.drawable.ki,
                R.drawable.kp,
                R.drawable.kr,
                R.drawable.kw,
                R.drawable.kg,
                R.drawable.la,
                R.drawable.lv,
                R.drawable.lb,
                R.drawable.ls,
                R.drawable.lr,
                R.drawable.ly,
                R.drawable.li,
                R.drawable.lt,
                R.drawable.lu,
                R.drawable.mo,
                R.drawable.mk,
                R.drawable.mg,
                R.drawable.mw,
                R.drawable.my,
                R.drawable.mv,
                R.drawable.ml,
                R.drawable.mt,
                R.drawable.mh,
                R.drawable.mq,
                R.drawable.mr,
                R.drawable.mu,
                R.drawable.yt,
                R.drawable.mx,
                R.drawable.fm,
                R.drawable.md,
                R.drawable.mc,
                R.drawable.mn,
                R.drawable.me,
                R.drawable.ms,
                R.drawable.ma,
                R.drawable.mz,
                R.drawable.mm,
                R.drawable.na,
                R.drawable.nr,
                R.drawable.np,
                R.drawable.nl,
                R.drawable.an,
                R.drawable.nc,
                R.drawable.nz,
                R.drawable.ni,
                R.drawable.ne,
                R.drawable.ng,
                R.drawable.nu,
                R.drawable.nf,
                R.drawable.mp,
                R.drawable.no,
                R.drawable.pk,
                R.drawable.pw,
                R.drawable.ps,
                R.drawable.pa,
                R.drawable.pg,
                R.drawable.py,
                R.drawable.pe,
                R.drawable.ph,
                R.drawable.pn,
                R.drawable.pl,
                R.drawable.pt,
                R.drawable.pr,
                R.drawable.ro,
                R.drawable.ru,
                R.drawable.rw,
                R.drawable.re,
                R.drawable.bl,
                R.drawable.sh,
                R.drawable.kn,
                R.drawable.lc,
                R.drawable.mf,
                R.drawable.pm,
                R.drawable.vc,
                R.drawable.ws,
                R.drawable.sm,
                R.drawable.st,
                R.drawable.sa,
                R.drawable.sn,
                R.drawable.rs,
                R.drawable.sc,
                R.drawable.sl,
                R.drawable.sg,
                R.drawable.sk,
                R.drawable.si,
                R.drawable.sb,
                R.drawable.so,
                R.drawable.za,
                R.drawable.ss,
                R.drawable.gs,
                R.drawable.es,
                R.drawable.lk,
                R.drawable.sd,
                R.drawable.sr,
                R.drawable.sj,
                R.drawable.sz,
                R.drawable.se,
                R.drawable.ch,
                R.drawable.sy,
                R.drawable.tw,
                R.drawable.tj,
                R.drawable.tz,
                R.drawable.th,
                R.drawable.tl,
                R.drawable.tg,
                R.drawable.tk,
                R.drawable.to,
                R.drawable.tt,
                R.drawable.tn,
                R.drawable.tr,
                R.drawable.tm,
                R.drawable.tc,
                R.drawable.tv,
                R.drawable.ug,
                R.drawable.ua,
                R.drawable.gb,
                R.drawable.us,
                R.drawable.uy,
                R.drawable.uz,
                R.drawable.vu,
                R.drawable.ve,
                R.drawable.vn,
                R.drawable.vg,
                R.drawable.vi,
                R.drawable.wf,
                R.drawable.ye,
                R.drawable.zm,
                R.drawable.zw
    };


    public final static String VOUCHER_ID = "voucher_id";
    public final static String VOUCHER_CODE = "voucher_code";
    public final static String VOUCHER_VALUE = "voucher_value";


    //    QT5 Event
//    Event booking
    public final static String EVENT_TIME = "EVENT_TIME";
    public final static String EVENT_DATE = "EVENT_DATE";
    public final static String END_EVENT_DATE = "END_EVENT_DATE";
    public final static String IS_DAY_PASS = "IS_DAY_PASS";

    public final static String IS_DTCM_EVENT = "IS_DTCM_EVENT";
    public final static String EVENT_DATE_ID = "EVENT_DATE_ID";

    public final static String RESIDENCE_CODE = "RESIDENCE_CODE";
    public final static String NO_OF_TICKETS = "NO_OF_TICKETS";
    public final static String SERVICE_CHARGE = "SERVICE_CHARGE";
    public final static String WHATSAPP_CHARGES = "WHATSAPP_CHARGE";
    public final static String SMS_CHARGES = "SMS_CHARGE";
    public final static String TOTAL_AMT = "TOTAL_AMT";
    public final static String TICKET_TYPE_LIST = "TICKET_TYPE_LIST";
    public final static String EVENT_NAME = "EVENT_NAME";
    public final static String EVENT_VENUE = "EVENT_VENUE";
    public final static String IS_COUPON = "IS_COUPON";
    public final static String COUPON_CODE = "COUPON_CODE";
    public final static String GUEST_NAME = "GUEST_NAME";
    public final static String IS_GUEST = "IS_GUEST";
    public final static String GUEST_EMAIL = "GUEST_EMAIL";
    public final static String GUEST_PHONE = "GUEST_PHONE";
    public final static String TICKET_XML = "TICKET_XML";
    public final static String TICKET_VERIFY_XML = "TICKET_VERIFY_XML";
    public final static String IS_EVENT_OFFLINE = "IS_EVENT_OFFLINE";

}
