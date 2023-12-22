import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        System.out.println(solve(L));
    }

    private static double solve(int L) {
        double a = L/3.0;

        return Math.pow(a, 3);
    }
}