package mediatheque;

public class PrintOnlyBooksVisitor implements Visitor {

    @Override
    public void visit(Book b) {
        System.out.println(b);
    }

    @Override
    public void visit(CD c) {
    }
}