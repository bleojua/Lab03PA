import java.time.LocalTime;

public class Church implements Location, Visitable{

    public String name = new String();
    private LocalTime openingTime, closingTime;
    private LocalTime defaultOpeningTime = LocalTime.of(9,30);
    private LocalTime defaultClosingTime = LocalTime.of(20,00);

    public Church() {

        setName("unnamedChurch");
        setDefaultTimes();
    }

    public Church(String name) {

        setName(name);
        setDefaultTimes();
    }

    public Church(String name, LocalTime openingTime, LocalTime closingTime) {

        setName(name);
        setOpeningTime(openingTime);
        setClosingTime(closingTime);
//        this.openingTime = openingTime;
//        this.closingTime = closingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    @Override
    public void setDefaultTimes() {

        setOpeningTime(defaultOpeningTime);
        setClosingTime(defaultClosingTime);
    }

    @Override
    public LocalTime getOpeningTime() {
        return this.openingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    @Override
    public LocalTime getClosingTime() {
        return this.closingTime ;
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

    @Override
    public int compareTo(Location o) {

        Church church = (Church) o;

        int difference = church.openingTime.compareTo(this.openingTime);

        return difference;
    }
}
