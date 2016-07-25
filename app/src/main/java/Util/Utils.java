package Util;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by jere on 7/23/2016.
 */
public class Utils {
    public static final String BASE_URL="api.openweathermap.org/data/2.5/weather?q={city name},{country code}";
    public static final String BASE_ICON="api.openweathermap.org/img/w";

    public static JSONObject getObject(String tagName,JSONObject jsonObject) throws JSONException{
        JSONObject jObject =jsonObject.getJSONObject(tagName);
        return jObject;
    }
    public  static String getString(String tagName,JSONObject jsonObject) throws JSONException{
        return jsonObject.getString(tagName);
    }

    public static int getInt(String tagName,JSONObject jsonObject )throws JSONException{
        return  jsonObject.getInt(tagName);
    }
    public static float getfloat(String tagName,JSONObject jsonObject)throws JSONException{
        return (float) jsonObject.getDouble(tagName);
    }
    public static Double getDouble(String tagName,JSONObject jsonObject)throws JSONException {
        return jsonObject.getDouble(tagName);
    }
}
