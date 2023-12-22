import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        System.out.println(solve(X));
    }

    private static int solve(int X) {
        int count = 0;

        while (X >= 500) {
            X -= 500;
            count += 1000;
        }
        while (X >= 5) {
            X -= 5;
            count += 5;
        }

        return count;
    }
}