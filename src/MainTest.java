import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testFirstNameValid() {
        Main userRegistration = new Main();
        assertTrue(userRegistration.isFirstNameValid("John")); // Should return true
    }
    @Test
    public void testFirstNameInvalid() {
        Main userRegistration = new Main();
        assertFalse(userRegistration.isFirstNameValid("jo"));   // Should return false
    }
    @Test
    public void testLastNameValid() {
        Main userRegistration = new Main();
        assertTrue(userRegistration.isLastNameValid("Doe"));  // Should return true
    }
    @Test
    public void testLastNameInvalid() {
        Main userRegistration = new Main();
        assertFalse(userRegistration.isLastNameValid("do"));   // Should return false
    }

    @Test
    public void testEmailValid() {
        Main userRegistration = new Main();
        assertTrue(userRegistration.isEmailValid("abc.xyz@bl.co.in")); // Should return true
    }
    @Test
    public void testEmailInvalid() {
        Main userRegistration = new Main();
        assertFalse(userRegistration.isEmailValid("abc@.com.my"));     // Should return false
    }

    // Happy test case for Mobile validation
    @Test
    public void testMobileValid() {
        Main userRegistration = new Main();
        assertTrue(userRegistration.isMobileNumberValid("91 9919819801")); // Should return true
    }
    @Test
    public void testMobileInvalid() {
        Main userRegistration = new Main();
        assertFalse(userRegistration.isMobileNumberValid("919919819801"));  // Should return false
    }
    @Test
    public void testPasswordValid() {
        Main userRegistration = new Main();
        assertTrue(userRegistration.isPasswordSecure("Abc@1234")); // Should return true
    }
    @Test
    public void testPasswordInvalid() {
        Main userRegistration = new Main();
        assertFalse(userRegistration.isPasswordSecure("abc1234")); // Should return false (missing uppercase letter and special character)
    }
}