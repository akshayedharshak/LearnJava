package Test.com;

public class employee {
    public static void main(String[] args) {
        pojoClass [] pojo = new pojoClass[6];// Array of objects of pojoClass
        pojo[0] = new pojoClass("John", 25, "New York");
        pojo[1] = new pojoClass("Sam", 30, "California");
        pojo[2] = new pojoClass("Tom", 35, "Texas");
        pojo[3] = new pojoClass("Jerry", 40, "Florida");
        pojo[4] = new pojoClass("Mike", 45, "Washington");

        for (pojoClass pojoobj : pojo) {
            System.out.println(pojoobj.getName());
            System.out.println(pojoobj.getAge());
            System.out.println(pojoobj.getAddress());
        }
        // Arrays
        //method 1
        int [] arr = new int[5];
        //method 2
        int [] type;
        type = new int[5];
        //method 3
        int [] number = {1,2,3,4,5};
        for (int i : number ) {
            System.out.print(i);
        }


    }




}
