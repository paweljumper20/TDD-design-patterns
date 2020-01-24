package pl.sda.builder;

public class Computer {

    private String CPU;
    private String GPU;
    private String RAM;
    private String HDD;

    public String getCPU() {
        return CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
    }

    public static class ComputerBuilder {
        private String CPU;
        private String GPU;
        private String RAM;
        private String HDD;

        public ComputerBuilder() {
        }

        public ComputerBuilder(String CPU, String GPU, String RAM, String HDD) {
            this.CPU = CPU;
            this.GPU = GPU;
            this.RAM = RAM;
            this.HDD = HDD;
        }

        public ComputerBuilder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public ComputerBuilder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public ComputerBuilder setHDD(String HDD) {
            this.HDD = HDD;
            return this;
        }

        public ComputerBuilder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
