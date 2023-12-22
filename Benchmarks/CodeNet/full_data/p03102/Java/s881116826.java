import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();
        int[] B = new int[M];
        for (int i=0; i<M; i++) {
            B[i] = sc.nextInt();
        }

        int[][] A = new int[N][M];
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                A[i][j] = sc.nextInt();
            }

        }

        System.out.println(solve(N, M, C, B, A));
    }

    private static int solve(int N, int M, int C, int[] B, int[][] A) {
        int count = 0;

        for (int i=0; i<N; i++) {
            int value = 0;
            for (int j=0; j<M; j++) {
                value += A[i][j] * B[j];
            }
            value += C;

            if (value > 0) count++;
        }

        return count;
    }
}