import Parts.*;
import Vehicles.Petrol;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolTest {

    Petrol mustang;
    Wheels wheels;
    Windows windows;
    Fittings fittings;
    Engine engine;


    @Before
    public void before() {
        windows = new Windows(4, true);
        fittings = new Fittings(2, false, "Luxury");
        engine = new Engine("Petrol", 5);
        wheels = new Wheels(true, "Sport");
        mustang = new Petrol("Ford", "Mustang", false, wheels, windows, fittings, engine, 60000);
    }

    @Test
    public void hasMake(){
        assertEquals("Ford", mustang.getMake());
    }

    @Test
    public void hasCorrectEngine(){
        assertEquals("Petrol", mustang.getEngine().getType());
    }

}
