package pl.sda.abstractFactory;

public class Rocket implements SpaceShips{

    @Override
    public String getShip() {
        return "Apollo11";
    }

    @Override
    public String startEngine() {
        return "Wrrrrr";
    }

    @Override
    public String toString() {
        return getShip();
    }
}
