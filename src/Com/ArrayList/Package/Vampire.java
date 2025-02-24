package Com.ArrayList.Package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
   private String name;
    private int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
  public int getAge(){
        return age;
  }
  public String getName(){
        return name;
  }
}
//class AgeComparator implements Comparator<Person>{
//
//    @Override
//    public int compare(Person o1, Person o2) {
//        return (o1.getAge() - o2.getAge());
//    }
//}
public class Vampire {
    public static void main(String[] args) throws Exception {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Alice",25));
        list.add(new Person("Charlie", 25));
        list.add(new Person("Bob", 30));
        list.add(new Person("Akshit",40));
        //list.sort(null);
        Comparator<Person> compare= Comparator.comparing(Person::getAge).reversed().thenComparing(Person::getName);//.reversed();
//
        //list.sort(compare);
//        System.out.println();
//        list.sort((a,b)->{
//            if(a.getAge() -b.getAge()<0){
//                return 1;
//            }
//            else if (a.getAge()-b.getAge()>0){
//                return -1;
//            }else return a.getName().compareTo(b.getName());
//
//        });
        //Collections.sort();
        //list.sort(compare);
        Collections.sort(list,compare);
        for (Person p : list){
            System.out.println(p.getName()+" "+ p.getAge());

        }
    }
}
