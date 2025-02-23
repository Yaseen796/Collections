package Com.HashSet.Package;

import java.util.HashSet;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(2);
        hs.add(4);
        hs.add(6);
        System.out.println(hs);
        HashSet<Integer> evenNumber= new HashSet<>();
        evenNumber.addAll(hs);
        evenNumber.add(10);
        System.out.println("New HashSet "+evenNumber);
        evenNumber.removeAll(hs);
        System.out.println(evenNumber);
    }
}
