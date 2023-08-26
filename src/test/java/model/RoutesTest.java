package model;

import exceptions.RouteNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class RoutesTest {

    @Test
    void shouldSaveRouteDetails() throws RouteNotFoundException {
        Landmark source = new Landmark("PUNE");
        Landmark destination = new Landmark("MUMBAI");
        int distance = 120;

        Routes routeInformation = new Routes();
        ArrayList<Route> routes = new ArrayList<>();
        routes.add(new Route(source, destination, distance));
        routeInformation.setRoutes(routes);

        int actualDistance = routeInformation.getDistance(source, destination);

        Assertions.assertEquals(distance, actualDistance);

    }

    @Test
    void shouldThrowRouteNotFoundExceptionWhenRouteIsNotPresent() {
        Landmark source = new Landmark("PUNE");
        Landmark destination = new Landmark("MUMBAI");
        int distance = 120;

        Routes routeInformation = new Routes();
        ArrayList<Route> routes = new ArrayList<>();
        routes.add(new Route(source, destination, distance));
        routeInformation.setRoutes(routes);

        RouteNotFoundException notFoundException = Assertions.assertThrows(
                RouteNotFoundException.class,
                () -> routeInformation.getDistance(source, new Landmark("INVALID"))
        );

        Assertions.assertTrue(notFoundException.getMessage().contains("Route not found"));
    }

}
