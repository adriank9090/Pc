package com.example.PC;

public class PcDTO {
    private String cpu;
    private int cpuSpeed;
    private String ram;

    public PcDTO() {
    }

    public PcDTO(String cpu, int cpuSpeed, String ram) {
        this.cpu = cpu;
        this.cpuSpeed = cpuSpeed;
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(int cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}
