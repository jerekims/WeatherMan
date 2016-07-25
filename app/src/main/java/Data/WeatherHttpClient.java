package Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

import Util.Utils;


/**
 * Created by jere on 7/23/2016.
 */
public class WeatherHttpClient {
    public String WeatherData(String place) {
        HttpURLConnection connection = null;
        InputStream inputStream = null;

        try {
            connection = (HttpURLConnection) (new URL(Utils.BASE_URL + place)).openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            connection.setRequestMethod("GET");
            connection.setDoInput(true);
            connection.setDoInput(true);
            try {
                connection.connect();
                //reading the response
                StringBuffer stringBuffer =new StringBuffer();
                inputStream =connection.getInputStream();
                BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(inputStream));
                String line =null;

                while((line=bufferedReader.readLine()) !=null){
                    stringBuffer.append(line + "\r\n");
                }
                inputStream.close();
                connection.disconnect();
                return stringBuffer.toString();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (ProtocolException e) {
            e.printStackTrace();
        }
        return null;
    }
}
