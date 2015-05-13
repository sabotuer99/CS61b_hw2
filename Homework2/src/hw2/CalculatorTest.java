package hw2;



import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class CalculatorTest {
    /* Do not change this to be private. For silly testing reasons it is public. */
    public Calculator tester;

    /**
     * setUp() performs setup work for your Calculator.  In short, we 
     * initialize the appropriate Calculator for you to work with.
     * By default, we have set up the Staff Calculator for you to test your 
     * tests.  To use your unit tests for your own implementation, comment 
     * out the StaffCalculator() line and uncomment the Calculator() line.
     **/
    @Before
    public void setUp() {
        tester = new Calculator(); // Comment me out to test your Calculator
        // tester = new Calculator();   // Un-comment me to test your Calculator
    }

    // TASK 1: WRITE JUNIT TESTS
    @Test
    public void Add_GivenTwoPositiveNumbers_ReturnsSum(){
    	//Arrange
    	Integer expected = 5;
    	Integer result = 0;
    	
    	//Act
    	result = tester.add(2, 3);
    	
    	//Assert
    	assertEquals(expected, result);
    }
    
    @Test
    public void Add_GivenTwoNegativeNumbers_ReturnsSum(){
    	//Arrange
    	Integer expected = -5;
    	Integer result = 0;
    	
    	//Act
    	result = tester.add(-2, -3);
    	
    	//Assert
    	assertEquals(expected, result);
    }
    
    @Test
    public void Add_GivenLargestIntAndOne_ReturnsLargestNegInt(){
    	//Arrange
    	Integer expected = -2147483648;
    	Integer result = 0;
    	
    	//Act
    	result = tester.add(2147483647, 1);
    	
    	//Assert
    	assertEquals(expected, result);
    }
    
    @Test
    public void Multiply_GivenTwoNumbers_ReturnsProduct(){
    	//Arrange
    	Integer expected = 6;
    	Integer result = 0;
    	
    	//Act
    	result = tester.multiply(2, 3);
    	
    	//Assert
    	assertEquals(expected, result);
    }
    
    @Test
    public void Multiply_GivenOppositeSigns_ReturnsNegativeProduct(){
    	//Arrange
    	Integer expected = -6;
    	Integer result = 0;
    	
    	//Act
    	result = tester.multiply(2, -3);
    	
    	//Assert
    	assertEquals(expected, result);
    }
    
    @Test
    public void Multiply_GivenTwoNegative_ReturnsPositiveProduct(){
    	//Arrange
    	Integer expected = 6;
    	Integer result = 0;
    	
    	//Act
    	result = tester.multiply(-2, -3);
    	
    	//Assert
    	assertEquals(expected, result);
    }
    
    @Test
    public void Multiply_GivenZero_ReturnsZero(){
    	//Arrange
    	Integer expected = 0;
    	Integer result = 0;
    	
    	//Act
    	result = tester.multiply(0, -3);
    	
    	//Assert
    	assertEquals(expected, result);
    }

    /* Run the unit tests in this file. */
    public static void main(String... args) {
        jh61b.junit.textui.runClasses(CalculatorTest.class);
    }       
}