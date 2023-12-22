import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve(N, M, A) ? YES : NO);
    }

    private static boolean solve(int N, int M, int[] A) {
        int total = 0;
        Arrays.sort(A);
        for (int i=0; i<N; i++) {
            total += A[i];
        }


        int threshold = total / (4 * M) + (total%(4*M) == 0 ? 0 : 1);
        for (int i=0; i<M; i++) {
            if (A[N-i-1] < threshold) {
                return false;
            }
        }

        return true;
    }
}