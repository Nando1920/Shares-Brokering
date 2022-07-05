/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SBWS;

import Library.Company;
import Library.Price;
import Library.Shares;
import Library.Stocks;
import docwebservices.CurrencyConversionWSService;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;
import userlib.User;
import userlib.Users;

/**
 *
 * @author ftama
 */
@WebService(serviceName = "SharesBroker")
@Stateless()
public class SharesBroker {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_9090/CurrencyConvertor/CurrencyConversionWSService.wsdl")
    private CurrencyConversionWSService service;

    Library.Stocks Stocks = new Library.Stocks();
    Users users = new Users();
    
    static List<Shares> SharesList;
    static List<User> userList;
    File xmlFile = new File("stocks.xml");
    
    
    @WebMethod(operationName = "getList")
    public List<Shares> getList() {
        try {
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(Stocks.getClass().getPackage().getName());
            javax.xml.bind.Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
            Stocks = (Stocks) unmarshaller.unmarshal(xmlFile); //NOI18N
        } catch (javax.xml.bind.JAXBException ex) {
            // XXXTODO Handle exception
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }
        SharesList = Stocks.getShares();
        
        return SharesList;
    }  
    
    @WebMethod(operationName = "buy")
    public void buyShares(int Share_Bought, String name){
        SharesList = getList();
        if(Share_Bought > 0){
            Iterator itr = SharesList.iterator();
            Shares Share;
            while(itr.hasNext()){
               Share = (Shares) itr.next();
               if(Share.getCompanyInfo().getCompanyName().equalsIgnoreCase(name)){
                   Share.getCompanyInfo().setSharesNumber(Share.getCompanyInfo().getSharesNumber() - Share_Bought);
                   
                   try {                       
                       javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(Stocks.getClass().getPackage().getName());
                       javax.xml.bind.Marshaller marshaller = jaxbCtx.createMarshaller();
                       marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
                       marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
                       marshaller.marshal(Stocks, xmlFile);
                   } catch (javax.xml.bind.JAXBException ex) {
                       // XXXTODO Handle exception
                       java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
                   }
               }
            }
        }
    }
    
    @WebMethod(operationName = "sell")
    public void sellShares(int Share_Sold, String name){
        
        if(Share_Sold > 0){
            Iterator itr = SharesList.iterator();
            Shares Share;
            while(itr.hasNext()){
               Share = (Shares) itr.next();
               if(Share.getCompanyInfo().getCompanyName().equalsIgnoreCase(name)){
                   Share.getCompanyInfo().setSharesNumber(Share.getCompanyInfo().getSharesNumber() + Share_Sold);
                   
                   try {                       
                       javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(Stocks.getClass().getPackage().getName());
                       javax.xml.bind.Marshaller marshaller = jaxbCtx.createMarshaller();
                       marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
                       marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
                       marshaller.marshal(Stocks, xmlFile);
                   } catch (javax.xml.bind.JAXBException ex) {
                       // XXXTODO Handle exception
                       java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
                   }
               }
            }
        }
    }
    
    @WebMethod(operationName = "add")
    public List<Shares> addShare(String name, String symbol, int num, String currency, double val, String date){

    SharesList = getList();
    Shares newShare = new Shares();
    Company c =  new Company();
    Price p = new Price();
    newShare.setCompanyInfo(c);
    newShare.setSharePrice(p);
    newShare.getCompanyInfo().setCompanyName(name);
    newShare.getCompanyInfo().setCompanySymbol(symbol);
    newShare.getCompanyInfo().setSharesNumber(num);
    newShare.getSharePrice().setCurrency(currency);
    newShare.getSharePrice().setValue(val);
    newShare.getSharePrice().setLastUpdated(date);
    SharesList.add(newShare);
    try {            
        javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(Stocks.getClass().getPackage().getName());
        javax.xml.bind.Marshaller marshaller = jaxbCtx.createMarshaller();
        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
        marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(Stocks, xmlFile);
    } catch (javax.xml.bind.JAXBException ex) {
            // XXXTODO Handle exception
        java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
    }
        return SharesList;
    
    }
    
    @WebMethod(operationName = "currencyNames")
    public List<String> names(){
        List<String> Names = getCurrencyCodes();
        return Names;
    }
    
    @WebMethod(operationName = "GetRate")
    public double transformVal(String shareCurr, String desiredCurr){
        
        double rate = getConversionRate(shareCurr,desiredCurr);
        
        return rate;
    }
    
    @WebMethod(operationName = "APICodes")
    public List<String> apiCodes() throws IOException {
       OfflineAPI api = new OfflineAPI();
       api.getRestful();
       return api.getApiCodes();
    }
    
    @WebMethod(operationName = "APIRate")
    public double apiRate(String code1, String code2) throws IOException{
        OfflineAPI api = new OfflineAPI();
        return api.apiRate(code1, code2);
    }
    
    @WebMethod(operationName = "login")
    public boolean logIn(String username, String password) {
        try {
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(users.getClass().getPackage().getName());
            javax.xml.bind.Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
            users = (Users) unmarshaller.unmarshal(new File("users.xml")); //NOI18N
        } catch (javax.xml.bind.JAXBException ex) {
            // XXXTODO Handle exception
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }
        boolean valid = false;
        userList = users.getUser();
        Iterator itr = userList.iterator();
        User nextUser;
        while(itr.hasNext()){
            nextUser = (User) itr.next();
            if(nextUser.getUserName().equalsIgnoreCase(username)){
                if(nextUser.getPassword().equalsIgnoreCase(password)){
                    valid = true;
                    
                }
            }
        }
        return valid;
    }
    
    @WebMethod(operationName = "register")
    public void register(String username, String password) {
        
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        user.getShares();
        userList.add(user);
        try {            
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(users.getClass().getPackage().getName());
            javax.xml.bind.Marshaller marshaller = jaxbCtx.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8"); //NOI18N
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(users, new File("users.xml"));
        } catch (javax.xml.bind.JAXBException ex) {
            // XXXTODO Handle exception
            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
        }
        
    }
//    @WebMethod(operationName = "updateUserXml")
//    public void updateUserXml(String companyName, String symbol, int num, String currency, double val, String date){
//        
//    }
//    @WebMethod(operationName = "getUserlist()")
//    public List<userlib.Shares> getUserList(String user){
//        List<Shares> passList = new ArrayList();
//        try {
//            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(users.getClass().getPackage().getName());
//            javax.xml.bind.Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
//            users = (Users) unmarshaller.unmarshal(new File("users.xml")); //NOI18N
//        } catch (javax.xml.bind.JAXBException ex) {
//            // XXXTODO Handle exception
//            java.util.logging.Logger.getLogger("global").log(java.util.logging.Level.SEVERE, null, ex); //NOI18N
//        }
//        userList = users.getUser();
//        Iterator itr = userList.iterator();
//        User nextUser;
//        while(itr.hasNext()){
//            nextUser = (User) itr.next();
//            if(nextUser.getUserName().equalsIgnoreCase(user)){
//                List<userlib.Shares> currList = nextUser.getShares();
//                for(int i = 0; i<currList.size();i++){
//                    Shares temp = new Shares();
//                    Company comp = new Company();
//                    Price prc = new Price();
//                    temp.setCompanyInfo(comp);
//                    temp.setSharePrice(prc);
//                    comp.setCompanyName(currList.get(i).getCompanyInfo().getCompanyName());
//                    comp.setCompanySymbol(currList.get(i).getCompanyInfo().getCompanySymbol());
//                    comp.setSharesNumber(currList.get(i).getCompanyInfo().getSharesNumber());
//                    prc.setCurrency(currList.get(i).getSharePrice().getCurrency());
//                    prc.setValue(currList.get(i).getSharePrice().getValue());
//                    prc.setLastUpdated(currList.get(i).getSharePrice().getLastUpdated());
//                    passList.add(temp);
//                }
//            }
//        }
//        return SharesList;
//    }
    
    private double getConversionRate(java.lang.String arg0, java.lang.String arg1) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        docwebservices.CurrencyConversionWS port = service.getCurrencyConversionWSPort();
        return port.getConversionRate(arg0, arg1);
    }

    private java.util.List<java.lang.String> getCurrencyCodes() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        docwebservices.CurrencyConversionWS port = service.getCurrencyConversionWSPort();
        return port.getCurrencyCodes();
    }
    
    
}
