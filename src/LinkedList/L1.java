package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Node{
    public int value;

    public Node next;
}


public class L1 {
    public static void main(String[] args) {
             LinkedList<Integer> li= new LinkedList<>();
                li.add(20);
                li.add(10);
                li.add(87);
                li.get(2);//O(n)
                li.addLast(89);//O(1)
                li.add(67);//O(1)
                li.addFirst(989);
                li.getFirst();
                li.getLast();
        System.out.println(li.getLast());
        li.removeFirst();
        li.removeLast();
        li.removeIf(x-> x%2==0);
        System.out.println(li.getLast());
        System.out.println(li.getFirst());

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog","Lion"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);

















    }
}
