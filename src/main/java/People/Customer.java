package People;
import Vehicles.Car;
import java.util.ArrayList;

public class Customer {

    double cashMoney;
    ArrayList<Car> ownedVehicles;

    public Customer(double cashMoney) {
        this.cashMoney = cashMoney;
        this.ownedVehicles = new ArrayList<Car>();
    }

    public double getCashMoney() {
        return cashMoney;
    }

    public void setCashMoney(double cashMoney) {
        this.cashMoney = cashMoney;
    }

    public ArrayList<Car> getOwnedVehicles() {
        return ownedVehicles;
    }

    public void setOwnedVehicles(ArrayList<Car> ownedVehicles) {
        this.ownedVehicles = ownedVehicles;
    }

    public void buyVehicle(Car car){
        this.ownedVehicles.add(car);
    }
}
