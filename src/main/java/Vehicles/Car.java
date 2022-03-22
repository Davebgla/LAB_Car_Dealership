package Vehicles;

import Parts.Engine;
import Parts.Fittings;
import Parts.Wheels;
import Parts.Windows;

public abstract class Car {

    String make;
    String model;
    Boolean damaged;
    double price;
    Wheels wheels;
    Windows windows;
    Fittings fittings;

    public Car(String make, String model, Boolean damaged, Wheels wheels, Windows windows, Fittings fittings, double price) {
        this.make = make;
        this.model = model;
        this.damaged = damaged;
        this.wheels = wheels;
        this.windows = windows;
        this.fittings = fittings;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getDamaged() {
        return damaged;
    }

    public void setDamaged(Boolean damaged) {
        this.damaged = damaged;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Windows getWindows() {
        return windows;
    }

    public void setWindows(Windows windows) {
        this.windows = windows;
    }

    public Fittings getFittings() {
        return fittings;
    }

    public void setFittings(Fittings fittings) {
        this.fittings = fittings;
    }
}
