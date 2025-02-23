import java.util.Collections;
import java.util.LinkedList;
import java.util.Collections;
public class LinkedList2 {

    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("Basha");
        l1.add("Yaseen");
        l1.add("Shaikh");
        l1.add("Mechanical Engineer");

        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);

        Collections.sort(l1);
        LinkedList l2 = new LinkedList();
        l2.addAll(l1);
        System.out.println(l2);
        l2.removeAll(l1);
        System.out.println(l2);
        Collections.shuffle(l1);
        System.out.println(l1);

    }
}
