package Java_Problem;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


// It works but the hackerrank does not accept it
public class Java_Regex_2__Duplicate_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine()), counter = 0;

        while (num-- > 0){
            String sentences = scanner.nextLine();

            String[] words = sentences.split(" ");

            java.util.ArrayList<String> stringList = new java.util.ArrayList<>(java.util.Arrays.asList(words));

            for (int i=0; i<stringList.size(); i++){
                for (int j=i+1; j<stringList.size(); j++){
                    if (stringList.get(i).toLowerCase().equals(stringList.get(j).toLowerCase())){
                        stringList.remove(j);
                        j--;
                    }
                }
            }

            for (String i : stringList){
                counter++;
                if (counter == stringList.size()){
                    System.out.print(i + "\n");
                }else {
                    System.out.print(i + " ");
                }
            }

        }
    }
}


// It works and the hackerrank accept it
class simple_solution{
    public static void main(String[] args) {
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
