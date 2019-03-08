/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ir.ac.kntu.style;

import ir.ac.kntu.Complex;
import ir.ac.kntu.QuadraticEquation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * 40 points
 * @author Hamed Khashehchi
 */
public class SolutionTest {

    static boolean canTest = true;

    static {
        System.err.println("$$$GRADER$$$ | { type:\"MSG\" , key:\"TOTAL\" , value:70, priority:1  }  | $$$GRADER$$$");
    }

    @BeforeClass
    public static void testStyles() {
        boolean testPMDInternal = CheckPMDTest.testPMDViolation();
        boolean testCPDInternal = CheckPMDTest.testCPDViolation();
        boolean testCheckStyleInternal = CheckStyleTest.testCheckStyleViloation();
        canTest = testCheckStyleInternal && testPMDInternal && testCPDInternal;
    }
    
    @Test
    public void testCorrectness(){
        Assert.assertTrue(canTest);
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 3, -4);
        Complex root1 = quadraticEquation.getRoot1();
        Assert.assertEquals(root1.getRealPart(),1,0.00001);
        Complex root2 = quadraticEquation.getRoot2();
        Assert.assertEquals(root2.getRealPart(),-4,0.00001);
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:10 , reason:\"Correct Output.\" } | $$$GRADER$$$");
    }

    @Test
    public void testCorrectnessComplex(){
        Assert.assertTrue(canTest);
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 4, 5);
        Complex root1 = quadraticEquation.getRoot1();
        System.out.println("root1 = " + root1);
        Assert.assertEquals(root1.getRealPart(),-2,0.00001);
        Assert.assertEquals(root1.getImaginaryPart(),1,0.00001);
        Complex root2 = quadraticEquation.getRoot2();
        System.out.println("root2 = " + root2);
        Assert.assertEquals(root2.getRealPart(),-2,0.00001);
        Assert.assertEquals(root2.getImaginaryPart(),-1,0.00001);
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:20 , reason:\"Correct Output.\" } | $$$GRADER$$$");
    }

    @Test
    public void testConstructor() {
        Assert.assertTrue(canTest);
        Constructor<?>[] constructors = QuadraticEquation.class.getConstructors();
        Assert.assertTrue("One Constructor", constructors.length == 1);
        Assert.assertTrue("with 3 parameter", constructors[0].getParameterCount() == 3);
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:7 , reason:\"Correct Constructor.\" } | $$$GRADER$$$");
    }

    @Test
    public void testGetA() {
        Assert.assertTrue(canTest);
        boolean seen = false;
        Method[] methods = QuadraticEquation.class.getMethods();
        for (Method method : methods) {
            String name = method.getName();
            if (seen == false && name.equals("getA")) {
                seen = true;
                break;
            }

        }
        Assert.assertTrue(seen);
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:1 , reason:\"Correct Getter.\" } | $$$GRADER$$$");
    }

    @Test
    public void testGetB() {
        Assert.assertTrue(canTest);
        boolean seen = false;
        Method[] methods = QuadraticEquation.class.getMethods();
        for (Method method : methods) {
            String name = method.getName();
            if (seen == false && name.equals("getB")) {
                seen = true;
                break;
            }

        }
        Assert.assertTrue(seen);
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:1 , reason:\"Correct Getter.\" } | $$$GRADER$$$");
    }

    @Test
    public void testGetC() {
        Assert.assertTrue(canTest);
        boolean seen = false;
        Method[] methods = QuadraticEquation.class.getMethods();
        for (Method method : methods) {
            String name = method.getName();
            if (seen == false && name.equals("getC")) {
                seen = true;
                break;
            }

        }
        Assert.assertTrue(seen);
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:1 , reason:\"Correct Getter.\" } | $$$GRADER$$$");
    }
}
