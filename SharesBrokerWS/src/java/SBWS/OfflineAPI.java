/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SBWS;

import Client.ConvertorClient;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ftama
 */
public class OfflineAPI {
    public void getRestful() throws MalformedURLException, IOException{
        ConvertorClient client =  new ConvertorClient();
        String JSON = client.getJson();

        Map<String, Object> mapper = new ObjectMapper().readValue(JSON, HashMap.class);
        Map<String, Object> convRates = (Map<String, Object>)mapper.get("conversion_rates");
        List<CurrencyRate> currList = new ArrayList<CurrencyRate>();

        for(Map.Entry<String,Object> curr:convRates.entrySet()){

            String code = curr.getKey();
            String name;
            try{
                name = Currency.getInstance(code).getDisplayName();
            }
            catch (IllegalArgumentException e){
                continue;
            }
            Object rate = curr.getValue();
            CurrencyRate newCurr = new CurrencyRate(name, code, rate);
            currList.add(newCurr);
        }

        try{
            ObjectMapper writer = new ObjectMapper();
            writer.writeValue(new File("Json.json"), currList);
        }
        catch (IllegalArgumentException e){
        e.printStackTrace();

        }
    }
    
    public List<CurrencyRate> readFile()throws IOException{
            ObjectMapper reader = new ObjectMapper();
            List<CurrencyRate> fileList = new ArrayList<CurrencyRate>();
            fileList = reader.readValue(new File("JSON.json"), new TypeReference<List<CurrencyRate>>(){});
            System.out.println("Read file");
            return fileList;
            
            
        }
    
    public List<String> getApiCodes() throws IOException{
        List<String> codes = new ArrayList<String>();
        List<CurrencyRate> currency = readFile();
        Iterator itr = currency.iterator();
            while(itr.hasNext()){
                CurrencyRate curr = (CurrencyRate) itr.next();
                codes.add(curr.getCode()+" - "+curr.getName());
            }
        return codes; 
    }
    public double apiRate(String code1, String code2) throws IOException{
        List<CurrencyRate> currency = readFile();
        Iterator itr = currency.iterator();
        double rate1 = 0;
        double rate2 = 0;
        
        CurrencyRate curr = new CurrencyRate();
            while(itr.hasNext()){
                curr = (CurrencyRate) itr.next();
                if(curr.getCode().equalsIgnoreCase(code1)){
                     
                     Object obj1 = curr.getRate();
                     String string1 = obj1.toString();
                     rate1 = Double.valueOf(string1).doubleValue();

                }
                if(curr.getCode().equalsIgnoreCase(code2)){
                    
                    Object obj2 = curr.getRate();
                    String string2 = obj2.toString();
                    rate2 = Double.valueOf(string2).doubleValue();
                    
                }
                
            }
        double rate =  rate2/rate1;  
        return rate;
    }
}
