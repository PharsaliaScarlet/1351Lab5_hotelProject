
package hotelproject;


public class Studio extends Room{
    
    private int squareFt;
    private boolean view; 

    public Studio(int RoomNumber, double RoomPrice, int SquareFt , boolean isView)
    {
        super(RoomNumber, RoomPrice);
        squareFt = SquareFt;
        view = isView;
    }
        
    @Override
    public String getRoomInfo()
    {
        String info = "Studio " + roomNo + "\t$" + price + "\t\t"+ squareFt + "ft. \t\t";         

        if(view)
            return info + "View" + "\n";
        else 
            return info + "No view" + "\n";

    }
    
}
