package pl.sda.abstractFactory;

public class SpaceShipFactory implements AbstractFacory<SpaceShips> {
    public SpaceShips create(String type){
        if("Rocket".equalsIgnoreCase(type)){
            return new Rocket();
        }
        else if("Shuttle".equalsIgnoreCase(type)){
            return new Shuttle();
        }
        return null;
    }
}
