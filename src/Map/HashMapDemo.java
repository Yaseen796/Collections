package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo
{
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Akshit");
        map.put(2,"Neha");
        map.put(3,"Shubham");
        System.out.println(map);
        String student = map.get(3);
        System.out.println(student);
        boolean s = map.containsKey(2);
        boolean r = map.containsValue("Shubham");
        System.out.println(r);
        System.out.println(s);

        for (int i : map.keySet()){
            System.out.println(map.get(i));
        }
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String > entry : entries){
          entry.setValue(entry.getKey()+ ": "+ entry.getValue());
          //  entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(entries);
    }
}
