package Model;

/**
 * Created by User on 16.01.2018.
 */
public class Speakers {

    private double powerConsumption;
    private int numberOfSpeakers;
    private String freqencyRange;
    private double cordLength;

    public Speakers(double powerConsumption, int numberOfSpeakers, String freqencyRange, double cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.freqencyRange = freqencyRange;
        this.cordLength = cordLength;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }
    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }
    public String getFreqencyRange() {
        return freqencyRange;
    }
    public double getCordLength() {
        return cordLength;
    }
}
