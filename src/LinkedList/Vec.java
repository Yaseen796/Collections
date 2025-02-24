package LinkedList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class Vec {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5,3);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(2,3);
        System.out.println(vector);
        vector.set(2,5);
        System.out.println(vector);
        vector.remove(5);
        System.out.println(vector);
        System.out.println(vector.capacity());
        vector.add(1);
        System.out.println(vector.capacity());
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(22);
        linkedList.add(33);
        Vector<Integer> vec1= new Vector<>(linkedList);
        System.out.println(vec1);

         linkedList.clear();
        System.out.println(linkedList);
            }
}
