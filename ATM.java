import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        /*
         * 1st Action : balance learning
         * 2nd Action : balance learning
         * 3rd Action : deposit
         * Quit : q
         */
        Scanner scanner = new Scanner(System.in);

        int balance = 1000;
        String actions = "1st Action : Balance learning\n"
                + "2nd Action : Withdraw\n"
                + "3rd Action : Deposit\n"
                + "Quit : Press q";

        System.out.println("--------------------------------");
        System.out.println(actions);
        System.out.println("--------------------------------");

        while (true) {

            System.out.println("Please choose action: ");
            String action = scanner.nextLine();

            if (action.equals("q")) {

                System.out.println("Exiting the program...");
                break;
            } else if (action.equals("1")) {

                System.out.println("Your balance: " + balance + "$");

            } else if (action.equals("2")) {

                System.out.println("Amount to be withdrawn: ");
                int amount = scanner.nextInt();
                scanner.nextLine();

                if (balance - amount < 0) {

                    System.out.println("insufficient balance. Your balance: " + balance);

                } else {

                    balance -= amount;
                    System.out.println("New balance: " + balance);
                }

            } else if (action.equals("3")) {

                System.out.println("Amount to be deposited");
                int amount = scanner.nextInt();
                scanner.nextLine();
                balance += amount;
                System.out.println("New balance: " + balance);

            } else {

                System.out.println("Invalid action!");
            }
        }
        scanner.close();

    }
}
