package models;
import models.enums.VehicleType;
public class Vehicle extends BaseModel{
private String vehicleNumber;
private VehicleType vehicleType;
private String color;

public  Vehicle(){}

    public Vehicle(String vehicleNumber,VehicleType vehicleType,String color ){
    this.vehicleType  = vehicleType;
    this.vehicleNumber= vehicleNumber;
    this.color=color;
 }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
