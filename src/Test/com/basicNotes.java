package Test.com;
import java.lang.*;
import java.util.Scanner;//utils package its from java 5.

//file name and class name should be same:
public class basicNotes {
    public static void main(String[] args) {// always need to write this method. It should always be static and void because main method don't return anything
        System.out.println("hello world");// system is a class and out and println are the method inside the class system
        Scanner sc = new Scanner(System.in);// this is the Scanner class which can take input from user.
        int a , b ;
        System.out.println("enter the number a");
        a = sc.nextInt();
        System.out.println("enter the number b");
        b = sc.nextInt();
        System.out.println("Which operation do you want to perform? add , sub , mutiplication ");
        String op = sc.next();
        if (op.equals("add")) {
            System.out.println(+(a+b));
        } else if (op.equals("sub")) {
            System.out.println("value of a - b:"+(a-b));
        } else if (op.equals("multiplication")) {
            System.out.println("value of a * b:"+(a*b));
        } else{
            System.out.println("Invalid input");
        }
    }
}
