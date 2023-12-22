import java.util.Arrays;
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

        System.out.println(solve(N, A));
    }

    private static int solve(int N, int[] A) {
        Arrays.sort(A);

        int count = 1;
        long size = A[0];
        for (int i=1; i<N; i++) {
            if (A[i] <= 2*size) {
                count++;
                size += A[i];
            } else {
                count = 1;
                size += A[i];
            }
        }

        return count;
    }
}