package com.bridgelabz.userregistrationjunit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for validating first name
 */
public class UserRegistrationTest {
    UserRegistration userRegistration;
    @Before
    public void before() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Srikanth");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
        boolean result = userRegistration.firstName("srikanth");
        Assert.assertEquals(false, result);
    }
    /**
     * Unit test for validating last name
     */
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Mishra");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("mishra");
        Assert.assertEquals(false, result);

    }
    /**
     * Unit test for validating email address
     */
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.email("abc@gmail.com.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.email("abc()*@gmail.com");
        Assert.assertEquals(false, result);
    }
    /**
     * Unit test for validating format of mobile number
     */
    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.phoneNumber("91 9372456598");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFlase() {
        boolean result = userRegistration.phoneNumber("+91 9372456598");
        Assert.assertEquals(false, result);
    }
    /**
     * Unit test for validating password with minimum 8 character
     */
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.password("password@123");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.password("psw@");
        Assert.assertEquals(false, result);
    }
    /**
     * Unit test for validating password with atleast one upper case
     */
    @Test
    public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.passwordRule2("passWord@123");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.passwordRule2("psw@");
        Assert.assertEquals(false, result);
    }
    /**
     * Unit test for validating password with atleast one numeric number
     */
    @Test
    public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.passwordRule3("123Aa@123");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.passwordRule3("123456789");
        Assert.assertEquals(false, result);
    }
    /**
     * Unit test for validating password with exactly one special character
     */
    @Test
    public void givenPasswordRule4_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.passwordRule4("1234@Abc");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenPasswordRule4_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.passwordRule4("akdj@ds@A");
        Assert.assertEquals(false, result);
    }
    /**
     * Unit test for validating email sequence
     */

    @Test
    public void givenEmail1_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenEmail1_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
        Assert.assertEquals(false, result);
    }
    /**
     * Unit test for validating mood of the User
     */

    @Test
    public void givenMessage_WhenHappy_ShouldReturnEntrySuccessful() {
        String result = MoodAnalayser.analyseMood("User is Happy");
        Assert.assertEquals("Entry Successful", result);
    }
    @Test
    public void givenEmail2_WhenNotProper_ShouldReturnEntryFailed() {
        String result = MoodAnalayser.analyseMood("User is Sad");
        Assert.assertEquals("Entry Failed", result);
    }
}

