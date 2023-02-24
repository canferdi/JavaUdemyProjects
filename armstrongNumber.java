import java.util.Scanner;

public class armstrongNumber {
    /*
    1634 = 1^4 + 6^4 + 3^4 + 4^4 is armstrong
    371 = 3^3 + 7^3 + 1^3  is not armstrong
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Please enter number of digits: ");
        int digitNum = scanner.nextInt();

        int tempNum = number;
        int total = 0;

        do {

            int digitValue = tempNum % 10;
            tempNum /= 10;

            total += Math.pow(digitValue, digitNum);

        } while (tempNum > 0);

        if (number == total) {

            System.out.println("The number is Armstrong number...");

        } else {

            System.out.println("The number is not Armstrong number...");
        }
        scanner.close();
    }
}
