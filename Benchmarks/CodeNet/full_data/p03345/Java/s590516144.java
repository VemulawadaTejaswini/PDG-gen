import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        long K = sc.nextLong();

        System.out.println(solve(A, B, C, K));
    }

    private static long solve(int A, int B, int C, long K) {
        long count = B - A;
        if (K%2 == 0) count *= -1;


        return count;
    }
}