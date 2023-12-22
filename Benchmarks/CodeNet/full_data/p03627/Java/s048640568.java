import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve(N, A));
    }

    private static long solve(int N, long[] A) {
        long area = 0;

        Arrays.sort(A);
        for (int i=N-2; i>=0; i--) {
            if (A[i] == A[i+1]) {
                if (area == 0) {
                    area = A[i];
                    i -= 1;
                } else {
                    area *= A[i];
                    return area;
                }
            }
        }

        return 0;
    }
}