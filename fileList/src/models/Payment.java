package models;
import models.enums.PaymentMode;
import models.enums.PaymentStatus;

import java.time.LocalDateTime;

public class Payment extends BaseModel {
    private double amount;
    private String transcationRefNumber;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private Bill bill;
    private LocalDateTime paymentTime;

    public Payment() {
    }

    public Payment(double amount, String transcationRefNumber, PaymentMode paymentMode, PaymentStatus paymentStatus, Bill bill, LocalDateTime paymentTime) {
        this.amount = amount;
        this.transcationRefNumber = transcationRefNumber;
        this.paymentMode = paymentMode;
        this.paymentStatus = paymentStatus;
        this.bill = bill;
        this.paymentTime = paymentTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTranscationRefNumber() {
        return transcationRefNumber;
    }

    public void setTranscationRefNumber(String transcationRefNumber) {
        this.transcationRefNumber = transcationRefNumber;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }
}
//
//    @Override
//    public String toString() {
//        return "Payment{" +
//                "amount="
//
//}
