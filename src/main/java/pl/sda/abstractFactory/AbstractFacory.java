package pl.sda.abstractFactory;

public interface AbstractFacory<T> {

    T create(String type);

}
