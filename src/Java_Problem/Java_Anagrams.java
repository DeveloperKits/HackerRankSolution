package Java_Problem;

import java.util.Arrays;
import java.util.Scanner;

public class Java_Anagrams {

    static boolean isAnagram(String a, String b) {

        String storeOne, storeTwo;

        if (a.length() != b.length()){
            return false;
        }else {
            char[] one = a.toLowerCase().toCharArray();
            char[] two = b.toLowerCase().toCharArray();
            java.util.Arrays.sort(one);
            java.util.Arrays.sort(two);

            storeOne = new String(one);
            storeTwo = new String(two);

            return storeOne.equals(storeTwo);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }
}
