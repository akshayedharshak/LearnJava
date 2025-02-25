package Test.loops;


public class conditionalStatements{
    public static void main(String[] args) {

        //Arrays. (initialize a array of size 5
        int [] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(arr[0]);
        System.out.println(arr.length);


        String [] cars = {"Mercedes" , "Alto", "Hyundai" , "Creta", "tataMotors"};

        for (int i = 0; i < cars.length; i++) {
            cars[i] = cars[i].toLowerCase();
            System.out.println(cars[i]);
        }
        //for each loop best for iteration
        for (String car : cars) System.out.println(car);


        //Multi-dimensional Arrays.
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7, 8} };
        String [][] company = {{"Tesla","Mistubashi"}, {"Maruti", "Ford"}};
        // 00 01 02 03
        // 10 11 12 13
        System.out.println(myNumbers[0][2]);
        System.out.println(myNumbers[0][3]);
        System.out.println(company[0][0]);
        System.out.println(company[1][0]);
    }
}
