package service;

import models.Bill;
import models.ParkingSpot;
import models.Ticket;
import repository.TicketRepository;
import service.strategy.billAllocationStrategy.BillCalculationStrategy;
import service.strategy.billAllocationStrategy.BillCalculationStrategyFactory;

public class BillService {
    public Bill generateBill(int ticketId, int exitGateId) {
        public Bill generateBill(int ticketId, int exitGateId) {
            BillCalculationStrategy billCalculationStrategy = BillCalculationStrategyFactory.getBill();
            // fetch ticket object from repository
            //double amount = billCalculationStrategy.generateBill(ticket);
            Bill bill = new Bill();
            // add all details required to bill
            // release the spot -> spot details are present inside ticket object
            return bill;

        }
}
