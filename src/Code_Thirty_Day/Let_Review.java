package Code_Thirty_Day;

import java.util.Scanner;

public class Let_Review {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String Name = scanner.nextLine();

        for (int i=0; i<N; i++){
            Name = scanner.nextLine();

            char[] store = Name.toCharArray();
            StringBuilder s1, s2;
            s1 = new StringBuilder();
            s2 = new StringBuilder();
            for (int j=0; j< store.length; j++){
                if (j%2 == 0){
                    s1.append(store[j]);
                }else {
                    s2.append(store[j]);
                }
            }
            System.out.println(s1 + " " + s2);
        }
    }
}
