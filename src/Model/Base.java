package Model;

import java.util.ArrayList;

/**
 * Created by User on 16.01.2018.
 */
public class Base {

    public ArrayList<Oven> ovenList = new ArrayList<>();
    public ArrayList<Laptop> laptopList = new ArrayList<>();
    public ArrayList<Refrigerator> refrigeratorList = new ArrayList<>();
    public ArrayList<VacuumCleaner> vacuumCleanerList = new ArrayList<>();
    public ArrayList<TablePC> tablePCList = new ArrayList<>();
    public ArrayList<Speakers> speakersList = new ArrayList<>();

    public void addOven(Oven oven) {
        ovenList.add(oven);
    }
    public void addLaptop(Laptop laptop) {
        laptopList.add(laptop);
    }
    public void addRefrigerator(Refrigerator refrigerator) {
        refrigeratorList.add(refrigerator);
    }
    public void addVacuumCleaner(VacuumCleaner vacuumCleaner) {
        vacuumCleanerList.add(vacuumCleaner);
    }
    public void addTablePC(TablePC tablePC) {
        tablePCList.add(tablePC);
    }
    public void addSpeakers(Speakers speakers) {
        speakersList.add(speakers);
    }

    public int getOvenListSize() {
        return ovenList.size();
    }
    public int getLaptopListSize() {
        return laptopList.size();
    }
    public int getRefrigeratorListSize() {
        return refrigeratorList.size();
    }
    public int getVacuumCleanerListSize() {
        return vacuumCleanerList.size();
    }
    public int getTablePCListSize() {
        return tablePCList.size();
    }
    public int getSpeakersListSize() {
        return speakersList.size();
    }

    public Oven getOven(int index) {
        return ovenList.get(index);
    }
    public Laptop getLaptop(int index) {
        return laptopList.get(index);
    }
    public Refrigerator getRefrigerator(int index) {
        return refrigeratorList.get(index);
    }
    public VacuumCleaner getVacuumCleaner(int index) {
        return vacuumCleanerList.get(index);
    }
    public TablePC getTablePC(int index) {
        return tablePCList.get(index);
    }
    public Speakers getSpeakers(int index) {
        return speakersList.get(index);
    }

}
