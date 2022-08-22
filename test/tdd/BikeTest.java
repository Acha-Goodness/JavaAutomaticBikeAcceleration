package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    private Bike bike;

    @BeforeEach
    public void startWith(){
        bike = new Bike();
    }

    @Test
    public void bikeCanBeTurnedOnTest(){
        Bike bike = new Bike();
        assertFalse(bike.isOn());

        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void bikeCanBeTurenedOffTest(){
        Bike bike = new Bike();
        bike.isOn();

        bike.turnOff();
        assertFalse(bike.isOn());
    }

    @Test
    public void bikeCanBeAcceleratedOnGearOneTest(){
        Bike bike = new Bike();
        bike.turnOn();
        assertEquals(0, bike.getSpeed());
        assertEquals(1, bike.getGear());

        bike.increaseSpeed();
        assertEquals(1, bike.getSpeed());
    }

    @Test
    public void bikeWillNotAccelerateWhenOffTest(){
        assertFalse(bike.isOn());
        assertEquals(0, bike.getSpeed());

        bike.increaseSpeed();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void bikeCanChangeFromGearOneToGearTwoAutomatically(){
        bike.turnOn();
        assertEquals(1, bike.getGear());

        for(int x = 0; x < 20; x++){
            bike.increaseSpeed();
        }
        assertEquals(20, bike.getSpeed());

        assertEquals(1, bike.getGear());
        bike.increaseSpeed();
        assertEquals(2, bike.getGear());
    }
}