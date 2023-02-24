import java.util.Scanner;

public class switcher {

    // This project switches the first and second number received from the user

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNum = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondNum = scanner.nextInt();

        int temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;

        System.out.println("First number (switched): " + firstNum);
        System.out.println("Second number (switched): " + secondNum);
        scanner.close();
    }

}