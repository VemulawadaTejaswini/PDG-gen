import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(solve(a, b, c));
    }

    private static int solve(int a, int b, int c) {
        int count = 1;

        if (a != b) count++;
        if (a != c && b != c) count++;

        return count;
    }
}
