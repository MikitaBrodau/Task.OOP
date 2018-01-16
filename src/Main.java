import Controller.Controller;
import Controller.Parser;
import Controller.Search;
import Model.Base;
import java.util.Scanner;

/**
 * Created by User on 16.01.2018.
 */
public class Main {
    public static void main(String[] args) {

        Base base = new Base();
        Controller controller = new Controller(base);
        Parser parser = new Parser(controller);
        parser.init();

        Search search = new Search();

        int index;

        while (true) {

            System.out.println("-----------------------------------------------------------------------");
            System.out.println("\nChoose product category:");
            System.out.println("1. Oven");
            System.out.println("2. Laptop");
            System.out.println("3. Refrigerator");
            System.out.println("4. VacuumCleaner");
            System.out.println("5. TablePC");
            System.out.println("6. Speakers");

            System.out.println("7. Exit\n");
            System.out.print("Your choice: ");

            Scanner in = new Scanner(System.in);
            index = in.nextInt();

            switch (index) {
                case 1:
                    System.out.println("\nWrite options to search (for nothing use '-') in sequence:");
                    System.out.println("powerConsumption weight capacity depth height width");
                    search.searchOven(controller, in.next(), in.next(), in.next(), in.next(), in.next(), in.next());
                    break;
                case 2:
                    System.out.println("\nWrite options to search (for nothing use '-') in sequence:");
                    System.out.println("batteryCapacity os memoryROM systemMemory cpu displayInches");
                    search.searchLaptop(controller, in.next(), in.next(), in.next(), in.next(), in.next(), in.next());
                    break;
                case 3:
                    System.out.println("\nWrite options to search (for nothing use '-') in sequence:");
                    System.out.println("powerConsumption weight freezerCapacity overallCapacity height width");
                    search.searchRefrigerator(controller, in.next(), in.next(), in.next(), in.next(), in.next(), in.next());
                    break;
                case 4:
                    System.out.println("\nWrite options to search (for nothing use '-') in sequence:");
                    System.out.println("powerConsumption filterType bagType wandType motorSpeedRegulation cleaningWidth");
                    search.searchVacuumCleaner(controller, in.next(), in.next(), in.next(), in.next(), in.next(), in.next());
                    break;
                case 5:
                    System.out.println("\nWrite options to search (for nothing use '-') in sequence:");
                    System.out.println("batteryCapacity displayInches memoryROM flashMemoryCapacity color");
                    search.searchTablePC(controller, in.next(), in.next(), in.next(), in.next(), in.next());
                    break;
                case 6:
                    System.out.println("\nWrite options to search (for nothing use '-') in sequence:");
                    System.out.println("powerConsumption numberOfSpeakers freqencyRange cordLength");
                    search.searchSpeakers(controller, in.next(), in.next(), in.next(), in.next());
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}
