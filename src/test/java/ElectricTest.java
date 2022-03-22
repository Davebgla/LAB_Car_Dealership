import Parts.*;
import org.junit.Before;
import org.junit.Test;
import Vehicles.Electric;

import static org.junit.Assert.assertEquals;

public class ElectricTest {

    Electric tesla;
    Wheels wheels;
    Windows windows;
    Fittings fittings;
    Engine engine;

    @Before
    public void before() {
        windows = new Windows(4, true);
        fittings = new Fittings(5, true, "Luxury");
        engine = new Engine("Electric", 0);
        wheels = new Wheels(true, "Sport");
        tesla = new Electric("Tesla", "Model X", false, wheels, windows, fittings, engine, 40000);
    }

    @Test
    public void hasMake(){
        assertEquals("Tesla", tesla.getMake());
    }


    @Test
    public void hasCorrectEngine(){
        assertEquals("Electric", tesla.getEngine().getType());
    }

}
