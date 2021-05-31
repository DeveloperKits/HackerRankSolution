package Algorithm_Problem;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Plus_Minus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* NumberFormat formatter = new DecimalFormat("#0.000000");

        List<Integer> arr = new ArrayList<>();

        int n = scanner.nextInt(), arrItem;
        double positive=0, negative=0, zero=0;

        for (int i = 0; i < n; i++) {
            arrItem = scanner.nextInt();
            arr.add(arrItem);
        }

        for (int i : arr){
            if (i == 0){
                zero++;
            }else if (i > 0){
                positive++;
            }else {
                negative++;
            }
        }

        System.out.println(formatter.format(positive / n) + "\n" + formatter.format(negative / n) + "\n" + formatter.format(zero / n));


        // Staircase Problem Solution
        int counter;

        for (int i=1; i<=n; i++){
            counter = n - i;

            for (int j=0; j<counter; j++){
                System.out.print(" ");
            }

            for (int k=0; k<n-counter; k++){
                System.out.print("#");
            }
            System.out.println();
        }
*/

        // Mini-Max Sum Problem Solution

        List<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem2 = scanner.nextInt();
            arr2.add(arrItem2);
        }

        List<Long> add = new ArrayList<>();
        long result = 0;

        for (int j=0; j<arr2.size(); j++) {

            for (int i : arr2) {
                result += i;
            }
            result = result - arr2.get(j);

            add.add(result);
            result = 0;

        }

        java.util.Collections.sort(add);

        System.out.println(add.get(0) + " " + add.get(add.size()-1));


    }
}
