import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Method to check if the first name is valid
    public boolean isFirstNameValid(String firstName) {
        String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$"; // Starts with uppercase and at least 3 characters
        return firstName.matches(firstNamePattern);
    }

    // Method to check if the last name is valid
    public boolean isLastNameValid(String lastName) {
        String lastNamePattern = "^[A-Z][a-zA-Z]{2,}$"; // Starts with uppercase and at least 3 characters
        return lastName.matches(lastNamePattern);
    }

    // Method to check if the email is valid
    public boolean isEmailValid(String email) {
        String emailPattern = "^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$"; // Valid email regex
        return email.matches(emailPattern);
    }

    // Method to check if the mobile number is valid
    public boolean isMobileNumberValid(String mobileNumber) {
        String mobilePattern = "^[0-9]{1,3} [0-9]{10}$"; // Country code followed by space and 10-digit number
        return mobileNumber.matches(mobilePattern);
    }

    // Method to check if the password meets all security requirements
    public boolean isPasswordSecure(String password) {
        String minLength = ".{8,}"; // Minimum 8 characters
        String hasUpperCase = "(?=.*[A-Z]).*"; // At least one uppercase letter
        String hasNumber = "(?=.*[0-9]).*"; // At least one numeric number
        String hasSpecialChar = "(?=.*[@#$%^&+=!]).*"; // At least one special character

        return password.matches(minLength) &&
                password.matches(hasUpperCase) &&
                password.matches(hasNumber) &&
                password.matches(hasSpecialChar);
    }

    // Method to validate a list of emails
    public List<Boolean> validateEmailList(List<String> emails) {
        List<Boolean> results = new ArrayList<>();
        for (String email : emails) {
            results.add(isEmailValid(email));
        }
        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main obj=new Main();
        System.out.print("Enter your First Name (starts with a capital letter, minimum 3 characters): ");
        String firstName = sc.next();
        if (!obj.isFirstNameValid(firstName)) {
            System.out.println("Invalid First Name");
        }
        System.out.print("Enter your Last Name (starts with a capital letter, minimum 3 characters): ");
        String lastName = sc.next();
        if (!obj.isLastNameValid(lastName)) {
            System.out.println("Invalid Last Name");
        }
        System.out.print("Enter your Email (e.g., example@domain.com): ");
        String email = sc.next();
        if (!obj.isEmailValid(email)) {
            System.out.println("Invalid Email");
        }
        System.out.print("Enter your Mobile Number (e.g., 91 9876543210): ");
        String number = sc.next();
        if (!obj.isMobileNumberValid(number)) {
            System.out.println("Invalid Mobile Number");
        }
        System.out.print(
                "Enter your Password (minimum 8 characters, at least 1 uppercase, 1 number, 1 special character): ");
        String password = sc.next();
        if (!obj.isPasswordSecure(password)) {
            System.out.println("Invalid Password");
        }
        sc.close();
    }
}