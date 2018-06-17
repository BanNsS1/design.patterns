package pràctica.patrons.Exercici2;

public class FigureAreaVisitor implements FigureVisitor{
    private double result = 0;
    
    @Override
    public void visit(Circle visitable) {
        this.result += Math.PI * visitable.getRadius() * visitable.getRadius();
    }

    @Override
    public void visit(Rectangle visitable) {
        this.result += visitable.getHeight() * visitable.getWidth();
    }

    @Override
    public void visit(Drawing visitable) {
        for(Figure figure: visitable.getFigures()){
            figure.accept(this);
        }
    }
    
    public double getArea(Figure figure){
        this.result = 0;
        figure.accept(this);
        return result;
    }
    
}
