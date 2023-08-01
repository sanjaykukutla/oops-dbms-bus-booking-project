package BusBooking;

import java.util.ArrayList;

public class busStation{
    ArrayList<bus> busBook = new ArrayList<>();
    
    public void addBus(bus b){
        busBook.add(b);
    }

    public void searchBus(String f,String t){
        for(bus b: busBook){
            if(b.getFrom()==f && b.getTo() == t){
                System.out.println("Travels name: "+b.getTravelsName()+"Seats available: "+b.getNoOfSeats());
            }
        }
    }

    public void searchBus(String f,String t,String n){
        for(bus b: busBook){
            if(b.getFrom()==f && b.getTo() == t && b.getTravelsName() == n){
                System.out.println("Seats available: "+b.getNoOfSeats());
            }
        }
    }

    public void printAvailBus(){
        for (bus b : busBook) {
            System.out.println(b);
        }
    }

}
