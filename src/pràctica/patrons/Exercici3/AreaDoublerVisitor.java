package pràctica.patrons.Exercici3;

public class AreaDoublerVisitor implements FigureVisitor{
    private Figure result;
    
    @Override
    public void visit(Circle visitable) {
        this.result = new Circle(visitable.getX(), visitable.getY(), visitable.getRadius() * Math.sqrt(2));
    }

    @Override
    public void visit(Rectangle visitable) {
        this.result = new Rectangle(visitable.getX(), visitable.getY(), visitable.getWidth() * Math.sqrt(2), visitable.getHeight() * Math.sqrt(2));
    }

    @Override
    public void visit(Drawing visitable) {
        /*
            Using the builder of the first exercise to be able to add 
            the new figures one by one
        */
        DrawingBuilder db = DrawingBuilder.create();
        db.setX(visitable.getX());
        db.setY(visitable.getY());
        
        for(Figure figure: visitable.getFigures()){
            figure.accept(this);
            db.addFigure(this.result);
        }
        this.result = db.execute();
    }
    
    public Figure doubleArea(Figure figure){
        figure.accept(this);
        return result;
    }
    
}
