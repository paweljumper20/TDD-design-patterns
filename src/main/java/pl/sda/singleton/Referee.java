package pl.sda.singleton;

public class Referee {

    private static Referee instance;

    private Referee() {
    }

    public synchronized static Referee getInstance() {
        if (instance == null) {
            instance = new Referee();
        }
        return instance;
    }

    public void wlepCzerwonaKartke() {
        System.out.println("Czerwona Kartka");
    }



}
