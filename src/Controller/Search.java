package Controller;

/**
 * Created by User on 16.01.2018.
 */
public class Search {

    public void searchOven(Controller controller, String str1, String str2, String str3, String str4, String str5, String str6) {

        System.out.println("\nResult:\n");

        for(int i = 0; i < controller.getOvenListSize(); i++) {

            if((str1.equals("-") || (Double.parseDouble(str1) == controller.getOven(i).getPowerConsumption())) &&
                    (str2.equals("-") || (Double.parseDouble(str2) == controller.getOven(i).getWeight())) &&
                    (str3.equals("-") || (Double.parseDouble(str3) == controller.getOven(i).getCapacity())) &&
                    (str4.equals("-") || (Double.parseDouble(str4) == controller.getOven(i).getDepth())) &&
                    (str5.equals("-") || (Double.parseDouble(str5) == controller.getOven(i).getHeight())) &&
                    (str6.equals("-") || (Double.parseDouble(str6) == controller.getOven(i).getWidth()))) {
                System.out.println("Oven: " + Double.toString(controller.getOven(i).getPowerConsumption()) + " " +
                        Double.toString(controller.getOven(i).getWeight()) + " " +
                        Double.toString(controller.getOven(i).getCapacity()) + " " +
                        Double.toString(controller.getOven(i).getDepth()) + " " +
                        Double.toString(controller.getOven(i).getHeight()) + " " +
                        Double.toString(controller.getOven(i).getWidth()));
            }
        }
    }

    public void searchLaptop(Controller controller, String str1, String str2, String str3, String str4, String str5, String str6) {

        System.out.println("\nResult:\n");

        for(int i = 0; i < controller.getLaptopListSize(); i++) {

            if((str1.equals("-") || (Double.parseDouble(str1) == controller.getLaptop(i).getBatteryCapacity())) &&
                    (str2.equals("-") || (str2.equals(controller.getLaptop(i).getOs()))) &&
                    (str3.equals("-") || (Double.parseDouble(str3) == controller.getLaptop(i).getMemoryROM())) &&
                    (str4.equals("-") || (Double.parseDouble(str4) == controller.getLaptop(i).getSystemMemory())) &&
                    (str5.equals("-") || (Double.parseDouble(str5) == controller.getLaptop(i).getCpu())) &&
                    (str6.equals("-") || (Double.parseDouble(str6) == controller.getLaptop(i).getDisplayInches()))) {
                System.out.println("Laptop: " + Double.toString(controller.getLaptop(i).getBatteryCapacity()) + " " +
                        controller.getLaptop(i).getOs() + " " +
                        Double.toString(controller.getLaptop(i).getMemoryROM()) + " " +
                        Double.toString(controller.getLaptop(i).getSystemMemory()) + " " +
                        Double.toString(controller.getLaptop(i).getCpu()) + " " +
                        Double.toString(controller.getLaptop(i).getDisplayInches()));
            }
        }
    }

    public void searchRefrigerator(Controller controller, String str1, String str2, String str3, String str4, String str5, String str6) {

        System.out.println("\nResult:\n");

        for(int i = 0; i < controller.getRefrigeratorListSize(); i++) {

            if((str1.equals("-") || (Double.parseDouble(str1) == controller.getRefrigerator(i).getPowerConsumption())) &&
                    (str2.equals("-") || (Double.parseDouble(str3) == controller.getRefrigerator(i).getWeight())) &&
                    (str3.equals("-") || (Double.parseDouble(str3) == controller.getRefrigerator(i).getFreezerCapacity())) &&
                    (str4.equals("-") || (Double.parseDouble(str4) == controller.getRefrigerator(i).getOverallCapacity())) &&
                    (str5.equals("-") || (Double.parseDouble(str5) == controller.getRefrigerator(i).getHeight())) &&
                    (str6.equals("-") || (Double.parseDouble(str6) == controller.getRefrigerator(i).getWidth()))) {
                System.out.println("Refrigerator: " + Double.toString(controller.getRefrigerator(i).getPowerConsumption()) + " " +
                        Double.toString(controller.getRefrigerator(i).getWeight()) + " " +
                        Double.toString(controller.getRefrigerator(i).getFreezerCapacity()) + " " +
                        Double.toString(controller.getRefrigerator(i).getOverallCapacity()) + " " +
                        Double.toString(controller.getRefrigerator(i).getHeight()) + " " +
                        Double.toString(controller.getRefrigerator(i).getWidth()));
            }
        }
    }

    public void searchVacuumCleaner(Controller controller, String str1, String str2, String str3, String str4, String str5, String str6) {

        System.out.println("\nResult:\n");

        for(int i = 0; i < controller.getVacuumCleanerListSize(); i++) {

            if((str1.equals("-") || (Double.parseDouble(str1) == controller.getVacuumCleaner(i).getPowerConsumption())) &&
                    (str2.equals("-") || (str2.equals(controller.getVacuumCleaner(i).getFilterType()))) &&
                    (str3.equals("-") || (str3.equals(controller.getVacuumCleaner(i).getBagType()))) &&
                    (str4.equals("-") || (str4.equals(controller.getVacuumCleaner(i).getWandType()))) &&
                    (str5.equals("-") || (Double.parseDouble(str5) == controller.getVacuumCleaner(i).getMotorSpeedRegulation())) &&
                    (str6.equals("-") || (Double.parseDouble(str6) == controller.getVacuumCleaner(i).getCleaningWidth()))) {
                System.out.println("VacuumCleaner: " + Double.toString(controller.getVacuumCleaner(i).getPowerConsumption()) + " " +
                        controller.getVacuumCleaner(i).getFilterType() + " " +
                        controller.getVacuumCleaner(i).getBagType() + " " +
                        controller.getVacuumCleaner(i).getWandType() + " " +
                        Double.toString(controller.getVacuumCleaner(i).getMotorSpeedRegulation()) + " " +
                        Double.toString(controller.getVacuumCleaner(i).getCleaningWidth()));
            }
        }
    }

    public void searchTablePC(Controller controller, String str1, String str2, String str3, String str4, String str5) {

        System.out.println("\nResult:\n");

        for(int i = 0; i < controller.getTablePCListSize(); i++) {

            if((str1.equals("-") || (Integer.parseInt(str1) == controller.getTablePC(i).getBatteryCapacity())) &&
                    (str2.equals("-") || (Double.parseDouble(str2) == controller.getTablePC(i).getDisplayInches())) &&
                    (str3.equals("-") || (Double.parseDouble(str3) == controller.getTablePC(i).getMemoryROM())) &&
                    (str4.equals("-") || (Integer.parseInt(str4) == controller.getTablePC(i).getFlashMemoryCapacity())) &&
                    (str5.equals("-") || (str5.equals(controller.getTablePC(i).getColor())))) {
                System.out.println("TablePC: " + Integer.toString(controller.getTablePC(i).getBatteryCapacity()) + " " +
                        Double.toString(controller.getTablePC(i).getDisplayInches()) + " " +
                        Double.toString(controller.getTablePC(i).getMemoryROM()) + " " +
                        Integer.toString(controller.getTablePC(i).getFlashMemoryCapacity()) + " " +
                        controller.getTablePC(i).getColor());
            }
        }
    }

    public void searchSpeakers(Controller controller, String str1, String str2, String str3, String str4) {

        System.out.println("\nResult:\n");

        for(int i = 0; i < controller.getSpeakersListSize(); i++) {

            if((str1.equals("-") || (Double.parseDouble(str1) == controller.getSpeakers(i).getPowerConsumption())) &&
                    (str2.equals("-") || (Integer.parseInt(str2) == controller.getSpeakers(i).getNumberOfSpeakers())) &&
                    (str3.equals("-") || (str3.equals(controller.getSpeakers(i).getFreqencyRange()))) &&
                    (str4.equals("-") || (Double.parseDouble(str4) == controller.getSpeakers(i).getCordLength()))) {
                System.out.println("Speakers: " + Double.toString(controller.getSpeakers(i).getPowerConsumption()) + " " +
                        Integer.toString(controller.getSpeakers(i).getNumberOfSpeakers()) + " " +
                        controller.getSpeakers(i).getFreqencyRange() + " " +
                        Double.toString(controller.getSpeakers(i).getCordLength()));
            }
        }
    }
}
