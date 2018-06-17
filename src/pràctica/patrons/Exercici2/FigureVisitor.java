package pràctica.patrons.Exercici2;

public interface FigureVisitor{
    public void visit(Circle visitable);
    public void visit(Rectangle visitable);
    public void visit(Drawing visitable);
}
