package Com.ArrayList.Package;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2 {
    public static void main(String[] args) {
        String[] arr = {"Dog","Cat","Elephant"};
        for(String val:arr){
            System.out.println(val);
        }
       ArrayList a1 = new ArrayList(Arrays.asList(arr));
        System.out.println(a1);

    }
}
