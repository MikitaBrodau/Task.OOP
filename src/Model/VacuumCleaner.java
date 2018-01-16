package Model;

/**
 * Created by User on 16.01.2018.
 */
public class VacuumCleaner {

    private double powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleaner(double powerConsumption, String filterType, String bagType, String wandType,
                         double motorSpeedRegulation, double cleaningWidth) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }
    public String getFilterType() {
        return filterType;
    }
    public String getBagType() {
        return bagType;
    }
    public String getWandType() {
        return wandType;
    }
    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }
    public double getCleaningWidth() {
        return cleaningWidth;
    }
}
