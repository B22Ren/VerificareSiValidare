/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeometricFormsTest {
    
    private List<GeometricForms> forme;
    
    public GeometricFormsTest() {
    
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        forme = new ArrayList<>();
        GeometricForms dreptunghi = new GeometricForms(Forms.RECTANGLE.name());
        GeometricForms triunghi = new GeometricForms(Forms.TRIANGLE.name());
        GeometricForms cerc = new GeometricForms(Forms.CIRCLE.name());
        forme.add(cerc);
        forme.add(triunghi);
        forme.add(dreptunghi);
        
        
        }
    
  
}
    
