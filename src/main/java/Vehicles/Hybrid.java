package Vehicles;

import Parts.Engine;
import Parts.Fittings;
import Parts.Wheels;
import Parts.Windows;

public class Hybrid extends Car{

    Engine engine;

    public Hybrid(String make, String model, Boolean damaged, Wheels wheels, Windows windows, Fittings fittings, Engine engine, double price) {
        super(make, model, damaged, wheels, windows, fittings, price);

        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
