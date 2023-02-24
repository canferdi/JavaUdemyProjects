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
        System.out.print("Your BMI: " + bmi + " ");
        
        if (bmi < 16.5) {
            System.out.println("Weak");
        }
        else if (18.5 < bmi && bmi < 25) {
            System.out.println("Normal");
        }
        else if (25 < bmi && bmi < 30) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
        scanner.close();


    
    }
    
}