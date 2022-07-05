/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ftama
 */
public class APIRequester {
    public String updateFile() throws IOException{
        
            URL url = new URL("https://v6.exchangerate-api.com/v6/a52d84c18a45cfb701bf7ee1/latest/GBP");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            // Check for successful response code or throw error
            if (conn.getResponseCode() != 200) {
                throw new IOException(conn.getResponseMessage());
            }
            System.out.println(conn.getResponseCode());
            conn.connect();
            BufferedReader ins = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inString;
            StringBuilder JSONString = new StringBuilder();
            while ((inString = ins.readLine()) != null) {
                JSONString.append(inString).append("\n");
            }
            ins.close();
            conn.disconnect();
            
            return JSONString.toString();
    }
}
