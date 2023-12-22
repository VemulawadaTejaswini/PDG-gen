import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();
        int[] A = new int[Q];
        for (int i=0; i<Q; i++) {
            A[i] = sc.nextInt();
        }

        String[] ans = solve(N, K, Q, A);
        for (int i=0; i<N; i++) {
            System.out.println(ans[i]);
        }
    }

    private static String[] solve(int N, int K, int Q, int[] A) {
        String[] ans = new String[N];
        int[] score = new int[N+1];

        for (int i=0; i<Q; i++) {
            score[A[i]]++;
        }

        for (int i=0; i<N; i++) {
            ans[i] = K - (Q - score[i+1]) > 0 ? YES : NO;
        }

        return ans;
    }
}