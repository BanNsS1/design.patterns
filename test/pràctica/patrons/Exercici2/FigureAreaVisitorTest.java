/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pràctica.patrons.Exercici2;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BanNsS1
 */
public class FigureAreaVisitorTest {
    
    public FigureAreaVisitorTest() {
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
     * Test of getArea method, of class FigureAreaVisitor.
     */
    @Test
    public void testGetArea() {
        double preciseness = 0.001;
        
        Circle      c1 = new Circle(0,0,10);
        Rectangle   r1 = new Rectangle(10,10,20,30);
        
        List<Figure> figures = new ArrayList();
        figures.add(c1);
        figures.add(r1);
        
        Drawing drawing = new Drawing(0, 0, figures);
        
        double areaCircle = Math.PI * c1.getRadius() * c1.getRadius();
        double areaRectangle = r1.getHeight() * r1.getWidth();
        double areaDrawing = areaCircle + areaRectangle;
        
        FigureAreaVisitor fav = new FigureAreaVisitor();
        
        assertEquals(fav.getArea(c1), areaCircle, preciseness);
        assertEquals(fav.getArea(r1), areaRectangle, preciseness);
        assertEquals(fav.getArea(drawing), areaDrawing, preciseness);
    }
    
}
