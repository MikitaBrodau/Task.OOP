package Model;

/**
 * Created by User on 16.01.2018.
 */
public class Oven {

    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public Oven(double powerConsumption, double weight, double capacity, double depth, double height, double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }
    public double getWeight() {
        return weight;
    }
    public double getCapacity() {
        return capacity;
    }
    public double getDepth() {
        return depth;
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
}
