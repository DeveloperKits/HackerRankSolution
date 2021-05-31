package Algorithm_Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grading_Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            int arrItem2 = scanner.nextInt();
            arr.add(arrItem2);
        }

        int counter = 0, storeOne, storeTwo;

        for (int i : arr){
            storeOne = i%5;
            storeTwo = i/5;

            while (storeOne < 5){
                counter++;
                storeOne++;
            }

            if (counter < 3){
                if (i>37) {
                    System.out.println(((storeTwo*5) + storeOne));

                }else {
                    System.out.println(i);
                }

            }else {
                System.out.println(i);
            }
            counter = 0;
        }

    }
}
