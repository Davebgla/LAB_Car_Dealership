import Parts.Engine;
import Parts.Fittings;
import Parts.Wheels;
import Parts.Windows;
import People.Customer;
import Vehicles.Petrol;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Petrol mustang;
    Wheels wheels;
    Windows windows;
    Fittings fittings;
    Engine engine;


    @Before
    public void before(){
        customer = new Customer(70000);
        windows = new Windows(4, true);
        fittings = new Fittings(2, false, "Luxury");
        engine = new Engine("Petrol", 5);
        wheels = new Wheels(true, "Sport");
        mustang = new Petrol("Ford", "Mustang", false, wheels, windows, fittings, engine, 60000);
    }

    @Test
    public void hasMoney(){
        assertEquals(70000, customer.getCashMoney(), 0);
    }

    @Test
    public void canBuyVehicle(){
        customer.buyVehicle(mustang);
        assertEquals(1, customer.getOwnedVehicles().size());
    }

}
