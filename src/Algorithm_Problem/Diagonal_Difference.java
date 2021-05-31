package Algorithm_Problem;

import java.util.Scanner;

public class Diagonal_Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                array[i][j] = scanner.nextInt();
            }
        }

        int X = 0, Y = 0, Counter = 0;

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (Counter == j){
                    X = X + array[i][j];
                    Counter++;
                    break;
                }
            }
        }

        Counter = n-1;

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (Counter == j){
                    Y = Y + array[i][j];
                    Counter--;
                    break;
                }
            }
        }

        System.out.println(Math.abs(X-Y));

    }
}
