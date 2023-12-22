import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        System.out.println(solve(S) ? YES : NO);
    }

    private static boolean solve(String S) {
        if (S.charAt(2) == S.charAt(3) && S.charAt(4) == S.charAt(5)) {
            return true;
        }

        return false;
    }
}