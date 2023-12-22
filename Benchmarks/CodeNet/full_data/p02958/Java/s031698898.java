import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] p = new int[N];
        for (int i=0; i<N; i++) {
            p[i] = sc.nextInt();
        }

        System.out.println(solve(N, p) ? YES : NO);
    }

    private static boolean solve(int N, int[] p) {
        int diff = 0;

        for (int i=0; i<N; i++) {
            if (p[i] != i+1) diff++;
        }

        if (diff <= 2) return true;

        return false;
    }
}