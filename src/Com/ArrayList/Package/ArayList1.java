package Com.ArrayList.Package;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class ArayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(20);
        a1.add(30);
        a1.add(40);
        Collections.shuffle(a1);
        System.out.println("After shuffling "+a1);

       Collections.sort(a1,Collections.reverseOrder());
       int i =  a1.get(2);

        System.out.println(a1);
        System.out.println(i);
        //System.out.println(r);
    }
}
