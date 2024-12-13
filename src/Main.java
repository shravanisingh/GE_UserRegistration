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
        }
    }