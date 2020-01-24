package pl.sda.abstractFactory;

import pl.sda.factory.Animal;
import pl.sda.factory.Dog;

public class AnimalFacory implements AbstractFacory<Animal>{

    @Override
    public Animal create(String type) {
        if ("Dog".equalsIgnoreCase(type)) {
            return new Dog();
        } else if ("Duck".equalsIgnoreCase(type)) {
            return new Duck();
        }
        return null;
    }
}
