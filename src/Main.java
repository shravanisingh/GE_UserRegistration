import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String regUser = "^[A-Z][a-zA-Z]{2,}$";
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        if (!firstName.matches(regUser)) {
            System.out.println("Invalid First Name");
        }
        String lastName = sc.next();
        if (!lastName.matches(regUser)) {
            System.out.println("Invalid Last Name");
        }
        String emailReg = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        String email = sc.next();
        if (!email.matches(emailReg)) {
            System.out.println("Invalid email");
        }
        String numReg = "^[1-9][0-9]{1,2} [6-9][0-9]{9}$";
        String number = sc.next();
        if (!number.matches(numReg)) {
            System.out.println("Invalid Number");
        }
        String passwordReg = "[a-zA-Z0-9,.%&$#@!^*]{8,}$";
        String password = sc.next();
        if (!password.matches(passwordReg)) {
            System.out.println("Invalid Password");
        }
        }
    }