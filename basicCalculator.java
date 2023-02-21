import java.util.Scanner;

public class basicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------");
        String operations = "1. Addition\n"
                + "2. Subtraction\n"
                + "3. Multiplication\n"
                + "4. Division";
        System.out.println(operations);
        System.out.println("------------------------\n");
        System.out.println("Choose operation: ");
        String operation = scanner.nextLine();

        System.out.println("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = scanner.nextInt();

        double result = 0;
        switch (operation) {
            case "1":
                result = firstNum + secondNum;
                break;

            case "2":
                result = firstNum - secondNum;
                break;

            case "3":
                result = firstNum * secondNum;
                break;

            default:
                result = firstNum / secondNum;
                break;
        }
        System.out.println("Result: " + result);

    }

}
