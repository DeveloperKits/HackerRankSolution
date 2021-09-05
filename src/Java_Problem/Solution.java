package Java_Problem;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        Calendar calFordDate = Calendar.getInstance();
        SimpleDateFormat currentDate = new SimpleDateFormat("dd");
        n = Integer.parseInt(currentDate.format(calFordDate.getTime()));
        System.out.println(n + 3);

        LocalDate now = LocalDate.now(); // 2015-11-24
        LocalDate earlier = now.minusMonths(1); // 2015-10-24

        earlier.getMonth(); // java.time.Month = OCTOBER
        earlier.getMonth().getValue(); // 10
        earlier.getYear(); // 2015

        //String s = earlier.format(DateTimeFormatter.ofPattern("May"));

        System.out.println(earlier.toString());
        System.out.println(earlier.getMonthValue());
        System.out.println(now.getMonth());

        earlier.getMonthValue();

        String [] strings = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int index = Arrays.asList(strings).indexOf("April");

        System.out.println(index);
    }
}
