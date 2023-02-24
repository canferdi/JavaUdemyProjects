import java.util.Scanner;

public class maxNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int firstNum = scanner.nextInt();
        
        System.out.println("Enter second number: ");
        int secondNum = scanner.nextInt();

        System.out.println("Enter third number: ");
        int thirdNum = scanner.nextInt();

        int maxNum = 0;

        if (firstNum >= secondNum && firstNum >= thirdNum) {
            maxNum = firstNum;
        }
        else if (secondNum >= firstNum && secondNum >= thirdNum) {
            maxNum = secondNum;
        }
        else {
            maxNum = thirdNum;
        }
        
        System.out.println("Max number : " + maxNum);
        scanner.close();
    }
}