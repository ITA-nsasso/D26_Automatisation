package fr.itakademy;

public class Car extends Vehicule{
    
    private int horses;
    
    public Car(String brand, int wheels, int horses) {
        super(brand, wheels);
        this.horses = horses;
    }

    public void setHorses(int horses) {
        this.horses = horses;
    }

    public int getHorses() {
        return horses;
    }

    public String noise() {
        return "vroooooooooooom";
    }
}