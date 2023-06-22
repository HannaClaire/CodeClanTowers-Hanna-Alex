import java.util.ArrayList;

public abstract class Room {

    private int maxCapacity;
    private ArrayList<Guest> guests;


    public Room(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.guests = new ArrayList<>();
//        this.roomType = roomType;

    }

    public int getMaxCapacity(){
        return this.maxCapacity;
    }

}
