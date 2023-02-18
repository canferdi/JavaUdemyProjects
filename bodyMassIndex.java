import java.util.Scanner;

//Body Mass Index : Weight / Height(m) * Height(m)

public class bodyMassIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your weight: ");
        int weight = scanner.nextInt();
        
        System.out.println("Enter your height (ex:1,72): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("Your BMI: " + bmi);


    
    }
    
}