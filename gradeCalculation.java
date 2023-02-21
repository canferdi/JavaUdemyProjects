import java.util.Scanner;

public class gradeCalculation {
    /*
    Midterm1 30%
    Midterm2 30%
    Final 40%

    Total note : 
    >=90 AA
    >=85 BA
    >=80 BB
    >=75 CB
    >=70 CC
    >=65 DC
    >=60 DD
    >=55 FD
    <55 FF
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter midterm1: ");
        int midterm1 = scanner.nextInt();
        System.out.println("Enter midterm2: ");
        int midterm2 = scanner.nextInt();
        System.out.println("Enter final: ");
        int finalNote = scanner.nextInt();
        System.out.println("Enter your average grade: ");
        double avgGrade = scanner.nextDouble();
        
        double totalNote = midterm1 * 0.3 + midterm2 * 0.3 + finalNote * 0.4;

        if (totalNote >= 90) {
            
            System.out.println("AA");
        }
        else if (totalNote >= 85) {

            System.out.println("BA");
        }
        else if (totalNote >= 80) {

            System.out.println("BB");
        }
        else if (totalNote >= 75) {

            System.out.println("CB");
        }
        else if (totalNote >= 70) {

            System.out.println("CC");
        }
        else if (totalNote >= 65) {

            System.out.println("DC");
        }
        else if (totalNote >= 60) {

            System.out.println("DD");
            if (avgGrade <= 2.50) {
                System.out.println("You may consider taking the course again with a low GPA.");
            }
        }
        else if (totalNote >= 55) {

            System.out.println("FD");
            System.out.println("You failed the class...");
        }
        else {
            
            System.out.println("FF");
            System.out.println("You failed the class...");

        }
        

    }
}
