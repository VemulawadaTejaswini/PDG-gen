import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int R = sc.nextInt();
        int S = sc.nextInt();
        int P = sc.nextInt();
        String T = sc.next();

        System.out.println(solve(N, K, R, S, P, T));
    }

    private static int solve(int N, int K, int R, int S, int P, String T) {
        int[][] score = new int[N+1][3];

        for (int i=0; i<N; i++) {
            char ch = T.charAt(i);

            if (i < K) {
                score[i+1][0] = max(score[i]) + toScore(R, S, P, ch, 'r');
                score[i+1][1] = max(score[i]) + toScore(R, S, P, ch, 's');
                score[i+1][2] = max(score[i]) + toScore(R, S, P, ch, 'p');
            } else {
                score[i+1][0] = max(score[i]) - max(score[i+1-K]) + Math.max(score[i+1-K][1], score[i+1-K][2]) + toScore(R, S, P, ch, 'r');
                score[i+1][1] = max(score[i]) - max(score[i+1-K])+ Math.max(score[i+1-K][2], score[i+1-K][0]) + toScore(R, S, P, ch, 's');
                score[i+1][2] = max(score[i]) - max(score[i+1-K]) + Math.max(score[i+1-K][0], score[i+1-K][1]) + toScore(R, S, P, ch, 'p');
            }

            // System.err.println((i+1) + ": " + score[i+1][0] + ", " + score[i+1][1] + ", " + score[i+1][2]);
        }

        return max(score[N]);
    }

    private static int toScore(int R, int S, int P, char t, char s) {
        if (t == 'r' && s == 'p') return P;
        if (t == 'p' && s == 's') return S;
        if (t == 's' && s == 'r') return R;

        return 0;
    }

    private static int max(int[] array) {
        int max = array[0];
        for (int i=1; i<array.length; i++) {
            max = Math.max(max, array[i]);
        }

        return max;
    }
}