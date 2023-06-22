public enum RoomType {
    SINGLE(1),
    DOUBLE(2);


    private final int maxCapacity;

    RoomType(int maxCapacity){
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return this.maxCapacity;
    }
}
