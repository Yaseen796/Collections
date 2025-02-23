package Com.ArrayList.Package;


import javax.net.ssl.SSLContext;
import java.util.*;


//class StringLengthComparator implements Comparator<String> {
//
//     @Override
//     public int compare(String o1, String o2){
//         return o2.length()-o1.length();
//     }
//
// }



class Student{
    private String name;
    private double gpa;

    public Student(String name, double gpa){
        this.name=name;
        this.gpa=gpa;

    }

    public String getName(){
        return name;
    }
    public double getGpa(){
        return gpa;
    }
}

 // "ok" "bye"
public class Compare {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie",3.5));
        students.add(new Student("Bob",3.7));
        students.add(new Student("Alice",3.5));
        students.add(new Student("Akshit",3.9));
        Comparator<Student> compare = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);

       // students.sort(compare);

        Collections.sort(students, compare);
        for (Student s : students) {
            System.out.println(s.getName()+": "+ s.getGpa());
        }


//        students.sort((a,b) -> {
//            if (b.getGpa() - a.getGpa() > 0) {
//                return 1;
//            } else if (b.getGpa() - a.getGpa() < 0) {
//                return -1;
//            } else {
//
//                return a.getName().compareTo(b.getName());
//            }
//        });






























//        List<Integer>list = new ArrayList<>();
//
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.sort((a,b)-> a-b);
//        System.out.println(list);
//        List<String> words= Arrays.asList("banana","apple", "oranges");
//        words.sort((a, b) -> b.length()-a.length());
//        System.out.println(words);

    }
}