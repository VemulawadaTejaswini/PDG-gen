import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d  = sc.nextInt();
        int res = 0;
        int[][] X = new int[n][d];
        for(int i = 0; i < n; i++) Arrays.setAll(X[i], j -> Integer.parseInt(sc.next()));
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int sum = 0;
                for(int k = 0; k < d; k++) sum += (X[i][k] - X[j][k]) * (X[i][k] - X[j][k]);
                if(Math.sqrt(sum) == (int)Math.sqrt(sum)) res++;
            }
        }
        System.out.println(res);
    }
}
