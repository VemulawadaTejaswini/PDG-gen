import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int[] ans = solve(N, X, Y);
        for (int i=1; i<=N-1; i++) {
            System.out.println(ans[i]);
        }

    }

    private static int[] solve(int N, int X, int Y) {
        int[] ans = new int[N];

        for (int i=1; i<=N; i++) {
            for (int j=i+1; j<=N; j++) {
                // System.err.println(i + " -> " + j + " =" + minDist(N, X, Y, i, j));
                ans[minDist(N, X, Y, i, j)]++;
            }
        }

        return ans;
    }

    private static int minDist(int N, int X, int Y, int i, int j) {
        return Math.min(j-i, Math.abs(X-i) + 1 + Math.abs(Y-j));
    }
}