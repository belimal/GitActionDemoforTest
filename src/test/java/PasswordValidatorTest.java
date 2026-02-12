/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author belim
 */
public class PasswordValidatorTest {
    
    public PasswordValidatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkLength method, of class PasswordValidator.
     */
    @Test
    public void testCheckLengthGood() {
        System.out.println("checkLengthGood");
        String password = "mylongpassword";
        
        PasswordValidator instance = new PasswordValidator();
      
        assertEquals(true, instance.checkLength(password));
      
    }
    
    @Test
    public void testCheckLengthBad() {
        System.out.println("checkLengthBad");
        String password = "mylong";
        
        PasswordValidator instance = new PasswordValidator();
      
        assertEquals(false, instance.checkLength(password));
      
    }
    
    @Test
    public void testCheckLengtBoundry() {
        System.out.println("checkLengthBoundry");
        String password = "password";
        
        PasswordValidator instance = new PasswordValidator();
      
        assertEquals(true, instance.checkLength(password));
      
    }
}
