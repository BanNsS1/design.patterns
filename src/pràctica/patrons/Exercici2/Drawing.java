package pràctica.patrons.Exercici2;

import static java.util.Collections.unmodifiableList;
import java.util.List;

public class Drawing extends Figure {
    private final List<Figure> figures;
    public Drawing(double x, double y, List<Figure> figures){
        super(x, y);
        this.figures = figures;
    }
    
    public List<Figure> getFigures(){
        return unmodifiableList(figures);
    }

    @Override
    public void accept(FigureVisitor v) {
       v.visit(this);
    }
}
