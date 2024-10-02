package mediatheque;

public class OnlyCDs implements  Visitor {
    public void printOnlyCDs() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void visit(Book b) {

    }

    @Override
    public void visit(CD c) {
System.out.println("cd "+c.getTitle());
    }


}
