package Model;

/**
 * Created by jere on 7/23/2016.
 */
public class Weather {
    public Place place;
    public CurrentCondition currentCondition =new CurrentCondition();
    public Temperature temperature =new Temperature();
    public  Wind wind = new Wind();
    public Clouds clouds =new Clouds();
    public Snow snow =new Snow();
    private String iconData;
}
