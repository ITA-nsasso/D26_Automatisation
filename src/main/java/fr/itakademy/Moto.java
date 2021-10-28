package fr.itakademy;

public class Moto extends Vehicule {

    private int cylindre;

    public Moto(String brand, int wheels, int cylindre) {
        super(brand, wheels);
        this.cylindre = cylindre;
    }

    public String noise() {
        return "skrrrrrrrr";
    }

    public void setCylindre(int cylindre) {
        this.cylindre = cylindre;
    }

    public int getCylindre() {
        return cylindre;
    }
}