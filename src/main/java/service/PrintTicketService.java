package service;

import model.TicketInformation;

public class PrintTicketService {

    private final PrintInfo printInfo;

    public PrintTicketService(PrintInfo printInfo) {
        this.printInfo = printInfo;
    }

    public void print(TicketInformation ticketInformation) {
        printInfo.print("Taxi Ticket");
        printInfo.print("-----------");
        printInfo.print("Source: " + ticketInformation.getSource().getName());
        printInfo.print("Destination: " + ticketInformation.getDestination().getName());
        printInfo.print("Kms: " + ticketInformation.getDistance());
        printInfo.print("No. of travellers =  " + ticketInformation.getTraveller());
        printInfo.print("Total " + ticketInformation.getTotal() + " INR");
    }
}
