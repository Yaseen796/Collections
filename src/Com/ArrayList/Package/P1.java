package Com.ArrayList.Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> llo = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>(); // un-Specified List
        list.add("Apple");
        list.add("WaterMelon");
        System.out.println(list);
        ArrayList<String> list2 =  new ArrayList<>(20);
        list2.add("Samsung");
        list2.add("Sony");
        list2.add("Nvidia");
        System.out.println(list2);
        List<String> anotherList = Arrays.asList("water","juice","Tea");
        ArrayList<String> listfromCollection= new ArrayList<>(anotherList);
        System.out.println(listfromCollection);
        List<String> list1 = Arrays.asList("A", "a");
        list1.set(1,"King");
        System.out.println(list1);
        String[] array = {"w","w","w"};
        List<String> list3 = Arrays.asList(array);
        System.out.println(list3.getClass().getName());
        List<String> list4 = new ArrayList<>(list3);
        list4.add("Carrot");
        System.out.println(list4);

        List<Integer> integers = List.of(1, 2, 3, 4);
        llo.addAll(integers);
        System.out.println(llo);


    }
}
