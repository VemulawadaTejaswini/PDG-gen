import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

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

        int[] count = new int[2 * 1_000_00 + 1];
        for (int i=0; i<N; i++) {
            count[A[i]]++;
        }
        int max = 0;
        for (int i=1; i<=2*1_000_00; i++) {
            if (count[i] >= 2) {
                max += count[i] * (count[i]-1) / 2;
            }
        }

        for (int i=0; i<N; i++) {
            ans[i] = max - count[A[i]] * (count[A[i]]-1)/2;
            if (count[A[i]] >= 2) {
                ans[i] += (count[A[i]]-1) * (count[A[i]]-2) /2;
            }
        }

        return ans;
    }
}