
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int d = in.nextInt();
        int[][] points = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                points[i][j] = in.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int result = 0;
                for (int k = 0; k < d; k++) {
                    result += Math.pow(Math.abs(points[i][k] - points[j][k]), 2);
                }
                double sqrt = Math.sqrt(result);
                if(Math.floor(sqrt) == sqrt){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
