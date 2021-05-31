package Java_Problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

    private int age, counter = 0;

    public Solution(int initialAge) {
        // Add some more code to run some checks on initialAge
        this.age = initialAge;
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        if(age < 0){
            if (counter == 0) {
                System.out.println("Age is not valid, setting age to 0.");
                System.out.println("You are young.");
                counter++;
            }else {
                System.out.println("You are young.");
            }
        }else if(age < 13){
            System.out.println("You are young.");
            counter = 0;
        }else if(age < 18){
            System.out.println("You are a teenager.");
            counter = 0;
        }else{
            System.out.println("You are old.");
            counter = 0;
        }
    }

    public void yearPasses() {
        // Increment this person's age.
        age++;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = sc.nextInt();
            arr.add(arrItem);
        }

        Collections.reverse(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
