package Test.com;
import java.util.Scanner;

public class conditionalStatements {
    public static void main(String[] args) {
/*
 if else statements
 switch statements
 Odd or even number code
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        if (num % 2 == 0) {// return the remainder like 21%2 = 1 , it returns a boolean values like true or false
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        //boolean AND OR

        boolean a = true;
        boolean b = false;
        if (a && b) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if(a || b){// atleast one condition is true then true
            System.out.println("true");
     }
Switch case:
if-else if -else ladder
*/
/*
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


        
Practice Problems :
*/
//Problem 1:
        /*int variable = 10;
        if (variable == 11) {
            System.out.println("I am 11");
        }
        else{
                System.out.println("I am not 11");
            }
         */

//Problem 2:
        System.out.println("Enter the sub1 marks");
        Scanner marks = new Scanner(System.in);
        float sub1 = marks.nextInt();
        System.out.println("Enter the sub2 marks");
        float sub2 = marks.nextInt();
        System.out.println("Enter the sub3 marks");
        float sub3 = marks.nextInt();
        if (sub1<33 || sub2<33 || sub3<33) {
            System.out.println("The student is failed");
        }
        else {
            float sum = sub1 + sub2 + sub3;
            System.out.println("The sum is: " + sum);
            double percentage = (sum / 3);
            System.out.println(percentage);
            System.out.println("The student is pass with a percentage of : " + percentage);

        }

        }
    }



/*
 = is the assignment operator whereas == is a equality operator
Relational Operator == != >= <= < >
Logical operators &&(AND) ||(OR) !(NOT)
Switch case:(enhanced switch case)
if else
if - else if - else ladder
do while loops
while loops
for loops
*/





