import java.util.Scanner;

/**
 * triangleHipotenus
 */
public class triangleHipotenus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first edge: ");
        int a = scanner.nextInt();

        System.out.println("Enter second edge: ");
        int b = scanner.nextInt();

        double hipotenus = Math.sqrt(a * a + b * b);
        System.out.println("Hipotenus: " + hipotenus);
        scanner.close();

    }
}