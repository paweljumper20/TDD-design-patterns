package pl.sda;

import pl.sda.adapter.Movable;
import pl.sda.adapter.MovableAdapter;
import pl.sda.adapter.MovableAdapterImpl;
import pl.sda.adapter.TeslaS;
import pl.sda.singleton.Referee;

public class Main {

    public static void main(String[] args) {
        Movable car = new TeslaS();
        MovableAdapter movableAdapter = new MovableAdapterImpl(car);

        System.out.println( movableAdapter.getSpeed());

    }
}
