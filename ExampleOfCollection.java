
import java.util.*;
public class ExampleOfCollection {
    public static void main(String[] args) {
        /*List l1=new Vector();
        List l2=new Stack();
        List l3=new LinkedList();*/
        List<Integer> l=new ArrayList<Integer>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println("List :"+l);

        System.out.println("----------------------------------->");
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(25);
        al.add(10);
        al.add(30);
        al.add(70);
        System.out.println("ArrayList :"+al);


    }
    
}
