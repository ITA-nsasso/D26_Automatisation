package fr.itakademy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehiculeTest {

    private Vehicule vehicule;

    @BeforeEach
    public void init() {
        this.vehicule = new Vehicule("peugeot", 4);
    }

    @Test
    void should_make_noise() {
        assertEquals("bep bep", vehicule.noise());
    }
}