package models;

import models.enums.GateStatus;
import models.enums.GateType;

/**
  * @author - Chaorrupted X -
  */
public class Gate extends BaseModel {
private int gateNumber;
private String operatorName;
private GateType gateType;
private GateStatus gateStatus;

public Gate(){}
public Gate(int gateNumber, String operatorName, GateType gateType, GateStatus gateStatus){
    this.gateNumber = gateNumber;
    this.operatorName = operatorName;
    this.gateType = gateType;
    this.gateStatus = gateStatus;
}
public int getGateNumber() {
    return gateNumber;
}
public void setGateNumber(int gateNumber) {
    this.gateNumber = gateNumber;
}
public GateType getGateType() {
    return gateType;
}
public void setGateType(GateType gateType) {
    this.gateType = gateType;
}
public GateStatus getGateStatus() {
    return gateStatus;
}
public void setGateStatus(GateStatus gateStatus) {
    this.gateStatus = gateStatus;
}
public String getOperatorName() {
    return operatorName;
}

public void setOperatorName(String operatorName) {
    this.operatorName = operatorName;
}
}
