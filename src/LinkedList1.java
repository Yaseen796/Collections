import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.SortedMap;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        // LinkedList<Integer> l= new LinlkedList<>();
        //LinkedList<String> l = new LinkedList<>();

        l1.add(20);
        l1.add("String");
        l1.add(15.5);
        l1.add('A');
        l1.add(true);
        l1.add(null);

        System.out.println(l1);

        System.out.println(l1.size());
        l1.remove(3);
        System.out.println("After removing: "+ l1);
        l1.add(3,"Java");
        System.out.println("After inserting at specific position: "+l1);
        System.out.println(l1.get(1));
        l1.set(5,"X");
        System.out.println("Inserting in null value: "+l1);
        System.out.println(l1.contains("Java"));
        System.out.println(l1.isEmpty());
        Iterator it = l1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for(Object e :l1){
            System.out.print(e+" ");
        }

    }
}
