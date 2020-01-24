package pl.sda.abstractFactory;

public class Car implements Vehicle {
    @Override
    public String getVehicle() {
        return "Car";
    }

    @Override
    public String startEngine() {
        return "Uruchomiono silnik samochodu!";
    }
}
