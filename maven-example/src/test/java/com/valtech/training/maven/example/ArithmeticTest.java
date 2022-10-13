package com.valtech.training.maven.example;

import static org.junit.jupiter.api.Assertions.assertTrue;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class ArithmeticTest {
    
    private Arithmetic arithmetic;
    @BeforeEach
    public void runBeforeTest() {
        arithmetic = new ArithmeticImpl();
        System.out.println("Run before......");
    }
    @AfterEach
    public void afterTest() {
        arithmetic = new ArithmeticImpl();
        System.out.println("Run after......");
    }
    
    @Test
    public void testHi() {
        System.out.println("Hii......");;
    }
        
    @Test
    public void testHello() {
        System.out.println("Hello....");
    }
}