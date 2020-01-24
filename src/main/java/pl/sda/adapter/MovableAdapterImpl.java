package pl.sda.adapter;

public class MovableAdapterImpl implements MovableAdapter {
    private Movable car;
    public MovableAdapterImpl(Movable car){
        this.car = car;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKPH(car.getSpeed());
    }

    private double convertMPHtoKPH(double mph){
        return mph * 1.609344;
    }


    @Override
    public double getFuelConsumption(){
        return getFuelConsumption(car.getFuelConsumption());
    }

    private double convertKMLtoLKM(double KML){
        return KML *
    }
}
