import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;

    public ConferenceRoom(int maxCapacity, String name){
        super(maxCapacity);

//        (go to parent, this.maxCapacity = maxCapacity(argument))

        this.name = name;
    }
}
