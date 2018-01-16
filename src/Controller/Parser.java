package Controller;

import Model.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 16.01.2018.
 */
public class Parser {

    Controller controller;

    private List<String> strings = new ArrayList<>();
    private String line;
    private String str1;
    private String str2;
    private String str3;
    private String str4;
    private String str5;
    private String str6;

    private int index1;
    private int index2;

    public Parser(Controller controller) {
        this.controller = controller;
    }

    public void init() {

        try{
            BufferedReader br = new BufferedReader(new FileReader("appliances_db.txt"));
            while((line = br.readLine()) != null) {
                strings.add(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e);
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }

        for(int i = 0; i < strings.size(); i++) {

            String currentLine = strings.get(i);

            if(currentLine.startsWith("Oven")) {

                index1 = currentLine.indexOf("POWER_CONSUMPTION=") + "POWER_CONSUMPTION=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str1 = currentLine.substring(index1, index2);

                //////////////////////////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("WEIGHT=") + "WEIGHT=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str2 = currentLine.substring(index1, index2);

                ///////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("CAPACITY=") + "CAPACITY=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str3 = currentLine.substring(index1, index2);

                /////////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("DEPTH=") + "DEPTH=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str4 = currentLine.substring(index1, index2);

                /////////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("HEIGHT=") + "HEIGHT=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str5 = currentLine.substring(index1, index2);

                /////////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("WIDTH=") + "WIDTH=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str6 = currentLine.substring(index1, index2);

                Oven oven = new Oven(Double.parseDouble(str1), Double.parseDouble(str2), Double.parseDouble(str3),
                        Double.parseDouble(str4), Double.parseDouble(str5), Double.parseDouble(str6));
                controller.addOven(oven);
            }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if(currentLine.startsWith("Laptop")) {

                index1 = currentLine.indexOf("BATTERY_CAPACITY=") + "BATTERY_CAPACITY=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str1 = currentLine.substring(index1, index2);

                //////////////////////////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("OS=") + "OS=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str2 = currentLine.substring(index1, index2);

                ///////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("MEMORY_ROM=") + "MEMORY_ROM=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str3 = currentLine.substring(index1, index2);

                /////////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("SYSTEM_MEMORY=") + "SYSTEM_MEMORY=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str4 = currentLine.substring(index1, index2);

                /////////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("CPU=") + "CPU=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str5 = currentLine.substring(index1, index2);

                /////////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("DISPLAY_INCHES=") + "DISPLAY_INCHES=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str6 = currentLine.substring(index1, index2);

                Laptop laptop = new Laptop(Double.parseDouble(str1), str2, Double.parseDouble(str3),
                        Double.parseDouble(str4), Double.parseDouble(str5), Double.parseDouble(str6));
                controller.addLaptop(laptop);
            }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if(currentLine.startsWith("Refrigerator")) {

                index1 = currentLine.indexOf("POWER_CONSUMPTION=") + "POWER_CONSUMPTION=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str1 = currentLine.substring(index1, index2);

                //////////////////////////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("WEIGHT=") + "WEIGHT=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str2 = currentLine.substring(index1, index2);

                ///////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("FREEZER_CAPACITY=") + "FREEZER_CAPACITY=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str3 = currentLine.substring(index1, index2);

                /////////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("OVERALL_CAPACITY=") + "OVERALL_CAPACITY=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str4 = currentLine.substring(index1, index2);

                /////////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("HEIGHT=") + "HEIGHT=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str5 = currentLine.substring(index1, index2);

                /////////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("WIDTH=") + "WIDTH=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str6 = currentLine.substring(index1, index2);

                Refrigerator refrigerator = new Refrigerator(Double.parseDouble(str1), Double.parseDouble(str2), Double.parseDouble(str3),
                        Double.parseDouble(str4), Double.parseDouble(str5), Double.parseDouble(str6));
                controller.addRefrigerator(refrigerator);
            }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if(currentLine.startsWith("VacuumCleaner")) {

                index1 = currentLine.indexOf("POWER_CONSUMPTION=") + "POWER_CONSUMPTION=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str1 = currentLine.substring(index1, index2);

                //////////////////////////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("FILTER_TYPE=") + "FILTER_TYPE=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str2 = currentLine.substring(index1, index2);

                ///////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("BAG_TYPE=") + "BAG_TYPE=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str3 = currentLine.substring(index1, index2);

                /////////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("WAND_TYPE=") + "WAND_TYPE=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str4 = currentLine.substring(index1, index2);

                /////////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("MOTOR_SPEED_REGULATION=") + "MOTOR_SPEED_REGULATION=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str5 = currentLine.substring(index1, index2);

                /////////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("CLEANING_WIDTH=") + "CLEANING_WIDTH=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str6 = currentLine.substring(index1, index2);

                VacuumCleaner vacuumCleaner = new VacuumCleaner(Double.parseDouble(str1), str2, str3, str4,
                        Double.parseDouble(str5), Double.parseDouble(str6));
                controller.addVacuumCleaner(vacuumCleaner);
            }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if(currentLine.startsWith("TablePC")) {

                index1 = currentLine.indexOf("BATTERY_CAPACITY=") + "BATTERY_CAPACITY=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str1 = currentLine.substring(index1, index2);

                //////////////////////////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("DISPLAY_INCHES=") + "DISPLAY_INCHES=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str2 = currentLine.substring(index1, index2);

                ///////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("MEMORY_ROM=") + "MEMORY_ROM=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str3 = currentLine.substring(index1, index2);

                /////////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("FLASH_MEMORY_CAPACITY=") + "FLASH_MEMORY_CAPACITY=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str4 = currentLine.substring(index1, index2);

                /////////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("COLOR=") + "COLOR=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str5 = currentLine.substring(index1, index2);

                TablePC tablePC = new TablePC(Integer.parseInt(str1), Double.parseDouble(str2), Double.parseDouble(str3),
                        Integer.parseInt(str4), str5);
                controller.addTablePC(tablePC);
            }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if(currentLine.startsWith("Speakers")) {

                index1 = currentLine.indexOf("POWER_CONSUMPTION=") + "POWER_CONSUMPTION=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str1 = currentLine.substring(index1, index2);

                //////////////////////////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("NUMBER_OF_SPEAKERS=") + "NUMBER_OF_SPEAKERS=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str2 = currentLine.substring(index1, index2);

                ///////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("FREQENCY_RANGE=") + "FREQENCY_RANGE=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str3 = currentLine.substring(index1, index2);

                /////////////////////////////////////////////////////////////////////////

                index1 = currentLine.indexOf("CORD_LENGTH=") + "CORD_LENGTH=".length();
                index2 = 0;
                for(int j = index1; j < currentLine.length(); j++) {
                    if(currentLine.charAt(j) == ',' || currentLine.charAt(j) == ';') {
                        index2 = j;
                        break;
                    }
                }
                str4 = currentLine.substring(index1, index2);

                Speakers speakers = new Speakers(Double.parseDouble(str1), Integer.parseInt(str2), str3, Double.parseDouble(str4));
                controller.addSpeakers(speakers);
            }
        }

    }
}
