package Test.com;
//Chapter 2: Operators and Expression
public class Operators {
    public static void main(String[] args) {

        //Arthimetic Operator : + - / %
        //Assignment Operators;
        //Comparision Operator;
        //Logical Operator;
        //Bitwise Operators;


        int a = 3;
        int b = 5 * a;
        int moduloOperator = 5 % a;//Modular Operation--> Remainder 1 .
        int divisionOperator = b/a; // divides the number
        System.out.println(b);
        System.out.println(moduloOperator);
        System.out.println(divisionOperator);

        int c = b+=5;// adds 5 to the b's values
        System.out.println(b);
        c*=3;
        System.out.println(c);
        System.out.println(c==45);//comparison operators == => =<
        System.out.println(c>40);
        System.out.println(45>20 && 45>46);//Logical Operators && and ||
        System.out.println(45>20 || 45<21);

        //Topic 5:Associativity of Operators










    }
}
