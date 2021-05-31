package Algorithm_Problem;

import java.util.Scanner;

public class Time_Conversion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        String[] tArr = s.split(":");
        String AmPm = tArr[2].substring(2,4);
        int hh,mm,ss;

        hh = Integer.parseInt(tArr[0]);
        mm = Integer.parseInt(tArr[1]);
        ss = Integer.parseInt(tArr[2].substring(0,2));

        String checkPM = "PM", checkAM ="AM";

        if(AmPm.equals(checkAM) && hh==12)
        {
            hh=0;
        }
        else if(AmPm.equals(checkPM)&& hh<12)
        {
            hh+=12;
        }

        System.out.printf("%02d:%02d:%02d",hh,mm,ss);


    }
}
