public class Room {
    int roomNo;
    int floorNo;
    Guest checkedIn;
    String roomType;
    double pricePerDay;

    public Room(int roomNo, int floorNo, Guest checkedIn, String roomType, double pricePerDay) {
        this.roomNo = roomNo;
        this.floorNo = floorNo;
        this.checkedIn = checkedIn;
        this.roomType = roomType;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNo=" + roomNo +
                ", floorNo=" + floorNo +
                ", checkedIn=" + checkedIn +
                ", roomType='" + roomType + '\'' +
                ", pricePerDay=" + pricePerDay +
                '}';
    }
}
