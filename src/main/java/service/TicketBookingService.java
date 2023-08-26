package service;

import exceptions.RouteNotFoundException;
import model.Landmark;
import model.Routes;
import model.TicketInformation;
import repository.RouteInformationRepository;

public class TicketBookingService {
    private Routes routes;

    public TicketBookingService(RouteInformationRepository routeInformationRepository) {
        routes = routeInformationRepository.loadRoutes();
    }

    public TicketInformation bookTicket(Landmark source, Landmark destination, int traveller) {
        try {
            int distance = routes.getDistance(source, destination);
            double base = 750;
            double perKMPrice = (distance - 100) * 5;
            return new TicketInformation(source, destination, distance, (base + perKMPrice) * traveller, traveller);

        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        }
        return new TicketInformation();
    }
}
