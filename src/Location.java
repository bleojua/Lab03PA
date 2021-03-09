import java.util.HashMap;
import java.util.Map;

public interface Location extends Comparable<Location> {


    public Map<Location, Integer> cost = new HashMap<>();

    public void setCost(Location node, int value);

    public void setName(String name);

    public String getName();

}
