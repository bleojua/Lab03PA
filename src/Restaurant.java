public class Restaurant implements Location, Classifiable{

    public String name = new String();
    private int rank;

    public Restaurant() {

        setName("unnamedRestaurant");
        setRank(0);
    }

    public Restaurant(String name){

        setName(name);
        setRank(0);
    }

    public Restaurant(String name, int rank) {

        setName(name);
        setRank(rank);
    }

    public void setRank(int rank) {

        this.rank = rank;
    }

    @Override
    public int getRank() {

        return rank;
    }

    @Override
    public int compareTo(Location o) {

        int difference;
        Restaurant restaurant = (Restaurant) o;
        difference = this.getRank() - restaurant.getRank();

        return difference;
    }

    @Override
    public void setCost(Location node, int value) {

        cost.put(node, value);
    }

    @Override
    public void setName(String name) {

        this.name = name;
    }

    @Override
    public String getName() {

        return this.name;
    }

}
