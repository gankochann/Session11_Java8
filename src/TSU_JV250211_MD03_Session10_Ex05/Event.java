package TSU_JV250211_MD03_Session10_Ex05;

import java.util.Date;
import java.util.Scanner;

public class Event {
    private String name;
    private String startTime;
    private String endTime;

    public Event() {
    }

    public Event(String name, String startTime, String endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Event : " + name + " | Start: "+ startTime + " | End: "+ endTime;
    }
    public void inputData(Scanner scanner){

    }
}
