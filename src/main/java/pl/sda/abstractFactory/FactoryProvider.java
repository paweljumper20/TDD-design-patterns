package pl.sda.abstractFactory;

public class FactoryProvider {

    public static AbstractFacory getFactory(String wybor) {
        if ("Animal".equalsIgnoreCase(wybor)) {
            return new AnimalFacory();
        } else if ("Vehicle".equalsIgnoreCase(wybor)) {
            return new VehicleFactory();
        }else if("SpaceShips".equalsIgnoreCase(wybor)){
            return new SpaceShipFactory();
        }

        return null;
    }

}
