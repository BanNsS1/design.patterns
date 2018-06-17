/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pràctica.patrons.Exercici1;

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
public class DrawingBuilderTest {
    
    public DrawingBuilderTest() {
    }
    
    @Test
    public void test() {
        double preciseness = 0.001;
        double x = 10, y = 5;
        
        DrawingBuilder builder = DrawingBuilder.create();
        builder.setX(x);
        builder.setY(y);
        
        Rectangle rect1 = new Rectangle(2, 4, 6, 8);
        Rectangle rect2 = new Rectangle(3, 6, 9, 12);
        Rectangle rect3 = new Rectangle(4, 8, 12, 16);
        Circle circ1    = new Circle(6, 12, 18);
        
        builder.addFigure(rect1);
        builder.addFigure(rect2);
        builder.addFigure(rect3);
        builder.addFigure(circ1);
        
        Drawing drawing = builder.execute();
        
        assertEquals(drawing.getX(), x, preciseness);
        assertEquals(drawing.getY(), y, preciseness);
        
        List<Figure> figures = drawing.getFigures();
        
        //Figure 1:
        Rectangle fig1 = (Rectangle) figures.get(0);
        assertEquals(fig1.getX(),       2, preciseness);
        assertEquals(fig1.getY(),       4, preciseness);
        assertEquals(fig1.getWidth(),   6, preciseness);
        assertEquals(fig1.getHeight(),  8, preciseness);
        //Figure 2:
        Rectangle fig2 = (Rectangle) figures.get(1);
        assertEquals(fig2.getX(),       3, preciseness);
        assertEquals(fig2.getY(),       6, preciseness);
        assertEquals(fig2.getWidth(),   9, preciseness);
        assertEquals(fig2.getHeight(),  12, preciseness);
        //Figure 3:
        Rectangle fig3 = (Rectangle) figures.get(2);
        assertEquals(fig3.getX(),       4, preciseness);
        assertEquals(fig3.getY(),       8, preciseness);
        assertEquals(fig3.getWidth(),   12, preciseness);
        assertEquals(fig3.getHeight(),  16, preciseness);
        //Figure 4:
        Circle fig4    = (Circle) figures.get(3);
        assertEquals(fig4.getX(),       6, preciseness);
        assertEquals(fig4.getY(),       12, preciseness);
        assertEquals(fig4.getRadius(),  18, preciseness);
    }    
}
