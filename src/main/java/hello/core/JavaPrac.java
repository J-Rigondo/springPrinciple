package hello.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class JavaPrac {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(){
            {

            add("one");
            add("two");
            add("three");
            add("four");
            }
        };

        for (int i=0; i < list.size(); i++) {
            System.out.println(i + "," + list.get(i));
        }

        System.out.println(list.get(1));
        list.remove("two");
        System.out.println(list.get(1));



//        List<String> test = new ArrayList<>(Arrays.asList("11", "22", "33"));
//        String[] test = {"ee","33"};
//        String testStr = String.join(",", test);
//        System.out.println(testStr);

    }
}

