package model;

import exceptions.RouteNotFoundException;

import java.util.ArrayList;
import java.util.Optional;

public class Routes {
    private ArrayList<Route> routes;

    public void setRoutes(ArrayList<Route> routes) {
        this.routes = routes;
    }

    public int getDistance(Landmark source, Landmark destination) throws RouteNotFoundException {
        Optional<Route> filteredRoute = routes.stream()
                .filter(route ->
                        route.getSource().getName().equals(source.getName())
                                && route.getDestination().getName().equals(destination.getName())
                ).findFirst();
        int distance = filteredRoute
                .map(Route::getDistance)
                .orElse(-1);
        if (distance == -1) {
            throw new RouteNotFoundException("Route not found");
        }
        return distance;
    }
}
