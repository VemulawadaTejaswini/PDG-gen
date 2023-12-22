import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long H = sc.nextLong();

        System.out.println(solve(H));
    }

    private static long solve(long H) {
        long sum = 0;
        long count = 1;

        for (; H>0; H/=2) {
            if (H == 1) {
                sum += count;
                continue;
            }

            sum += count;
            count *= 2;
        }

        return sum;
    }
}