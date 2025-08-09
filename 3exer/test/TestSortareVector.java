/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.*;

/**
 *
 * @author Renata
 */
public class TestSortareVector {
    
    public TestSortareVector() {
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

  public void testSortArray() {
        SortareVector sortareVector = new SortareVector();
        int[] array = {9, 3, 6, 1, 8, 5};
        sortareVector.sortArray(array);
        assertArrayEquals(new int[]{1, 3, 5, 6, 8, 9}, array);
    }
}
