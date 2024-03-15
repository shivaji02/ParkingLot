package models;
import models.enums.ParkingLotStatus;

import models.enums.VehicleType;
import models.ParkingFloor;
import service.strategy.billCalculationStrategy.BillCalculationStrategy;
import service.strategy.spotAllocationStrategy.SpotAllocationStrategy;

import java.util.List;
public class ParkingLot extends BaseModel {
    private String name;
    private String address;
    private int capacity;
    private ParkingLotStatus parkingLotStatus;
    private List<ParkingFloor>floors;

    private List<VehicleType> vehicleTypeSupported;
    private SpotAllocationStrategy spotAllocationStrategy;
    private BillCalculationStrategy billCalculationStrategy;

    public ParkingLot(String name, int capacity, ParkingLotStatus status, List<VehicleType> vehicleTypeSupported, SpotAllocationStrategy spotAllocationStrategy, BillCalculationStrategy billCalculationStrategy) {
        this.name = name;
        this.capacity = capacity;
        this.parkingLotStatus = status;
        this.vehicleTypeSupported = vehicleTypeSupported;
        this.spotAllocationStrategy = spotAllocationStrategy;
        this.billCalculationStrategy = billCalculationStrategy;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<VehicleType> getVehicleTypesSupported() {
        return vehicleTypesSupported;
    }

    public void setVehicleTypesSupported(List<VehicleType> vehicleTypesSupported) {
        this.vehicleTypesSupported = vehicleTypesSupported;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public BillCalculationStrategy getBillCalculationStrategy() {
        return billCalculationStrategy;
    }

    public void setBillCalculationStrategy(BillCalculationStrategy billCalculationStrategy) {
        this.billCalculationStrategy = billCalculationStrategy;
    }

    public SpotAllocationStrategy getSpotAllocationStrategy() {
        return spotAllocationStrategy;
    }

    public void setSpotAllocationStrategy(SpotAllocationStrategy spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
    }



}
