package Com.HashSet.Package;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Hashset1 {

    public static void main(String[] args) {
      // HashSet h1 = new HashSet();
        HashSet h1 = new HashSet(100,(float).90);
       // HashSet<Integer> hd = new HashSet<>();
        h1.add(20);
        h1.add("Yaseen");
        h1.add(8.05);
        h1.add('A');
        h1.add(true);
        h1.add(null);
        System.out.println(h1);

        h1.remove("Yaseen");
        System.out.println(h1);

        System.out.println(h1.contains("Yaseen"));
        System.out.println(h1.isEmpty());
        for (Object e :h1){
            System.out.print(e+" ");
        }
        Iterator it = h1.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
