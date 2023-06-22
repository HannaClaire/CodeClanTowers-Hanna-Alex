public class Bedroom extends Room{
    //from parent: maxCapacity, guestlist
    private int roomNumber;
    private RoomType roomType;

    public Bedroom(int roomNumber, RoomType roomType){
        super(roomType.getMaxCapacity()); //calling parent's constructor
        // for above  code, parent.capacity = roomType.getCapacity, and also dealing with setting a new guestlist
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }


    public Enum getRoomType() {
        return this.roomType;
    }
}
