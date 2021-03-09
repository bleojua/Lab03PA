public class Hotel implements Location, Classifiable{

    public String name = new String();
    public int rank;

    public Hotel() {

        setName("unnamedHotel");
        setRank(0);
    }

    public Hotel(int rank){

        setName("unnamedHotel");
        setRank(rank);
    }

    public Hotel(String name, int rank){

        setName(name);
        setRank(rank);
    }

    @Override
    public void setCost(Location node, int value) {
        cost.put(node, value);
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int getRank() {
        return this.rank;
    }

    @Override
    public int compareTo(Location o) {

        int difference;
        Hotel hotel = (Hotel) o;
        difference = this.getRank() - hotel.getRank();

        return difference;
    }
}
