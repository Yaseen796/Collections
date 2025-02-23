import java.util.LinkedList;
 public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("Dog");
        l1.add("Cat");
        l1.add("Horse");
        l1.add("Lion");
        l1.add("Tiger");
        System.out.println(l1);
        l1.addFirst("Elephant");
        l1.addLast("Giraffe");
        System.out.println(l1);
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
        System.out.println(l1.removeFirst());
        System.out.println(l1.removeLast());
        System.out.println(l1);


    }
}
