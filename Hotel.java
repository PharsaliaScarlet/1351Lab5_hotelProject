
package hotelproject;

import java.util.ArrayList;
import java.util.Collections;

public class Hotel implements Comparable<Hotel>{
    
    private String  name;
    private int	stars;
    private double googleRating;
    private double averageRoomPrice;
    
    private ArrayList<Room> rooms = new ArrayList<>();

    //Constructor 
    public Hotel(String HotelName, int hotelStar)
    {
        name = HotelName;
        stars = hotelStar;
    }

    //Set rating
    public void setGoogleRating(double HotelGoogleRating)
    { googleRating = HotelGoogleRating; }


    //Set room price
    public void setRoomPrice(double HotelAverageRoomPrice)
    { averageRoomPrice = HotelAverageRoomPrice; }

    public String getInfo()
    {
        //It does not have to be 100% aligned with the header. If they get the dollar sign correct that would be enough 
        return String.format("%-10s%8d%8s%.2f%8.2f", name, stars, "$", getAverageRoomPrice(), googleRating); 
    }
    
    public void addRoom(Room r)
    {
        rooms.add(r); 
    }
    
    public void listRooms()
    {
        Collections.sort(rooms);
        
        for(Room r: rooms)
            System.out.print(r.getRoomInfo()); 
    }
    
    public double getAverageRoomPrice()
    {
        double sum = 0;
        
        for(Room r: rooms)
            sum += r.price;
        
        return sum / rooms.size(); 
    }

    @Override
    public int compareTo(Hotel other)
    {
        if(Double.compare(getAverageRoomPrice(), other.getAverageRoomPrice()) != 0) //Fisrt compare based on price
                return Double.compare(getAverageRoomPrice(), other.getAverageRoomPrice());

        else if (Integer.compare(stars, other.stars) !=0 ) //Then compare based on stars
                return -1 * Integer.compare(stars, other.stars);  //multipled by -1 for descending order

        else  //Finally compare based on Google Ratings 
            return -1 * Double.compare(googleRating, other.googleRating); //multipled by -1 for descending order
    }
    
}
