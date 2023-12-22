import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        int[] ans = solve(N, A);
        for (int i=0; i<N; i++) {
            System.out.println(ans[i]);
        }
    }

    private static int[] solve(int N, int[] A) {
        int[] ans = new int[N];

        int max =  Math.max(A[0], A[1]);
        int max2 = Math.min(A[0], A[1]);

        for (int i=2; i<N; i++) {
            if (A[i] >= max) {
                max2 = max;
                max = A[i];
            } else if (A[i] >= max2) {
                max2 = A[i];
            }
        }

        for (int i=0; i<N; i++) {
            if (A[i] == max) {
                ans[i] = max2;
            } else {
                ans[i] = max;
            }
        }

        return ans;
    }
}