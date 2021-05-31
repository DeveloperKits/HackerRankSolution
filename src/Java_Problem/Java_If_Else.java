package Java_Problem;

import java.util.Scanner;

public class Java_If_Else {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if (N >= 1 && N <= 100){
            if (N % 2 == 1){
                System.out.print("Weird");
            }else if (N <= 5){
                System.out.print("Not Weird");
            }else if (N <= 20){
                System.out.print("Weird");
            }else {
                System.out.print("Not Weird");
            }
        }
    }
}
