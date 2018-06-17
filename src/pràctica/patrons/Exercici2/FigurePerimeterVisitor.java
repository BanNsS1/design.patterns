package pràctica.patrons.Exercici2;

public class FigurePerimeterVisitor implements FigureVisitor{
    private double result = 0;
    
    @Override
    public void visit(Circle visitable) {
        this.result += 2 * Math.PI * visitable.getRadius();
    }

    @Override
    public void visit(Rectangle visitable) {
        this.result += 2 * visitable.getHeight() + 2* visitable.getWidth();
    }

    @Override
    public void visit(Drawing visitable) {
        for(Figure figure: visitable.getFigures()){
            figure.accept(this);
        }
    }
    
    public double getPerimeter(Figure figure){
        figure.accept(this);
        return result;
    }
    
}
