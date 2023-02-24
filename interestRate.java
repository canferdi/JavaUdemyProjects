import java.util.Scanner;

public class interestRate {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our bank. Interest rate: 6%");
        
        int initialMoney , maturity;
        
        System.out.print("Amount to be deposited: ");
        initialMoney = scanner.nextInt();
        System.out.print("Maturity amount");
        maturity = scanner.nextInt();

        double totalMoney = initialMoney;
        double interestRate = 0.06;

        for (int i = 1 ; i <= maturity ; i++) {

            totalMoney = (totalMoney * interestRate) + totalMoney;
            System.out.println(i + " year later: " + totalMoney);

        }
        scanner.close();
    }
}
