package pl.sda.factory;

import pl.sda.abstractFactory.AnimalFacory;
import pl.sda.abstractFactory.FactoryProvider;
import pl.sda.factory.facilties.Zoo;

public class Main {
    public static void main(String[] args) {

        AnimalFacory animalFacory = new AnimalFacory();
        Animal animal1 = animalFacory.create("Duck");

        System.out.println(animal1.makeSound());

        Animal animal2 = animalFacory.create("Dog");

        System.out.println(animal2.makeSound());

        System.out.println(FactoryProvider.getFactory("Animal").create("Dog"));
        System.out.println(FactoryProvider.getFactory("SpaceShips").create("Rocket"));

    }

}
