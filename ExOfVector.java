import java.util.Vector;

public class ExOfVector {
    public static void main(String[] args) {
        Vector<Integer>v=new Vector<Integer>();
        v.add(10);
        v.add(30);
        v.add(20);
        System.out.println(v);
        System.out.println("-------------------------------------------");
        System.out.println(v.get(2));
        System.out.println("----------------------------------");
        System.err.println(v.isEmpty());
        System.out.println("----------------------------------");
        System.out.println(v.contains(1));
        System.out.println("----------------------------------");
        System.out.println(v.size());
        System.out.println("--------------------------------");
        for(Object i:v)
        {
            System.out.print(i+"      ");
        }

    }
}
