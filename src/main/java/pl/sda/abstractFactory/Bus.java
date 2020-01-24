package pl.sda.abstractFactory;

public class Bus implements Vehicle {
    @Override
    public String getVehicle() {
        return "Bus";
    }

    @Override
    public String startEngine() {
        return "Uruchomiono silnik autobusu";
    }
}
