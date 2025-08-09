/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Renata
 */
public class TestRational {
    
    public TestRational() {
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
    @Test
    public void testConstructorC1() {
        Rational rational = new Rational(3, 4);
        assertEquals(3, rational.getNumarator());
        assertEquals(4, rational.getNumitor());
    }

    @Test
    public void testConstructorC2() {
        Rational rational = new Rational(5);
        assertEquals(5, rational.getNumarator());
        assertEquals(1, rational.getNumitor());
    }

    @Test
    public void testToString() {
        Rational rational = new Rational(2, 3);
        assertEquals("2/3", rational.toString());
    }
    //3.2
  @Test(expected = IllegalArgumentException.class)
    public void testThrow() {
        Rational r1 = new Rational(5, 0);
    }
    //3.3
    public void testEquals() {
        Rational r1 = new Rational(4, 8);
        Rational r2 = new Rational(4, 8);
        assertTrue(r1.equals(r2));
    }

    @Test
    public void testNotEquals() {
        Rational r1 = new Rational(4, 8);
        Rational r2 = new Rational(5, 12);
        assertFalse(r1.equals(r2));
    }

    @Test
    public void testEqualsProblemResolved() {
        Rational r1 = new Rational(4, 8);
        Rational r2 = new Rational(1, 2);
        assertTrue(r1.equals(r2));
    }
    //3.4
      @Test
    public void testSimplificare() {
        Rational r = new Rational(8, 12);
        assertEquals(2, r.getNumarator());
        assertEquals(3, r.getNumitor());
    }
    //3.5
     @Test
    public void testConstructorC3() {
        Rational r1 = new Rational("2/3");
        assertEquals(2, r1.getNumarator());
        assertEquals(3, r1.getNumitor());

        Rational r2 = new Rational("5");
        assertEquals(5, r2.getNumarator());
        assertEquals(1, r2.getNumitor());
    }
    //3.6
     @Test
    public void testAdunare() {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, 3);
        Rational suma = r1.adunare(r2);
        assertEquals(new Rational(5, 6), suma);
    }

    @Test
    public void testScadere() {
        Rational r1 = new Rational(3, 4);
        Rational r2 = new Rational(1, 2);
        Rational diferenta = r1.scadere(r2);
        assertEquals(new Rational(1, 4), diferenta);
    }

    @Test
    public void testInmultire() {
        Rational r1 = new Rational(2, 3);
        Rational r2 = new Rational(3, 4);
        Rational produs = r1.inmultire(r2);
        assertEquals(new Rational(1, 2), produs);
    }

    @Test
    public void testImpartire() {
        Rational r1 = new Rational(2, 3);
        Rational r2 = new Rational(1, 4);
        Rational impartire = r1.impartire(r2);
        assertEquals(new Rational(8, 3), impartire);
    }
    
    
}
