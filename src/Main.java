import java.util.regex.Pattern;
public class Main {
    public boolean isFirstNameValid(String firstName) throws InvalidFirstNameException {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        if (!Pattern.matches(regex, firstName)) {
            throw new InvalidFirstNameException("Invalid First Name: First name must start with a capital letter and have at least 3 characters.");
        }
        return true;
    }
    public boolean isLastNameValid(String lastName) throws InvalidLastNameException {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        if (!Pattern.matches(regex, lastName)) {
            throw new InvalidLastNameException("Invalid Last Name: Last name must start with a capital letter and have at least 3 characters.");
        }
        return true;
    }
    public boolean isEmailValid(String email) throws InvalidEmailException {
        String regex = "^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        if (!Pattern.matches(regex, email)) {
            throw new InvalidEmailException("Invalid Email: Please enter a valid email in the format abc.xyz@bl.co.in.");
        }
        return true;
    }
    public boolean isMobileValid(String mobileNumber) throws InvalidMobileNumberException {
        String regex = "^[0-9]{1,3} [0-9]{10}$";
        if (!Pattern.matches(regex, mobileNumber)) {
            throw new InvalidMobileNumberException("Invalid Mobile Number: Mobile number must follow the format CountryCode followed by space and 10-digit number.");
        }
        return true;
    }
    public boolean isPasswordValid(String password) throws InvalidPasswordException {
        String rule1 = ".{8,}"; // Minimum 8 characters
        String rule2 = "(?=.*[A-Z]).*"; // At least one uppercase letter
        String rule3 = "(?=.*[0-9]).*"; // At least one numeric number
        String rule4 = "(?=.*[@#$%^&+=!]).*"; // At least one special character

        if (!password.matches(rule1)) {
            throw new InvalidPasswordException("Invalid Password: Password must be at least 8 characters long.");
        }
        if (!password.matches(rule2)) {
            throw new InvalidPasswordException("Invalid Password: Password must contain at least one uppercase letter.");
        }
        if (!password.matches(rule3)) {
            throw new InvalidPasswordException("Invalid Password: Password must contain at least one numeric digit.");
        }
        if (!password.matches(rule4)) {
            throw new InvalidPasswordException("Invalid Password: Password must contain exactly one special character.");
        }
        return true;
    }
    public static void main(String[] args) {
        Main userRegistration = new Main();
        try {
            userRegistration.isFirstNameValid("John");
            userRegistration.isLastNameValid("Doe");
            userRegistration.isEmailValid("abc.xyz@bl.co.in");
            userRegistration.isMobileValid("91 9919819801");
            userRegistration.isPasswordValid("Abc@1234");
            System.out.println("All validations passed successfully.");
        } catch (Exception e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }
}