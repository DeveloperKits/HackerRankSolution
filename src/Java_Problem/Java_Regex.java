package Java_Problem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Java_Regex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        /*String IP = null;
        
        while(in.hasNext()){
            IP = in.next();
            String [] tempArray;

            tempArray = IP.split("\\.");

            if (tempArray.length == 4){
                int count = 0;
                for (int i=0; i< tempArray.length; i++){
                    if (Pattern.matches("(0?[0-9]{1,2}|1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])", tempArray[i])){
                        count++;
                    }
                }

                if (count==4){
                    System.out.println("true");
                }else {
                    System.out.println("false");
                }

            }else {
                System.out.println("false");
            }

            System.out.println(tempArray.length);

        }*/


        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    String num = "(0?[0-9]{1,2}|1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";  // check 0-255
    String pattern = num + "." +  num + "." +  num + "." + num;
}