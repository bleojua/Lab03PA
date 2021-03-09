import java.time.LocalTime;

public class Museum implements Location, Visitable, Payable{

    public String name = new String();
    public LocalTime openingTime, closingTime;
    public LocalTime defaultOpeningTime = LocalTime.of(9,30);
    public LocalTime defaultClosingTime = LocalTime.of(20,00);
    public double ticketPrice;

    public Museum() {

        setName("unnamedMuseum");
        setDefaultTimes();

    }

    public Museum(String name) {

        setName(name);
        setDefaultTimes();
    }

    public Museum(String name, LocalTime openingTime, LocalTime closingTime, double ticketPrice) {

        setName(name);
        setOpeningTime(openingTime);
        setClosingTime(closingTime);
        setTicketPrice(ticketPrice);
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public double getTicketPrice() {
        return this.ticketPrice;
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
        return this.closingTime;
    }

    @Override
    public int compareTo(Location o) {

        Museum museum = (Museum) o;
        int difference = museum.getOpeningTime().compareTo(this.getOpeningTime());
        if(difference == 0){
            difference = (int) (museum.getTicketPrice()-this.getTicketPrice());
        }

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
        return null;
    }

}
