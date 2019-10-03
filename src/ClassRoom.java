import java.util.ArrayList;
import java.util.List;

public class ClassRoom {

    private String roomName;
    private int numberOfSeats;
    private List<Schedule> schedules = new ArrayList<>();


    public void addSchedule (int scheduleIndex, Group newGroup){

        schedules.get(scheduleIndex).setGroup(newGroup);

    }

    public ClassRoom(String roomName) {
        this.roomName = roomName;
    }

    public String toString (){
        return roomName;
    }


    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }


}
