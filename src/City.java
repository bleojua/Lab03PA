import javax.xml.stream.Location;
import java.util.ArrayList;
import java.util.List;

public class City {

    public ArrayList<Location> locationList = new ArrayList<>();

    public void addLocation(Location node){

        locationList.add(node);
    }

    private Location getLocation(int index){

        return locationList.get(index);
    }

    public static void main(String[] args) {


        City city = new City();

        Location v11 = new Hotel("HotelTest", 0);

        Hotel v1 = new Hotel( "Hotel" ,5);
        Museum v2 = new Museum("MuseumA");
        Museum v3 = new Museum("MuseumB");
        Church v4 = new Church("ChurchA");
        Church v5 = new Church("ChurchB");
        Restaurant v6 = new Restaurant("Restaurant", 4);


        v1.setCost(v2, 10);
        v1.setCost(v3, 50);
        v2.setCost(v3, 20);
        v2.setCost(v4, 20);
        v2.setCost(v5, 10);
        v3.setCost(v2, 20);
        v3.setCost(v4, 20);
        v4.setCost(v5, 30);
        v4.setCost(v6, 10);
        v5.setCost(v4, 30);
        v5.setCost(v6, 20);


        city.addLocation(v1);



        System.out.println(city.getLocation(0).getClass().getName());


    }


}
