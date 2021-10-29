package fr.itakademy;

public class Client {

    private int clientId;
    private String clientFirstName;
    private String clientLastName;
    private int clientAge;
    private double clientMoney;

    public Client(int clientId, String clientFirstName, String clientLastName, int clientAge, double clientMoney){

        this.clientId = clientId;
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.clientAge = clientAge;
        this.clientMoney = clientMoney;
    }

    public int getClientId(){
        return this.clientId;
    }

    public String getFirstName(){
        return this.clientFirstName;
    }

    public void setFirstName(String clientFirstName){
        this.clientFirstName = clientFirstName;
    }

    public String getLastName(){
        return this.clientLastName;
    }

    public void setLastName(String clientLastName){
        this.clientLastName = clientLastName;
    }

    public int clientAge(){
        return this.clientAge;
    }

    public void clientAge(int clientAge){
        this.clientAge = clientAge;
    }

    public double getMoney(){
        return this.clientMoney;
    }
    
    public void setMoney(double clientMoney) {
        this.clientMoney = clientMoney;
    }    
}