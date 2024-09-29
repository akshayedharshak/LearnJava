package Test.com;

import java.util.Scanner;

public class associativityOfOperator
{
    public static void main(String[] args) {
//Precedence and associativity
        // * and / have same precedence but have left to right associativity
        int b = 60/5 - 2*3;// left to right associativity
        // 12- 6
        // b=6
        int c = 2*3/3;
        System.out.println(b);
        System.out.println(c);
        // Refer image and see the precedence, the higher the presidence will be taken.

        //Quiz
        Scanner sc = new Scanner(System.in);
        System.out.println("input x");
        int x = sc.nextInt();
        System.out.println("input y");
        int y = sc.nextInt();
        // different expressions / quadratic equation/ () - has the highest precedence.
        int k = (x*y)/2;
        int l = (x*x -4*x*y)/2;
        int m = (x*x - y*y);
        int n = (x*y- y);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);


    }

    }
