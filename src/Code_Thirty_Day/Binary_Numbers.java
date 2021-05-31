package Code_Thirty_Day;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class Binary_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), store = 0, increase = 0;

        String string = Integer.toBinaryString(n);
        System.out.println(string);

        for (int i=0; i<string.length(); i++){
            if (string.charAt(i) == '1'){
                increase++;
                store = Math.max(store, increase);
            }else {
                increase = 0;
            }
        }

        System.out.println(store);

    }
}
