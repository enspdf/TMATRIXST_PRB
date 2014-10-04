/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrix;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author root
 */
public class MatrixTest {
    
    public MatrixTest() {
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
     * Test of random method, of class Matrix.
     */
    

    /**
     * Test of identity method, of class Matrix.
     */
    @Test
    public void testIdentity() {
        System.out.println("identity");
        int n = 4;
        double[][] expResult = {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};
        double[][] result = Matrix.identity(n);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dot method, of class Matrix.
     */
    @Test
    public void testDot() {
        System.out.println("dot");
        double[] x = {0,0,0,0};
        double[] y = {0,0,0,0};
        double expResult = 0.0;
        double result = Matrix.dot(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of transpose method, of class Matrix.
     */
    @Test
    public void testTranspose() {
        System.out.println("transpose");
        double[][] A = {{1,1,0,0,0},{1,1,0,0,0},{0,1,1,0,0},{0,0,0,1,1},{1,1,1,1,1}};
        double[][] expResult = {{1,1,0,0,1},{1,1,1,0,1},{0,0,1,0,1},{0,0,0,1,1},{0,0,0,1,1}};
        double[][] result = Matrix.transpose(A);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Matrix.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double[][] A = {{1,1,0,3,0},{1,1,0,2,0},{0,1,1,1,0},{0,3,0,1,1},{7,1,1,1,1}};
        double[][] B = {{1,1,0,2,1},{1,4,1,0,1},{3,0,1,5,1},{1,0,2,1,1},{1,0,3,1,1}};
        double[][] expResult = {{2,2,0,5,1},{2,5,1,2,1},{3,1,2,6,1},{1,3,2,2,2},{8,1,4,2,2}};
        double[][] result = Matrix.add(A, B);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class Matrix.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        double[][] A = {{2,1,1,1,2},{2,1,1,2,1},{1,1,2,1,1},{1,1,2,1,1},{1,1,1,2,1}};
        double[][] B = {{2,1,1,1,2},{2,1,1,2,1},{1,1,2,1,1},{1,1,2,1,1},{1,1,1,2,1}};
        double[][] expResult = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        double[][] result = Matrix.subtract(A, B);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Matrix.
     */
    @Test
    public void testMultiply_doubleArrArr_doubleArrArr() {
        System.out.println("multiply");
        double[][] A = {{2,5,3},{3,2,1},{4,1,0}};
        double[][] B = {{2,5,2},{2,1,1},{2,1,2}};
        double[][] expResult = {{20,18,15},{12,18,10},{10,21,9}};
        double[][] result = Matrix.multiply(A, B);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      

    /**
     * Test of main method, of class Matrix.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Matrix.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
