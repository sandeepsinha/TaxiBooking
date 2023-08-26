import model.Landmark;
import model.TicketInformation;
import repository.RouteInformationRepository;
import service.PrintInfo;
import service.PrintTicketService;
import service.TicketBookingService;

public class Main {
    public static void main(String[] args) {
        TicketBookingService ticketBookingService = new TicketBookingService(new RouteInformationRepository());
        TicketInformation ticketInformation = ticketBookingService.bookTicket(new Landmark("PUNE"), new Landmark("NASIK"), 2);
        PrintTicketService printTicketService = new PrintTicketService(new PrintInfo());
        printTicketService.print(ticketInformation);

    }
}
