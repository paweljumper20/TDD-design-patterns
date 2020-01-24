package pl.sda.factory;

import pl.sda.factory.facilties.Zoo;

public class Dog implements Animal{

    public String getAnimal() {
        return "Dog";
    }

    public String makeSound() {
        return "Hau!";
    }

}
