package fr.itakademy;

public class BankAccount {
    
    private int accountNumber;
    private double accountCredit;
    private Client client;

    public BankAccount(int accountNumber, double accountCredit, Client client){
        this.accountNumber = accountNumber;
        this.accountCredit = accountCredit;
        this.client = client;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountCredit() {
        return this.accountCredit;
    }

    public void withdrawMoney(double money){
        this.accountCredit -= money;
        this.client.setMoney(client.getMoney() - money);
    }

    public void depositMoney(double money){
        this.accountCredit += money;
        this.client.setMoney(client.getMoney() + money);
    }
}
