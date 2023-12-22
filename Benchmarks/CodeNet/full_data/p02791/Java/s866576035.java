import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] P = new int[N];
        for (int i=0; i<N; i++) {
            P[i] = sc.nextInt();
        }

        System.out.println(solve(N, P));
    }

    private static int solve(int N, int[] P) {
        int count = 0;

        int min = N+1;
        for (int i=0; i<N; i++) {
            if (P[i] < min) {
                min = P[i];
                count++;
            }
        }

        return count;
    }
}