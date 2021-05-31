package Java_Problem;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Java_Date_and_Time {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Date, Month, Year;

        Month = scanner.nextInt();
        Date = scanner.nextInt();
        Year = scanner.nextInt();

        System.out.println("Result : " + findDay(Month, Date, Year));
    }

    private static String findDay(int month, int day, int year) {

        Date date = new Date();
        date.setDate(day);
        date.setMonth(month-1);
        date.setYear(-1900 + year);
        SimpleDateFormat formatter =new SimpleDateFormat("EEEE ");

        return formatter.format(date).toUpperCase();
    }
}
