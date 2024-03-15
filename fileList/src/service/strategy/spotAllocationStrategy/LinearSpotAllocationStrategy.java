package service.strategy.spotAllocationStrategy;

import models.ParkingFloor;
import models.ParkingLot;
import models.ParkingSpot;
import models.Vehicle;
import models.enums.ParkingSpotStatus;

public class LinearSpotAllocationStrategy implements SpotAllocationStrategy {
    @Override
    public ParkingSpot getSpotForVehicle(ParkingLot parkingLot, Vehicle vehicle) {
        List<ParkingFloor> parkingFloors = parkingLot.getFloors();
        ///////
        for (ParkingFloor parkingFloor : parkingFloors) {
            for (ParkingSpot parkingSpot : parkingFloor.getParkingSpots()) {
                if (parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY) &&
                        parkingSpot.getVehicleType().equals(vehicle.getVehicleType())) {
                    return parkingSpot;
                }
            }
        }
throw new ParkingSpotNotFoundForVehicleException("Thank your for your time we could not accomdate your vehicle");

    }

}
