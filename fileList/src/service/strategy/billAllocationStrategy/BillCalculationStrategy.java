package service.strategy.billAllocationStrategy;
import models.Bill;
import models.Ticket;

public interface BillCalculationStrategy {
    Bill generateBill(Ticket ticket);
}
