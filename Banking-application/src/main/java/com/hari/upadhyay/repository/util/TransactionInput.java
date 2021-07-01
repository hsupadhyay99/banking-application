package com.hari.upadhyay.repository.util;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;

public class TransactionInput {

    private AccountInput sourceAccount;

    private AccountInput targetAccount;

    @Positive(message = "Transfer amount must be positive")
    // Prevent fraudulent transfers attempting to abuse currency conversion errors
    @Min(value = 1, message = "Amount must be larger than 1")
    private double amount;

    private String reference;

	/*
	 * @Min(value = -90, message = "Latitude must be between -90 and 90")
	 * 
	 * @Max(value = 90, message = "Latitude must be between -90 and 90") private
	 * Double latitude;
	 * 
	 * @Min(value = -180, message = "Longitude must be between -180 and 180")
	 * 
	 * @Max(value = 180, message = "Longitude must be between -180 and 180") private
	 * Double longitude;
	 */

    public TransactionInput() {}

    public AccountInput getSourceAccount() {
        return sourceAccount;
    }
    public void setSourceAccount(AccountInput sourceAccount) {
        this.sourceAccount = sourceAccount;
    }
    public AccountInput getTargetAccount() {
        return targetAccount;
    }
    public void setTargetAccount(AccountInput targetAccount) {
        this.targetAccount = targetAccount;
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
        return "TransactionInput{" +
                "sourceAccount=" + sourceAccount +
                ", targetAccount=" + targetAccount +
                ", amount=" + amount +
                ", reference='" + reference + '\'' +
                '}';
    }
}