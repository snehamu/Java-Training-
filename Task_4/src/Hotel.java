public class Hotel {
    String name;
        Room[] rooms;

        public Hotel(String name, Room[] rooms) {
            this.name = name;
            this.rooms = rooms;
        }

        Guest findGuestCheckedInRoom(int roomId){
            for(int i=0; i<rooms.length; i++){
                if(rooms[i].roomNo == roomId ){
                    return rooms[i].checkedIn;
                }
            }
            return null;
        }

        int guestsCount() {
            int count = 0;
            for (int i = 0; i < rooms.length; i++) {
                if (rooms[i].checkedIn != null) {
                    count++;
                }
            }
            return count;
        }

        double earningToday(){
            double totalEarning = 0;
            for (int i = 0; i < rooms.length; i++) {
                if(rooms[i].checkedIn != null){
                    totalEarning = totalEarning + rooms[i].pricePerDay;
                }
            }
            return totalEarning;
        }

        Guest[] findAllGuest(){
            Guest[] allGuest = new Guest[4];
            int Index = 0;
            for (int i = 0; i < rooms.length; i++) {
                if(rooms[i].checkedIn != null){
                    allGuest[Index]=rooms[i].checkedIn;
                    Index++;
                }
            }
            return allGuest;
        }
}
