package pràctica.patrons.Exercici3;

import java.util.ArrayList;
import java.util.List;

public class DrawingBuilder{
    private double x;
    private double y;
    private List<Figure> figures = new ArrayList();
    
    public DrawingBuilder setX(double x){
        this.x = x;
        return this;
    }
    
    public DrawingBuilder setY(double y){
        this.y = y;
        return this;
    }
    
    public DrawingBuilder addFigure(Figure figure){
        this.figures.add(figure);
        return this;
    }
    
    public Drawing execute(){
        return new Drawing(this.x, this.y, this.figures);
    }
    
    public static DrawingBuilder create(){
        return new DrawingBuilder();
    }
}
