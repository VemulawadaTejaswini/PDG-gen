import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] sw = new int[M][N];
        int[] p = new int[M];
        int[][] sw_all = new int[(int) Math.pow(2, N)][N];

        for (int i = 0; i < M; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int s = sc.nextInt() - 1;
                sw[i][s] = 1;
            }
        }

        for (int i = 0; i < M; i++) {
            p[i] = sc.nextInt();
        }

        for (int i = 0; i < (int) Math.pow(2, N); i++) {
            for (int j = 0; j < N; j++) {
                if ((1 & i >> j) == 1) {
                    sw_all[i][j] = 1;
                }
            }
        }

        int ans = 0;

        for (int i = 0; i < Math.pow(2, N); i++) {
            for (int j = 0; j < M; j++) {
                int count = 0;
                for (int k = 0; k < N; k++) {
                    if (sw[j][k] == 1 && sw_all[i][k] == 1) {
                        count++;
                    }
                }
                if (count % 2 != p[j]) {
                    break;
                }
                if (j == M - 1) {
                    ans++;
                }
            }
        }

        System.out.println(ans);

        sc.close();
    }
}