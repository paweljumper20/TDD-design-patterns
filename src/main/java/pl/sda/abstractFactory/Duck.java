package pl.sda.abstractFactory;

import pl.sda.factory.Animal;
import pl.sda.factory.facilties.Zoo;

public class Duck implements Animal {

    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "quack!";
    }

    public Duck getDuck() {
        return new Duck();
    }
}
