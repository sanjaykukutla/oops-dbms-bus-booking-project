package BusBooking;

import java.util.HashMap;

public class ticketbooking{

    HashMap<String,ticket> ticketBook = new HashMap<>();
    public void bookTicket(bus b,person p) {
        if(b.getNoOfSeats() > 0){
            String idf = b.getFrom().substring(0,2);
            String idt = b.getTo().substring(0,2);
            String idn = b.getTravelsName().substring(0,1).concat(idf);
            int sn = b.getSeats()-b.getNoOfSeats();
            String id = idn.concat(idt)+sn;
            ticket t = new ticket(p, b, sn, 500, id);
            b.setNoOfSeats(b.getNoOfSeats()-1);
            ticketBook.put(id, t);
        } else{
            System.out.println("Sorry, there are no seats available for you.");
        }
    }
    
    public void cancelTicket(bus b,String id){
        if(ticketBook.containsKey(id)){
            ticketBook.remove(id);
            b.setNoOfSeats(b.getNoOfSeats()+1);
            System.out.println("Your ticket has been cancelled.");
        } else{
            System.out.println("Please check the entered ticket id is correct or not!");
        }
    }

    public void ticketConfirmation(person per,String id){
        if(ticketBook.containsKey(id)){
            ticket t = ticketBook.get(id);
            if(t.p.getMobileNo() == per.getMobileNo()){
                System.out.println("Your ticket has been booked.");
            } else {
                System.out.println("Your ticket has been cancelled.");
            }
        }
    }
}
