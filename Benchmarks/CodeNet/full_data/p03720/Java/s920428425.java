import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] AB = new int[M][2];
        int[] city = new int[51];
        for (int i = 0; i < M; ++i) {
            AB[i][0] = sc.nextInt();
            AB[i][1] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < M; ++i) {
            for (int j = 0; j < 2; ++j) {
                city[AB[i][j]]++;
            }
        }

        for (int ans : city) {
            if (ans > 0) {
                System.out.println(ans);
            }
        }
    }
}