package Algorithm_Problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Birthday_Cake_Candles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> arr2 = new ArrayList<>();
        int searching_number, counter = 0;

        for (int i = 0; i < 5; i++) {
            int arrItem2 = scanner.nextInt();
            arr2.add(arrItem2);
        }

        //Collections.sort(arr2);
        searching_number = Collections.max(arr2);

        for (int i : arr2){
            if (i == searching_number){
                counter++;
            }

        }

        System.out.println(counter);

    }

}
