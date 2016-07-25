package Model;

/**
 * Created by jere on 7/23/2016.
 */
public class Place {
    private  float Lon;
    private float Lat;
    private long sunrise;
    private  long sunset;
    private  String Coutry;
    private  String city;
    private long lastupdate;

    public float getLon() {
        return Lon;
    }

    public void setLon(float lon) {
        Lon = lon;
    }

    public float getLat() {
        return Lat;
    }

    public void setLat(float lat) {
        Lat = lat;
    }

    public long getSunrise() {
        return sunrise;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    public String getCoutry() {
        return Coutry;
    }

    public void setCoutry(String coutry) {
        Coutry = coutry;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(long lastupdate) {
        this.lastupdate = lastupdate;
    }
}
