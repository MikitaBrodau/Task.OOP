package Model;

/**
 * Created by User on 16.01.2018.
 */
public class TablePC {

    private int batteryCapacity;
    private double displayInches;
    private double memoryROM;
    private int flashMemoryCapacity;
    private String color;

    public TablePC(int batteryCapacity, double displayInches, double memoryROM, int flashMemoryCapacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryROM = memoryROM;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    public double getDisplayInches() {
        return displayInches;
    }
    public double getMemoryROM() {
        return memoryROM;
    }
    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }
    public String getColor() {
        return color;
    }
}
