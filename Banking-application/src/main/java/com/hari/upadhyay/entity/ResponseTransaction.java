package com.hari.upadhyay.entity;
import javax.persistence.*;
import java.time.LocalDateTime;

// TODO Add support for Bank charges, currency conversion, setup repeat payment/ standing order

public class ResponseTransaction {


    private long sourceAccountId;

    private long targetAccountId;

    private String targetOwnerName;

    private double amount;

   
    private String reference;


    public ResponseTransaction() {}

  
    public long getSourceAccountId() {
        return sourceAccountId;
    }
    public void setSourceAccountId(long sourceAccountId) {
        this.sourceAccountId = sourceAccountId;
    }
    public long getTargetAccountId() {
        return targetAccountId;
    }
    public void setTargetAccountId(long targetAccountId) {
        this.targetAccountId = targetAccountId;
    }
    public String getTargetOwnerName() {
        return targetOwnerName;
    }
    public void setTargetOwnerName(String targetOwnerName) {
        this.targetOwnerName = targetOwnerName;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    

    @Override
    public String toString() {
        return "Transaction{" +
                "sourceAccountId=" + sourceAccountId +
                ", targetAccountId=" + targetAccountId +
                ", targetOwnerName='" + targetOwnerName + '\'' +
                ", amount=" + amount +
                ", reference='" + reference + '\'' +
                '}';
    }
}