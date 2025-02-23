package Com.ArrayList.Package;

import java.util.ArrayList;

public class A1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3); // 0
        list.add(2); // 1
        list.add(40); //2
        list.add(12);
        list.add(76);
        list.add(22); // 0
        list.add(8728); // 1
        list.add(4021); //2
        list.add(1112);
        list.add(716);
//        System.out.println(list.get(2));
//        System.out.println(list.size());
//
//
        list.set(1,90);
        System.out.println(list);
        list.add(2,70);
        System.out.println(list);

        System.out.println(list.size());


//        for(int i = 0; i <list.size() ; i++) {
//            System.out.println(list.get(i));
//
//        }
//        for (int x:list){
//            System.out.println(x);
//        }
//        System.out.println(list.contains(2));
    }
}

