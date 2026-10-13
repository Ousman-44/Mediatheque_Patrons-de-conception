package mediatheque;

interface Visitor {
    void visit(CD c);
    void visit(Book b);
    
}