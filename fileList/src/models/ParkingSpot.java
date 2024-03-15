package models;
import  models.enums.ParkingSpotStatus;
import  models.enums.VehicleType;
public class ParkingSpot extends BaseModel {
    private int number;
    private ParkingSpotStatus parkingSpotStatus;
    private VehicleType vehicleType;
    private Vehicle vehicle;

    public ParkingSpot(int number, ParkingSpotStatus parkingSpotStatus, VehicleType vehicleType, Vehicle vehicle) {
        this.number = number;
        this.parkingSpotStatus = parkingSpotStatus;
        this.vehicleType = vehicleType;
        this.vehicle = vehicle;
    }

    public ParkingSpot() {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "number=" + number +
                ", parkingSpotStatus=" + parkingSpotStatus +
                ", vehicleType=" + vehicleType +
                ", vehicle=" + vehicle +
                '}';}
    }





