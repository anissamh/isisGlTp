package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class OnlyBooks implements Visitor
{
    private final List<Item> items = new LinkedList<>();

    @Override
    public void visit(Book x){
     System.out.println("livre "+x.getAuthor());
  }
    @Override
    public void visit(CD c){

  }

}
