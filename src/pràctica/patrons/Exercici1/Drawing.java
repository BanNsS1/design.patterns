package pràctica.patrons.Exercici1;

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
}
