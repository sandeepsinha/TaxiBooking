package model;

public class Route {
    private Landmark source;
    private Landmark destination;
    private int distance;

    public Route(Landmark source, Landmark destination, int distance) {

        this.source = source;
        this.destination = destination;
        this.distance = distance;
    }

    public Landmark getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = new Landmark(source);
    }

    public Landmark getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = new Landmark(destination);
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
