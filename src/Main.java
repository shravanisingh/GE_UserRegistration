import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String regUser = "^[A-Z][a-zA-Z]{2,}$";
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if (!name.matches(regUser)) {
            System.out.println("Invalid Name");
        }
    }
}