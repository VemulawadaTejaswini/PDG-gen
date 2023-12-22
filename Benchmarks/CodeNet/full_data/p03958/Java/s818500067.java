import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int T = sc.nextInt();
        int[] a = new int[T];
        for (int i=0; i<T; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(solve(K, T, a));
    }

    private static int solve(int K, int T, int[] a) {
        int max = 0;
        for (int i=0; i<T; i++) {
            max = Math.max(max, a[i]);
        }
        if (max <= K/2) return 0;

        // System.err.println(max);
        return 2*max - K - T%2;
    }
}