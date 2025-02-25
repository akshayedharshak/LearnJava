package Test.com;

import java.util.ArrayList;
import java.util.LinkedList;

public class dataType {
    public static void main(String[] args) {
        // long l , double d , float f , int i , char c , byte b ;// Declaration of variable ( int i = 18;), float f = 23.2f
        // Depending on the value you can select the values, memory is allocated for the for variable
        // We need to initialize the variable before using it , also it can be changed in the runtime.
        //Rules for Variable Names:
        //1. Case Sensitive
        //2. No special characters (expect _ $)
        //3. Should not be a keyword
        //4. Should not be a class name.
        //5. follow camelcase
        // primitive data types( which are already given in java inbuilt) - integeral , floating point , char , boolean
        // Integral-- > byte , short , int , long
        // Floating -> float , double
        // char - 2bytes
        // boolean
        // Increment and decrement operator ++ , --
        //a++ a-- , ++a , --a
        int i = 7;
//        System.out.println(i++);// first user i and increment i =50
//        System.out.println(i); // now i will be 51
//        System.out.println(++i);// increment i directly and then use i 52
//        System.out.println(i);//52
//        System.out.println(--i);//51
        int x = ++i * 8;// ++ has more precedence than *
        System.out.println(x);
        char c = 'c';
        System.out.println(++c);// increment to d;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.BYTES);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.SIZE);
        System.out.println(Short.SIZE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Float.SIZE);
        System.out.println(Float.NEGATIVE_INFINITY);
        System.out.println(Float.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(long.class);

        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        ArrayList <String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        System.out.println(fruits);
        fruits.remove("apple");
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);

        LinkedList <Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList.size());
        linkedList.removeFirst();
        System.out.println(linkedList);
        System.out.println(linkedList.get(1));

    }
}
