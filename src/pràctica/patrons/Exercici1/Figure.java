package pràctica.patrons.Exercici1;

public abstract class Figure{
    private final double x;
    private final double y;
    public Figure(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public double getX(){ return x; }
    public double getY(){ return y; }
}
