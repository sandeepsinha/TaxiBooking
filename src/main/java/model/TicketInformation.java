package model;


public class TicketInformation {

    private Landmark source;
    private Landmark destination;
    private int distance;
    private double total;
    private int traveller;

    public TicketInformation(Landmark source, Landmark destination, int distance, double total, int traveller) {

        this.source = source;
        this.destination = destination;
        this.distance = distance;
        this.total = total;
        this.traveller = traveller;
    }

    public TicketInformation() {

    }

    public Landmark getSource() {
        return source;
    }

    public Landmark getDestination() {
        return destination;
    }

    public int getDistance() {
        return distance;
    }

    public double getTotal() {
        return total;
    }

    public int getTraveller() {
        return traveller;
    }
}
