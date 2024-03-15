package controller;
import com.sun.jdi.request.InvalidRequestStateException;
import models.Ticket;
import models.Vehicle;
import service.TicketService;
public class TicketController {
private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
public Ticket generateTicket(Vehicle vehicle,int gateId,int parkingLotId){
 if(gateId<=0||parkingLotId<=0){
     throw new InvalidRequestStateException("please enter valid request");
 }
 return ticketService.generateTicket(vehicle,gateId,parkingLotId);
}


}
