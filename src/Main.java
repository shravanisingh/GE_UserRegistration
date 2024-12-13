import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Regex for First Name and Last Name
        String regUser = "^[A-Z][a-zA-Z]{2,}$";
        // Regex for Email
        String emailReg = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        // Regex for Phone Number
        String numReg = "^[1-9][0-9]{1,2} [6-9][0-9]{9}$";
        // Regex for Password
        String passwordReg = "^(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z\\d]).{8,}$";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First Name (starts with a capital letter, minimum 3 characters): ");
        String firstName = sc.next();
        if (!firstName.matches(regUser)) {
            System.out.println("Invalid First Name");
        }
        System.out.print("Enter your Last Name (starts with a capital letter, minimum 3 characters): ");
        String lastName = sc.next();
        if (!lastName.matches(regUser)) {
            System.out.println("Invalid Last Name");
        }
        System.out.print("Enter your Email (e.g., example@domain.com): ");
        String email = sc.next();
        if (!email.matches(emailReg)) {
            System.out.println("Invalid Email");
        }
        System.out.print("Enter your Mobile Number (e.g., 91 9876543210): ");
        String number = sc.next();
        if (!number.matches(numReg)) {
            System.out.println("Invalid Mobile Number");
        }
        System.out.print(
                "Enter your Password (minimum 8 characters, at least 1 uppercase, 1 number, 1 special character): ");
        String password = sc.next();
        if (!password.matches(passwordReg)) {
            System.out.println("Invalid Password");
        }
        sc.close();
    }
}