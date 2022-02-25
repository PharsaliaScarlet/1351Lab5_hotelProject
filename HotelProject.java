
package hotelproject;

import java.util.ArrayList;
import java.util.Collections;

public class HotelProject {


    public static void main(String[] args) {
       
        ArrayList<Hotel> hotels = new ArrayList<>();         
        
        Hotel h1 = new Hotel("Hilton", 5);
        h1.setGoogleRating(4.1);
        
        h1.addRoom(new singleRoom(101, 122.5, BedType.QUEEN, true)); 
        h1.addRoom(new singleRoom(102, 180.99,  BedType.KING, true)); 
        h1.addRoom(new singleRoom(203, 160.0, BedType.TWIN, false)); 
        h1.addRoom(new Suite(601, 400.5, 2, false)); 
        h1.addRoom(new Suite(602, 600.5, 3, true)); 
        h1.addRoom(new singleRoom(555, 200, BedType.KING, false));
          
        Hotel h2 = new Hotel("Marriott", 4);
        h2.setGoogleRating(4.5);
        
        h2.addRoom(new singleRoom(1001, 350, BedType.QUEEN, false));
        h2.addRoom(new singleRoom(1002, 377, BedType.KING, true)); 
        h2.addRoom(new Suite(3304, 1001, 2, true)); 
        h2.addRoom(new Suite(4304, 1500, 4, true));
        h2.addRoom(new Studio(003, 50, 200, false));
        h2.addRoom(new singleRoom(6631, 166, BedType.FULL, false));
        hotels.add(h1);
        hotels.add(h2);

        Collections.sort(hotels);
        
        System.out.println("----------------------------------------------------------");
        for(Hotel h: hotels)
        {
            System.out.println(h.getInfo());
            System.out.println("----------------------------------------------------------");
            h.listRooms();
            System.out.println("----------------------------------------------------------");
        
        }
        
    }
    

    
}
