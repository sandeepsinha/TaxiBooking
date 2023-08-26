package service;

import model.Landmark;

import model.TicketInformation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import repository.RouteInformationRepository;

public class TicketBookingServiceTest {
    @Test
    void shouldBookTicketForSourceAndDestination() {
        Landmark source = new Landmark("PUNE");
        Landmark destination = new Landmark("NASIK");
        int expectedDistance = 200;
        double expectedTotal = 2500;
        int traveller = 2;

        TicketInformation expectedTicketInformation = new TicketInformation(source, destination, expectedDistance, expectedTotal, traveller);

        TicketBookingService ticketBookingService = new TicketBookingService(new RouteInformationRepository());

        TicketInformation ticketInformation = ticketBookingService.bookTicket(source, destination, traveller);

        Assertions.assertEquals(expectedTicketInformation.getTotal(), ticketInformation.getTotal());

    }

    @Test
    void shouldNotBookTicketForInvalidSourceAndDestination() {
        Landmark source = new Landmark("PUNE");
        Landmark destination = new Landmark("INVALID");

        int traveller = 2;

        TicketBookingService ticketBookingService = new TicketBookingService(new RouteInformationRepository());

        TicketInformation ticketInformation = ticketBookingService.bookTicket(source, destination, traveller);

        Assertions.assertEquals(0.0, ticketInformation.getTotal());

    }
}
