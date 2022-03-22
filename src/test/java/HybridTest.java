import Parts.*;
import Vehicles.Hybrid;
import Vehicles.Petrol;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridTest {

    Hybrid swift;
    Wheels wheels;
    Windows windows;
    Fittings fittings;
    Engine engine;


    @Before
    public void before() {
        windows = new Windows(6, true);
        fittings = new Fittings(5, true, "Luxury");
        engine = new Engine("Hybrid", 1);
        wheels = new Wheels(true, "City");
        swift = new Hybrid("Suzuki", "Swift", false, wheels, windows, fittings, engine, 20000);
    }

    @Test
    public void hasMake(){
        assertEquals("Suzuki", swift.getMake());
    }

    @Test
    public void hasCorrectEngine(){
        assertEquals("Hybrid", swift.getEngine().getType());
    }

}
