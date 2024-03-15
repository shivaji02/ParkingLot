package service;

import models.ParkingLot;
import models.ParkingSpot;
import models.Ticket;
import models.Vehicle;
import models.enums.ParkingSpotStatus;
import repository.GateRepository;
import repository.ParkingLotRepository;
import repository.ParkingSpotRepository;
import repository.TicketRepository;
import service.strategy.spotAllocationStrategy.SpotAllocationStrategy;

import java.time.LocalDateTime;


public class TicketService {
    private TicketRepository ticketRepository;
    private ParkingLotRepository parkingLotRepository;
    private GateRepository gateRepository;
    private ParkingSpotRepository parkingSpotRepository;

    public TicketService(TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository, GateRepository gateRepository, ParkingSpotRepository parkingSpotRepository) {
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.gateRepository = gateRepository;
        this.parkingSpotRepository = parkingSpotRepository;
    }


    public Ticket generateTicket(Vehicle vehicle, int gateId, int parkingLotId) {
        SpotAllocationStrategy strategy = new SpotAllocationStrategy.getSpotAllocationStrategy();
        ParkingLot parkingLot = parkingLotRepository.get(parkingLotId);

        ParkingSpot allocatedSpot = strategy.getSpotForVehicle(parkingLot, vehicle);
        allocatedSpot.setParkingSpotStatus(ParkingSpotStatus.OCCUPIED);
        ((ParkingSpot) allocatedSpot).setVehicle(vehicle);
        parkingSpotRepository.put(allocatedSpot);

        Ticket ticket = new Ticket();
        ticket.setEntryTime(LocalDateTime.now());
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(allocatedSpot);
        ticket.setEntryGate(gateRepository.get(gateId));
        return ticketRepository.put(ticket);
    }
}
