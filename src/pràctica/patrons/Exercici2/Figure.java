package pràctica.patrons.Exercici2;

public abstract class Figure implements FigureVisitable{
    private final double x;
    private final double y;
    public Figure(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public double getX(){ return x; }
    public double getY(){ return y; }
}
