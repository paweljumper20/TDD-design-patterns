package pl.sda.factory.facilties;

public class Zoo {

    private String animalName;

    public Zoo(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public String toString() {
        return "Zwierzę " + animalName + " przyjęte do Zoo";
    }
}
