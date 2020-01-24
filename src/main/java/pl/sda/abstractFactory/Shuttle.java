package pl.sda.abstractFactory;

public class Shuttle implements SpaceShips {
    @Override
    public String getShip() {
        return "Atlantis";
    }

    @Override
    public String startEngine() {
        return "Szzzzzz";
    }
}
