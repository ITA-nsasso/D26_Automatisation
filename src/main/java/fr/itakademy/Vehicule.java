package fr.itakademy;

public class Vehicule {

    private String brand;
    private int wheels;

    public Vehicule(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String noise() {
        return "bep bep";
    }

    public void accident(){
        int wheels = getWheels();
        wheels = wheels-1;
    }
}