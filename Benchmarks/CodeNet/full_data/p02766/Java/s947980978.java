import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(solve(N, K));
    }

    private static int solve(int N, int K) {
        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            int val = N%K;

            sb.append(val);
            N /= K;
        }

        return sb.reverse().toString().length();
    }
}