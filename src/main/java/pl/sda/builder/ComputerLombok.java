package pl.sda.builder;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ComputerLombok {

    private String CPU;
    private String GPU;
    private String RAM;
    private String HDD;



}
