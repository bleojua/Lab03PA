import java.time.LocalTime;

public interface Visitable {

    void setDefaultTimes();

    LocalTime getOpeningTime();
    LocalTime getClosingTime();
}
