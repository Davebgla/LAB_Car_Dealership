package businesses;

import People.Customer;
import Vehicles.Car;

import java.util.ArrayList;

public class Dealership {

    double till;
    ArrayList<Car> stock;

    public Dealership(double till) {
        this.till = till;
        this.stock = new ArrayList<Car>();
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<Car> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Car> stock) {
        this.stock = stock;
    }

    public void addCarToStock(Car car){
        this.stock.add(car);
    }

    public void sellCarToCustomer(Car car, Customer customer){
        double carValue = car.getPrice();
        if(car.getDamaged() == true){
            carValue -= 10000;
        }
        double customerMoney = customer.getCashMoney();
        double newMoney = customerMoney -= carValue;
        customer.setCashMoney(newMoney);
        this.till += carValue;
        this.stock.remove(car);
        customer.buyVehicle(car);
    }

    public void repairCar(Car car, double repairCost){
        this.till -= repairCost;
        car.setDamaged(false);
    }

}
