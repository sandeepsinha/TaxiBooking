package service;

import model.Landmark;
import model.TicketInformation;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class PrintTicketServiceTest {

    @Test
    void shouldPrintTicketDetails() {
        PrintInfo printInfoMock = mock(PrintInfo.class);
        TicketInformation ticketInformation = new TicketInformation(
                new Landmark("PUNE"),
                new Landmark("NASIK"),
                200,
                2500.0,
                2);
        PrintTicketService printTicketService = new PrintTicketService(printInfoMock);
        printTicketService.print(ticketInformation);
        verify(printInfoMock, times(1)).print("Taxi Ticket");
        verify(printInfoMock, times(1)).print("-----------");
        verify(printInfoMock, times(1)).print("Source: PUNE");
        verify(printInfoMock, times(1)).print("Destination: NASIK");
        verify(printInfoMock, times(1)).print("Kms: 200");
        verify(printInfoMock, times(1)).print("No. of travellers =  2");
        verify(printInfoMock, times(1)).print("Total 2500.0 INR");
    }

}
