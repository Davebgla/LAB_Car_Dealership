import Parts.*;
import People.Customer;
import Vehicles.*;
import businesses.Dealership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealer;
    Petrol mustang;
    Wheels mustangWheels;
    Windows mustangWindows;
    Fittings mustangFittings;
    Engine mustangEngine;
    Electric tesla;
    Wheels wheels;
    Windows windows;
    Fittings fittings;
    Engine engine;
    Customer customer;


    @Before
    public void before(){
        dealer = new Dealership(1000000);
        mustangWindows = new Windows(4, true);
        mustangFittings = new Fittings(2, false, "Luxury");
        mustangEngine = new Engine("Petrol", 5);
        mustangWheels = new Wheels(true, "Sport");
        mustang = new Petrol("Ford", "Mustang", true, mustangWheels, mustangWindows, mustangFittings, mustangEngine, 60000);
        windows = new Windows(4, true);
        fittings = new Fittings(5, true, "Luxury");
        engine = new Engine("Electric", 0);
        wheels = new Wheels(true, "Sport");
        tesla = new Electric("Tesla", "Model X", false, wheels, windows, fittings, engine, 40000);
        customer = new Customer(50000);
        dealer.addCarToStock(mustang);
        dealer.addCarToStock(tesla);
    }

    @Test
    public void hasTill(){
        assertEquals(1000000, dealer.getTill(), 0);
    }

    @Test
    public void canAddToStock(){
        assertEquals(2, dealer.getStock().size());
    }

    @Test
    public void canSellCarToCustomer(){
        dealer.sellCarToCustomer(tesla, customer);
        assertEquals(1, dealer.getStock().size());
        assertEquals(1040000, dealer.getTill(), 0);
        assertEquals(1, customer.getOwnedVehicles().size());
    }

    @Test
    public void canApplyDiscount(){
        dealer.sellCarToCustomer(mustang, customer);
        assertEquals(1050000, dealer.getTill(), 0);
    }

    @Test
    public void canRepairCar(){
        dealer.repairCar(mustang, 10000);
        assertEquals(990000, dealer.getTill(), 0);
    }

}
