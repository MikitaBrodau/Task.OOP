package Controller;

import Model.*;

/**
 * Created by User on 16.01.2018.
 */
public class Controller {

    Base base;

    public Controller(Base base) {
        this.base = base;
    }

    public Base getBase() {
        return base;
    }

    public void addOven(Oven oven) {
        base.addOven(oven);
    }
    public void addLaptop(Laptop laptop) {
        base.addLaptop(laptop);
    }
    public void addRefrigerator(Refrigerator refrigerator) {
        base.addRefrigerator(refrigerator);
    }
    public void addVacuumCleaner(VacuumCleaner vacuumCleaner) {
        base.addVacuumCleaner(vacuumCleaner);
    }
    public void addTablePC(TablePC tablePC) {
        base.addTablePC(tablePC);
    }
    public void addSpeakers(Speakers speakers) {
        base.addSpeakers(speakers);
    }

    public int getOvenListSize() {
        return base.getOvenListSize();
    }
    public int getLaptopListSize() {
        return base.getLaptopListSize();
    }
    public int getRefrigeratorListSize() {
        return base.getRefrigeratorListSize();
    }
    public int getVacuumCleanerListSize() {
        return base.getVacuumCleanerListSize();
    }
    public int getTablePCListSize() {
        return base.getTablePCListSize();
    }
    public int getSpeakersListSize() {
        return base.getSpeakersListSize();
    }

    public Oven getOven(int index) {
        return base.getOven(index);
    }
    public Laptop getLaptop(int index) {
        return base.getLaptop(index);
    }
    public Refrigerator getRefrigerator(int index) {
        return base.getRefrigerator(index);
    }
    public VacuumCleaner getVacuumCleaner(int index) {
        return base.getVacuumCleaner(index);
    }
    public TablePC getTablePC(int index) {
        return base.getTablePC(index);
    }
    public Speakers getSpeakers(int index) {
        return base.getSpeakers(index);
    }

}
