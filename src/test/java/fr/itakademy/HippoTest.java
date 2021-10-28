package fr.itakademy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HippoTest {

    private Hippo hippo;

    @BeforeEach
    public void init() {
        this.hippo = new Hippo(1000, 200, "Hippity", 9001);
    }

    @Test
    void should_gain_weight() {
        assertEquals(1010, hippo.eat());
    }

    @Test
    void should_loose_weight() {
        assertEquals(990, hippo.swim());
    }
}