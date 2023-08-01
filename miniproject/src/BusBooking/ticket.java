package BusBooking;

public class ticket {
    person p;
    bus b;
    private int seatNo;
    private int price;
    private String ticketID;

    public person getP() {
        return p;
    }

    public void setP(person p) {
        this.p = p;
    }

    public bus getB() {
        return b;
    }

    public void setB(bus b) {
        this.b = b;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public ticket(person p, bus b, int seatNo, int price, String ticketID) {
        this.p = p;
        this.b = b;
        this.seatNo = seatNo;
        this.price = price;
        this.ticketID = ticketID;
        b.passengerList.add(p);
    }
}
