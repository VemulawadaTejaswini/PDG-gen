import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] A = new int[2][N];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        for (int k = 0; k < N; k++) {
            int tmpMax = 0;
            for (int j = 0; j <= k; j++) {
                tmpMax += A[0][j];
            }

            for (int j = k; j < N; j++) {
                tmpMax += A[1][j];
            }
            max = Math.max(max, tmpMax);
        }

        out.println(max);
    }
}