package Java_Problem;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Java_Currency_Formatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us, india, china, france;

        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        us = format.format(payment);

        NumberFormat format1 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        china = format1.format(payment);

        NumberFormat format2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        france = format2.format(payment);

        NumberFormat format3 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        india = format3.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
