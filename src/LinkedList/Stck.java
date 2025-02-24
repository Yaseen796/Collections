package LinkedList;

import java.util.Stack;

public class Stck {
    public static void main(String[] args) {
        Stack<Integer> S = new Stack<>();
        S.push(3);
        S.push(8);
        System.out.println(S);
        System.out.println(S.peek());
        Integer removed = S.pop();
        System.out.println(removed);


    }
}
