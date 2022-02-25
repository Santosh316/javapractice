package training.day1;

import java.util.logging.Logger;

public class Account {

    // states

    // Account number
    private String accountNumber;
    // account name
    private String accountName;
    // account type
    String accountType;
    // amount
    private double amount;
    // interest rate
    private final float Interest_Rate = 7.05f;
    // KYC data
    private String address;
    private String socialSecurityNumber;
    private String phoneNumber;



    // getter and setters

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public float getInterest_Rate() {
        return Interest_Rate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    // behaviour

    // open account
    void openAccount(String accountName,String accountType, double amount, String address, String socialSecurityNumber){}
    // transfer balance
    boolean transferBalance(String accountFrom, String accountTo, double amountToTransfer){
        return true;
    }
    // deposit amount
    void depositAmount(String accountNumber, double amountTobeDeposited){}
    // close account
    boolean closeAccount(String accountNumber){
        return true;
    }

}
