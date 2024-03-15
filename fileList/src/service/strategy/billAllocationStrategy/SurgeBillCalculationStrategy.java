package service.strategy.billAllocationStrategy;


import models.Ticket;

public class SurgeBillCalculationStrategy implements BillCalculationStrategy {
    // Define the surge factor (e.g., 1.5 for a 50% surge)
    private static final double SURGE_FACTOR = 1.5;


    public double calculateBill(Ticket ticket) {
        // Logic to calculate the bill amount with surge factor applied
        double baseRate = ticket.getBaseRate(); // Get the base rate from the ticket
        // Apply surge factor to the base rate
        double bill = baseRate * SURGE_FACTOR;
        return bill;
    }
}
