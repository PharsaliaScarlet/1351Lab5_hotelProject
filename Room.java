/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelproject;

/**
 *
 * @author amahmo4
 */
public class Room implements Comparable<Room>, Bookable{
    
    public int roomNo;
    public double price;

    public Room(int RoomNumber, double RoomPrice)
    {
        roomNo = RoomNumber;
        price = RoomPrice; 
    }
    
    public void setPrice(double RoomPrice)
    {
        price = RoomPrice; 
    }
    
    public String getRoomInfo()
    {
        return "";
    }
    
    @Override
    public int compareTo(Room other)
    {
        return Double.compare(this.price, other.price); 
    }
    
    @Override
    public void BookRoom()
    {
        System.out.println("Room is booked");
    }
    
     @Override
    public void ReleaseRoom()
    {
        System.out.println("Room is released");
    }
}
