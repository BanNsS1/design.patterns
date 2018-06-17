package pràctica.patrons.Exercici3;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AreaDoublerVisitorTest {
    private static double PRECISENESS = 0.001;
    /**
     * Test of double area for Circle
     */
    @Test
    public void testDA_Circle() {
        AreaDoublerVisitor  adv = new AreaDoublerVisitor();
        FigureAreaVisitor   fav = new FigureAreaVisitor();
        
        Circle c1 = new Circle(0, 0, 10);
        Circle c2 = (Circle) adv.doubleArea(c1);
        
        double c2Area = fav.getArea(c2);
        double expected = fav.getArea(c1) * 2;
        
        assertEquals(c2Area, expected, PRECISENESS);
    }

    /**
     * Test of double area for Rectangle
     */
    @Test
    public void testDA_Rectangle() {
        AreaDoublerVisitor  adv = new AreaDoublerVisitor();
        FigureAreaVisitor   fav = new FigureAreaVisitor();
        
        Rectangle r1 = new Rectangle(0, 0, 10, 20);
        Rectangle r2 = (Rectangle) adv.doubleArea(r1);
        
        double r2Area = fav.getArea(r2);
        double expected = fav.getArea(r1) * 2;
        
        assertEquals(r2Area, expected, PRECISENESS);
    }

    /**
     * Test of double area for Drawing
     */
    @Test
    public void testDA_Drawing() {
        AreaDoublerVisitor  adv = new AreaDoublerVisitor();
        FigureAreaVisitor   fav = new FigureAreaVisitor();
        
        Circle    c1    = new Circle(0, 0, 10),
                  c2    = new Circle(10, 10, 10);
        Rectangle r1  = new Rectangle(-10, -10, 10, 30),
                  r2  = new Rectangle(-10, 10, 10, 30);
        
        List<Figure> figures = new ArrayList();
        figures.add(c1);
        figures.add(c2);
        figures.add(r1);
        figures.add(r2);
        Drawing d1 = new Drawing(0, 0, figures);
        Drawing d2 = (Drawing) adv.doubleArea(d1);
        
        double d2Area = fav.getArea(d2);
        double expected = fav.getArea(d1) * 2;
        
        assertEquals(d2Area, expected, PRECISENESS);
    }    
}
