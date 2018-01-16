package Model;

/**
 * Created by User on 16.01.2018.
 */
public class Laptop {

    private double batteryCapacity;
    private String os;
    private double memoryROM;
    private double systemMemory;
    private double cpu;
    private double displayInches;

    public Laptop(double batteryCapacity, String os, double memoryROM, double systemMemory, double cpu, double displayInches) {
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryROM = memoryROM;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }
    public String getOs() {
        return os;
    }
    public double getMemoryROM() {
        return memoryROM;
    }
    public double getSystemMemory() {
        return systemMemory;
    }
    public double getCpu() {
        return cpu;
    }
    public double getDisplayInches() {
        return displayInches;
    }
}
