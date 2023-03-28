package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write name of country (Germany or France): ");
        String countryId = scanner.next();

        System.out.print("Please write population of town of " + countryId + ": ");
        int population = scanner.nextInt();

        int smallThreshold = 0;
        int mediumThreshold = 0;
        int largeThreshold = 0;


        switch (countryId) {
            case "Germany" -> {
                smallThreshold = 100_000;
                mediumThreshold = 400_000;
                largeThreshold = 1_000_000;

            }
            case "France" -> {
                smallThreshold = 200_000;
                mediumThreshold = 500_000;
                largeThreshold = 1_500_000;
            }
            default -> {
                System.out.println("Invalid country ID");
                return;
            }
        }

        if(population > 0){
            if (population <= smallThreshold) {
                System.out.println("Small city");
            } else if (population <= mediumThreshold) {
                System.out.println("Medium city");
            } else if(population <= largeThreshold) {
                System.out.println("Medium large city");
            }else {
                System.out.println("Large city");
            }
        }
        else{
            System.out.println("Wrong input population!!!");
        }
    }
}
