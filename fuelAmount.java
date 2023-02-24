import java.util.Scanner;

public class fuelAmount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fuel usage per kilometer (ex:0,32): ");
        double fuelUsage = scanner.nextDouble();

        System.out.println("Enter road taken: ");
        int totalRoad = scanner.nextInt();

        double result = fuelUsage * totalRoad;
        System.out.println("Total fuel cost: " + result + "$");
        scanner.close();
    }

}