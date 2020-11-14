/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A class to test the methods in our passwordValidator
 * To be used as starter code for ICE 4
 * @author Min Woo, 2020
 */
public class PasswordValidatorTest {
    
    public PasswordValidatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of checkLength method, of class PasswordValidator.
     * This test gives a good input of MyPassword123, which should
     * easily be long enough to be a good length.
     */
    @Test
    public void testCheckLengthGood() {
        String pass = "MyPassword123";
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(true, result);
       
    }
    
    /**
     * A test that will ensure a failing password actually
     * returns false from the checkLength method
     */
    @Test
    public void testCheckLengthBad()
    {
         String pass = "tooShor";
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(false, result);
    }
    
    /**
     * A test that checks that when we give a password of exactly
     * length 8, we see a pass. What happens if you adjust the code
     * from >= to just >? Make sure your test will catch it for you!
     */
    @Test
    public void testCheckLengthBoundary()
    {
         String pass = "notShort";
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(true, result);
    }
    
    /**
     * Test of checkUpperCase method, of class PasswordValidator.
     * This test gives a good input of MyPassword123, which should
     * be acceptable a password.
     */
    @Test
    public void testCheckUpperCaseGood() {
        String pass = "MyPassword123";
        boolean result = PasswordValidator.checkUpperCase(pass);
        assertEquals(true, result);
    }
    
    /**
     * A test that will ensure a failing password actually
     * returns false from the checkUpperCase method
     */
    @Test
    public void testCheckUpperCaseBad() {
        String pass = "mypassword123";
        boolean result = PasswordValidator.checkUpperCase(pass);
        assertEquals(false, result);   
    }
    
    /**
     * A test that checks that when a password contains upper case more than
     * one and with last position
     * last three is upper case, we see a pass. What happens if you adjust the code
     * from >= to just >? Make sure your test will catch it for you!
     */
    @Test
    public void testCheckUpperCaseBoundary()
    {
         String pass = "123mypasswORD";
        boolean result = PasswordValidator.checkUpperCase(pass);
        assertEquals(true, result);
    }
    
    /**
     * Test of checkUpperCase method, of class PasswordValidator.
     * This test gives a good input of MyPassword123!, which should
     * be acceptable a password.
     */
    @Test
    public void testCheckSpecialCharacterGood() {
        String pass = "MyPassword123!!";
        boolean result = PasswordValidator.checkSpecialCharacter(pass);
        assertEquals(true, result);
    }
    
    /**
     * A test that will ensure a failing password actually
     * returns false from the checkSpecialCharacter method
     */
    @Test
    public void testCheckSpecialCharacterBad() {
        String pass = "mypassword123";
        boolean result = PasswordValidator.checkSpecialCharacter(pass);
        assertEquals(false, result);   
    }
    
    /**
     * A test that checks that when a password contains special characters more than
     * one and with first and last position
     * first and last characters are special , we see a pass. What happens if you adjust the code
     * from >= to just >? Make sure your test will catch it for you!
     */
    @Test
    public void testCheckSpecialCharacterBoundary()
    {
         String pass = "!!123mypasswORD{}";
        boolean result = PasswordValidator.checkSpecialCharacter(pass);
        assertEquals(true, result);
    }
       
}

