import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<LendingRegistry> lendingRegistries = new ArrayList<>();
        LendingRegistry lendingRegistry = new LendingRegistry();

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Insert data");
            System.out.println("2. Print data");
            System.out.print("Choose: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    lendingRegistries.add(lendingRegistry);
                    break;
                case 2:
                    lendingRegistry.printInfo(lendingRegistries);
                    break;

                default:
                    System.out.println(":(");
            }
        }
    }
}