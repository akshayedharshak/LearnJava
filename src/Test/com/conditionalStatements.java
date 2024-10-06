package Test.com;
import java.util.Scanner;

public class conditionalStatements {
    public static void main(String[] args) {
// if else statements
// switch statements
// Odd or even number code
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number");
//        int num = sc.nextInt();
//        if (num % 2 == 0) {// return the remainder like 21%2 = 1 , it returns a boolean values like true or false
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }
//        //boolean AND OR
//
//        boolean a = true;
//        boolean b = false;
//        if (a && b) {
//            System.out.println("true");
//        }
//        else {
//            System.out.println("false");
//        }
//        if(a || b){// atleast one condition is true then true
//            System.out.println("true");
//     }
        //Switch case:
        //if-else if -else ladder
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        switch (var){
            case 18:
                System.out.println("You are an adult now");
                break;
            case 30:
                System.out.println("You are a family man now");
                break;
            case 60:
                    System.out.println("You are a senior citizen now");
                    break;
            case 80:
                System.out.println("Rest in Peace and Enjoy!");
                break;
            default:
                System.out.println("Invalid number");
        }
        System.out.println("Thank you");
        }

    }

// = is the assignment operator whereas == is a equality operator
//Relational Operator == != >= <= < >
//Logical operators &&(AND) ||(OR) !(NOT)

//Switch case:





