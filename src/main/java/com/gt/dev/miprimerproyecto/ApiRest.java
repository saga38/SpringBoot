package com.gt.dev.miprimerproyecto;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiRest {
    public String leerUrl(String url){
        String respuesta="";
        try {
            URL direccion = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) direccion.openConnection();
            connection.setRequestMethod("GET");
            InputStream inputStream = connection.getInputStream();
            StringBuilder responseBuilder = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                responseBuilder.append(line).append("\n");
            }

            respuesta = responseBuilder.toString();
            reader.close();
            inputStream.close();


        }catch (Exception e){
            respuesta ="not found";
        }

        return respuesta;
    }
}
