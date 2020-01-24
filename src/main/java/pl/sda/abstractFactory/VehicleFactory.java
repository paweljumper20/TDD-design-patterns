package pl.sda.abstractFactory;

public class VehicleFactory implements AbstractFacory<Vehicle>{


    @Override
    public Vehicle create(String type) {
        if ("Car".equalsIgnoreCase(type)) {
            return new Car();
        } else if ("Bus".equalsIgnoreCase(type)) {
            return new Bus();
        }
        return null;
    }
}
