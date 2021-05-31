package Java_Problem;

import java.util.Scanner;

public class Java_String_Tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        s = s.trim();

        // if length is 0
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] words = s.split("[^A-Za-z]+");
        System.out.println(words.length);

        for (String word: words){
            System.out.println(word);
        }
    }
}
