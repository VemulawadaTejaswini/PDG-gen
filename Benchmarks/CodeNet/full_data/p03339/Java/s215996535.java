import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();

        System.out.println(solve(N, S));
    }

    private static int solve(int N, String S) {
        int min = Integer.MAX_VALUE;

        int[] left = new int[N+2];
        int[] right = new int[N+2];
        for (int i=2; i<=N; i++) {
            right[i] = right[i-1] + (S.charAt(i-2) == 'W' ? 1 : 0);
        }
        // System.err.println(Arrays.toString(right));
        for (int i=N-1; i>=1; i--) {
            left[i] = left[i+1] + (S.charAt(i) == 'E' ? 1 : 0);
        }
        // System.err.println(Arrays.toString(left));

        for (int i=1; i<=N; i++) {
            if (min > right[i] + left[i]) {
                // System.err.println("update! i=" + i + ", right=" + right[i] + ", left=" + left[i]);
            }
            min = Math.min(min, right[i] + left[i]);
        }


        return min;
    }
}