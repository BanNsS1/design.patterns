package pràctica.patrons.Exercici3;

public class Rectangle extends Figure {
    private final double width;
    private final double height;
    
    public Rectangle(double x, double y, double width, double height){
        super(x, y);
        this.width = width;
        this.height = height;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getHeight(){
        return height;
    }
    
    @Override
    public void accept(FigureVisitor v) {
       v.visit(this);
    }
}
