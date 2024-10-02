package Test.com;

import java.util.ArrayList;
import java.util.Locale;

public class learnString {
    public static void main(String[] args) {
       String name = "Baksheesh is my new name";//String
       System.out.println(name);
       String name1 = name.toLowerCase();
        System.out.println(name1);
       String name2=name.toUpperCase(Locale.ROOT);
       System.out.println(name2);
       String name3 = name.replaceAll(" ", "");
       System.out.println(name3);
       int length = name.length();
       String name4 = name.trim();
       System.out.println(length);
       System.out.println(name4);


        ArrayList<Object> List = new ArrayList<>();
        boolean number = List.add(3);
        System.out.println(number);
        List.add(4);
        List.clear();
        System.out.println(List);


    }
}
