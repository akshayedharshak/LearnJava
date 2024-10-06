package Test.com;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class learnString {
    public static void main(String[] args) {
//       String name = "Baksheesh is my new name";//String is class and it has special powers by which it can use same as a data type
//       System.out.println(name);
//       String name1 = name.toLowerCase();
//        System.out.println(name1);
//       String name2=name.toUpperCase(Locale.ROOT);
//       System.out.println(name2);
//       String name3 = name.replaceAll(" ", "");
//       System.out.println(name3);
//       int length = name.length();
//       String name4 = name.trim();
//       System.out.println(length);
//       System.out.println(name4);


//        ArrayList<Object> List = new ArrayList<>();
//        boolean number = List.add(3);
//        System.out.println(number);
//        List.add(4);
//        List.clear();
//        System.out.println(List);

        //String Methods
        String name = "India is my country";

        System.out.println(name.trim());//trim remove the front space and back spaces
        int length =  name.length();// count the space also and return an int value
        System.out.println(length);
        String lowercase = name.toLowerCase();// it makes to lower case
        System.out.println(lowercase);
        System.out.println(name.substring(3));// front part is cut off from index 3 and print the remaining part.
        System.out.println(name.substring(1,3));// prints only index 1 and index 2 excludes the end// index starts from 0.
        System.out.println(name.replace("is","is the best of"));// Every occurence will be replaced
        System.out.println(name.replace('I' , 'i'));// character replacement
        System.out.println(name.replace("India","Bharat"));
        System.out.println(name.startsWith("d"));// start with
        System.out.println(name.endsWith(" "));//ends with
        System.out.println(name.charAt(9));
        System.out.println(name.indexOf("r"));// index of 1st word like r
        System.out.println(name.indexOf("a", 5));// -1 is return as no match is found.
        System.out.println(name.lastIndexOf("a"));// it search from back side
        System.out.println(name.equals("India is my country"));
        System.out.println(name.equalsIgnoreCase("India is my couNtry"));// it ignores the case sensitive letter

        //Escape sequence
        System.out.println("I am a escape sequence:\" double letter");
        System.out.println("I am a escape sequence:\tdouble letter");

        //Practice set:
      // Problem 1
        String nam = "RankMITRA";
        nam = nam.toLowerCase(Locale.ROOT);
        System.out.println(nam);

        //Problem 2:
        String namone = "I am a proud Indian";
        namone = namone.replace(" ", "_");
        System.out.println(namone);

        //Problem 3:
//        String ActorName;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Actor Name:");
//        ActorName = sc.nextLine();
//        System.out.println("Dear\t"+ ActorName +"\tThanks a lot");

        String letter = "Dear |<name>| Thanks a lot";
        System.out.println(letter.replace("|<name>|" , "akshaye"));


        //Problem 4:// if it has double or triple space in the string
        String space = "The string has some  double space   or not";
        System.out.println(space.indexOf("  "));
        System.out.println(space.indexOf("   "));

        //Problem 5:
        String letter2 = "Dear Akshaye,\nYou have aced the interview please find you job offer below.\nThanks,\nAccenture Recruitment Team";
        System.out.println(letter2);








        









    }
}
