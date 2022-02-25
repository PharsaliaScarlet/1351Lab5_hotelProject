
package hotelproject;

public class Suite extends Room {
    
    private int numRoom;
    private boolean hasKicthen; 
    
    public Suite(int RoomNumber, double RoomPrice, int NumberOfRooms, boolean HasKitchen)
    {
        super(RoomNumber, RoomPrice); 
        
        numRoom = NumberOfRooms;
        hasKicthen = HasKitchen;
    }
    
    @Override
    public String getRoomInfo()
    {
        String info = "Suite " + roomNo + "\t$" + price + "\t\t"+ numRoom + "\t\t";         

        if(hasKicthen)
            return info + "Kicthen" + "\n";
        else 
            return info + "No Kicthen" + "\n";

    }


}
