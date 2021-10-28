package fr.itakademy;

public class Hippo extends Animal {

    private int power;

    public Hippo(int weight, int height, String name, int power) {
        super(weight, height, name);
        this.power = power;
    }
    
    public int swim() {
        this.setWeight(this.getWeight()-10);
        return getWeight();
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}