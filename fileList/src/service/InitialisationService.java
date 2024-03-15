package service;
import models.Gate;
import models.ParkingLot;
import models.ParkingSpot;
import models.ParkingFloor;
import models.enums.*;
import repository.GateRepository;
import repository.ParkingFloorRepository;
import repository.ParkingLotRepository;
import repository.ParkingSpotRepository;
import java.util.List;
import java.util.ArrayList;


public class InitialisationService {
    private GateRepository gateRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private  ParkingLotRepository parkingLotRepository;
    private ParkingSpotRepository parkingSpotRepository;

    public InitialisationService(GateRepository gateRepository, ParkingFloorRepository parkingFloorRepository, ParkingLotRepository parkingLotRepository, ParkingSpotRepository parkingSpotRepository) {
        this.gateRepository = gateRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public ParkingLot init(){
        System.out.println("****Starting Initialisation****");

        //Creating a parking Lot object
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName("Radhe Parking Center");
        parkingLot.setAddress("Somewhere inside a costly mall");
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setCapacity(100);
        parkingLot.setVehicleTypesSupported(List.of(VehicleType.TWO_WHEELER, VehicleType.FOUR_WHEELER));

        List<ParkingFloor> floors = new ArrayList<>();
        //Running a loop to create 10 parking floor object
        for(int i=1;i<=10;i++){
            // Creating parkingFloor object
            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setId(i);
            parkingFloor.setFloorNumber(i);
            parkingFloor.setParkingFloorStatus(ParkingFloorStatus.AVAILABLE);
            List<ParkingSpot> spots = new ArrayList<>();
            //for each floor creating 10 parking spot objects
            for(int j=1;j<=10;j++){
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setId(j);
                parkingSpot.setNumber((i * 100)+ j);
                parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                parkingSpot.setVehicleType(VehicleType.FOUR_WHEELER);
                spots.add(parkingSpot);
                parkingSpotRepository.put(parkingSpot);
            }
            parkingFloor.setParkingSpots(spots);
            //creating entry gate object
            Gate entryGate = new Gate();
            entryGate.setId((i*1000) + 1);
            entryGate.setGateNumber(i*100 + 1);
            entryGate.setGateStatus(GateStatus.OPEN);
            entryGate.setGateType(GateType.ENTRY);
            entryGate.setOperatorName("Operator : " + i + 1);
            parkingFloor.setEntryGate(entryGate);
            gateRepository.put(entryGate);

            //creating exit gate object
            Gate exitGate = new Gate();
            exitGate.setId((i*1000) + 2);
            exitGate.setGateNumber(i*100 + 2);
            exitGate.setGateStatus(GateStatus.OPEN);
            exitGate.setGateType(GateType.EXIT);
            exitGate.setOperatorName("Operator : " + i + 2);
            parkingFloor.setExitGate(exitGate);
            gateRepository.put(exitGate);

            floors.add(parkingFloor); // adding the floor to floor list
            parkingFloorRepository.put(parkingFloor); // saving the floor to repository
        }
        parkingLot.setFloors(floors);  // adding floor list to parking lot
        parkingLotRepository.put(parkingLot);
        return parkingLotRepository.get(1);
    }
}
