package pl.sda.builder;

public class Main {
    public static void main(String[] args) {
        Computer.ComputerBuilder cb =
                new Computer.ComputerBuilder();

        Computer komputer = cb.setCPU("Intel i7").setGPU("Nvidia").setHDD("HDD").setRAM("250").build();

        Computer.ComputerBuilder cb2 = new  Computer.ComputerBuilder("","","","");

        Computer komputer1 = cb2.build();

        ComputerLombok.ComputerLombokBuilder clb = new ComputerLombok.ComputerLombokBuilder();

        ComputerLombok  computerLombok = clb.CPU("").GPU("").HDD("").build();



    }
}
