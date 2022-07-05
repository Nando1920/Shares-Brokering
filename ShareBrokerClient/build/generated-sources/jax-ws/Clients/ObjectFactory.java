
package Clients;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Clients package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoginResponse_QNAME = new QName("http://SBWS/", "loginResponse");
    private final static QName _CurrencyNamesResponse_QNAME = new QName("http://SBWS/", "currencyNamesResponse");
    private final static QName _Add_QNAME = new QName("http://SBWS/", "add");
    private final static QName _BuyResponse_QNAME = new QName("http://SBWS/", "buyResponse");
    private final static QName _SellResponse_QNAME = new QName("http://SBWS/", "sellResponse");
    private final static QName _Buy_QNAME = new QName("http://SBWS/", "buy");
    private final static QName _Sell_QNAME = new QName("http://SBWS/", "sell");
    private final static QName _AddResponse_QNAME = new QName("http://SBWS/", "addResponse");
    private final static QName _APICodesResponse_QNAME = new QName("http://SBWS/", "APICodesResponse");
    private final static QName _GetRate_QNAME = new QName("http://SBWS/", "GetRate");
    private final static QName _IOException_QNAME = new QName("http://SBWS/", "IOException");
    private final static QName _Login_QNAME = new QName("http://SBWS/", "login");
    private final static QName _APIRateResponse_QNAME = new QName("http://SBWS/", "APIRateResponse");
    private final static QName _CurrencyNames_QNAME = new QName("http://SBWS/", "currencyNames");
    private final static QName _GetRateResponse_QNAME = new QName("http://SBWS/", "GetRateResponse");
    private final static QName _GetList_QNAME = new QName("http://SBWS/", "getList");
    private final static QName _GetListResponse_QNAME = new QName("http://SBWS/", "getListResponse");
    private final static QName _RegisterResponse_QNAME = new QName("http://SBWS/", "registerResponse");
    private final static QName _APICodes_QNAME = new QName("http://SBWS/", "APICodes");
    private final static QName _Register_QNAME = new QName("http://SBWS/", "register");
    private final static QName _APIRate_QNAME = new QName("http://SBWS/", "APIRate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Clients
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Company }
     * 
     */
    public Company createCompany() {
        return new Company();
    }

    /**
     * Create an instance of {@link Price }
     * 
     */
    public Price createPrice() {
        return new Price();
    }

    /**
     * Create an instance of {@link Shares }
     * 
     */
    public Shares createShares() {
        return new Shares();
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link BuyResponse }
     * 
     */
    public BuyResponse createBuyResponse() {
        return new BuyResponse();
    }

    /**
     * Create an instance of {@link SellResponse }
     * 
     */
    public SellResponse createSellResponse() {
        return new SellResponse();
    }

    /**
     * Create an instance of {@link CurrencyNamesResponse }
     * 
     */
    public CurrencyNamesResponse createCurrencyNamesResponse() {
        return new CurrencyNamesResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link APICodesResponse }
     * 
     */
    public APICodesResponse createAPICodesResponse() {
        return new APICodesResponse();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link Buy }
     * 
     */
    public Buy createBuy() {
        return new Buy();
    }

    /**
     * Create an instance of {@link Sell }
     * 
     */
    public Sell createSell() {
        return new Sell();
    }

    /**
     * Create an instance of {@link GetRate }
     * 
     */
    public GetRate createGetRate() {
        return new GetRate();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link APIRateResponse }
     * 
     */
    public APIRateResponse createAPIRateResponse() {
        return new APIRateResponse();
    }

    /**
     * Create an instance of {@link CurrencyNames }
     * 
     */
    public CurrencyNames createCurrencyNames() {
        return new CurrencyNames();
    }

    /**
     * Create an instance of {@link GetRateResponse }
     * 
     */
    public GetRateResponse createGetRateResponse() {
        return new GetRateResponse();
    }

    /**
     * Create an instance of {@link GetList }
     * 
     */
    public GetList createGetList() {
        return new GetList();
    }

    /**
     * Create an instance of {@link GetListResponse }
     * 
     */
    public GetListResponse createGetListResponse() {
        return new GetListResponse();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link APICodes }
     * 
     */
    public APICodes createAPICodes() {
        return new APICodes();
    }

    /**
     * Create an instance of {@link APIRate }
     * 
     */
    public APIRate createAPIRate() {
        return new APIRate();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SBWS/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyNamesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SBWS/", name = "currencyNamesResponse")
    public JAXBElement<CurrencyNamesResponse> createCurrencyNamesResponse(CurrencyNamesResponse value) {
        return new JAXBElement<CurrencyNamesResponse>(_CurrencyNamesResponse_QNAME, CurrencyNamesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SBWS/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SBWS/", name = "buyResponse")
    public JAXBElement<BuyResponse> createBuyResponse(BuyResponse value) {
        return new JAXBElement<BuyResponse>(_BuyResponse_QNAME, BuyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SBWS/", name = "sellResponse")
    public JAXBElement<SellResponse> createSellResponse(SellResponse value) {
        return new JAXBElement<SellResponse>(_SellResponse_QNAME, SellResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Buy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SBWS/", name = "buy")
    public JAXBElement<Buy> createBuy(Buy value) {
        return new JAXBElement<Buy>(_Buy_QNAME, Buy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sell }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SBWS/", name = "sell")
    public JAXBElement<Sell> createSell(Sell value) {
        return new JAXBElement<Sell>(_Sell_QNAME, Sell.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SBWS/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APICodesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SBWS/", name = "APICodesResponse")
    public JAXBElement<APICodesResponse> createAPICodesResponse(APICodesResponse value) {
        return new JAXBElement<APICodesResponse>(_APICodesResponse_QNAME, APICodesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SBWS/", name = "GetRate")
    public JAXBElement<GetRate> createGetRate(GetRate value) {
        return new JAXBElement<GetRate>(_GetRate_QNAME, GetRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SBWS/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SBWS/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIRateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SBWS/", name = "APIRateResponse")
    public JAXBElement<APIRateResponse> createAPIRateResponse(APIRateResponse value) {
        return new JAXBElement<APIRateResponse>(_APIRateResponse_QNAME, APIRateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyNames }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SBWS/", name = "currencyNames")
    public JAXBElement<CurrencyNames> createCurrencyNames(CurrencyNames value) {
        return new JAXBElement<CurrencyNames>(_CurrencyNames_QNAME, CurrencyNames.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SBWS/", name = "GetRateResponse")
    public JAXBElement<GetRateResponse> createGetRateResponse(GetRateResponse value) {
        return new JAXBElement<GetRateResponse>(_GetRateResponse_QNAME, GetRateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SBWS/", name = "getList")
    public JAXBElement<GetList> createGetList(GetList value) {
        return new JAXBElement<GetList>(_GetList_QNAME, GetList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SBWS/", name = "getListResponse")
    public JAXBElement<GetListResponse> createGetListResponse(GetListResponse value) {
        return new JAXBElement<GetListResponse>(_GetListResponse_QNAME, GetListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SBWS/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APICodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SBWS/", name = "APICodes")
    public JAXBElement<APICodes> createAPICodes(APICodes value) {
        return new JAXBElement<APICodes>(_APICodes_QNAME, APICodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SBWS/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SBWS/", name = "APIRate")
    public JAXBElement<APIRate> createAPIRate(APIRate value) {
        return new JAXBElement<APIRate>(_APIRate_QNAME, APIRate.class, null, value);
    }

}
