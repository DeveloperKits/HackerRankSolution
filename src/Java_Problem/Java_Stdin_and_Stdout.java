package Java_Problem;

import java.util.Scanner;

public class Java_Stdin_and_Stdout {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] myInt = new int[3];
        int i;
        String s;

        for (i=0; i< myInt.length; i++){
            myInt[i] = scanner.nextInt();
        }



        for (i=0; i< myInt.length; i++){
            System.out.println(myInt[i]);
        }

        s = scanner.next();
        scanner.close();

        System.out.println(s);
    }
}
