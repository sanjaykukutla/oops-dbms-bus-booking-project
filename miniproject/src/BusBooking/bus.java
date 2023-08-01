package BusBooking;

import java.util.ArrayList;

public class bus {
    private int noOfSeats;
    private int seats;
    private String from;
    private String to;
    private String travelsName;
    ArrayList<person> passengerList = new ArrayList<>();

    public driver getD() {
        return D;
    }

    public void setD(driver d) {
        D = d;
    }

    driver D;

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTravelsName() {
        return travelsName;
    }

    public void setTravelsName(String travelsName) {
        this.travelsName = travelsName;
    }


    public bus(int noOfSeats, String from, String to, String travelsName,driver d) {
        this.noOfSeats = noOfSeats;
        this.from = from;
        this.to = to;
        this.travelsName = travelsName;
        D = d;
    }

    public void printPassengerList(){
        for (person p : passengerList) {
            System.out.println(p);
        }
    }

    @Override
    public String toString() {
        return "From: " + from + "  To: " + to + "  Travels Name: " + travelsName + "  Seats: " + seats;
    }

}
