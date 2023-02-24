import java.util.Scanner;

public class login {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int loginNum = 3;

        String sysUsername = "Ferdi Can";
        String sysPassword = "12345";

        while (true) {

            System.out.print("Username: ");
            String Username = scanner.nextLine();
            System.out.print("Password: ");
            String Password = scanner.nextLine();

            if (Username.equals(sysUsername) && Password.equals(sysPassword)) {

                System.out.println("Welcome, " + Username);
                break;
        
            } else if (Username.equals(sysUsername) && !(Password.equals(sysPassword))) {

                System.out.println("Wrong password!");
                loginNum -= 1;

            } else if (!(Username.equals(sysUsername)) && Password.equals(sysPassword)) {

                System.out.println("Wrong username!");
                loginNum -= 1;
            
            } else {

                System.out.println("Wrong username and password!");
                loginNum -= 1;
            
            } if (loginNum == 0) {

                System.out.println("Your login has expired, please try again later.");
                break;
            }
            scanner.close();
        }
    }
}
