
package hotelproject;

enum BedType{QUEEN, KING, TWIN, FULL}

public class singleRoom extends Room{
    
    private BedType bedType;
    private boolean smoking; 

    public singleRoom(int RoomNumber, double RoomPrice, BedType RoomBedType, boolean isSmoking)
    {
        super(RoomNumber, RoomPrice);
        bedType = RoomBedType;
        smoking = isSmoking;
    }
        
    @Override
    public String getRoomInfo()
    {
        String info = "Room " + roomNo + "\t$" + price + "\t\t"+ bedType + "\t\t";         

        if(smoking)
            return info + "Smoking" + "\n";
        else 
            return info + "No Smoking" + "\n";

    }
    
}
