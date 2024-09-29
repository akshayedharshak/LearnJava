package Test.com;

public class dataType {
    public static void main(String[] args) {
        // long l , double d , float f , int i , char c , byte b ;
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

    }
}
