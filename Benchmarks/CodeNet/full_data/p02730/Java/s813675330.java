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
        int N = S.length();

        if (!isPalindrome(S)) {
            return false;
        }
        if (!isPalindrome(S.substring(0, (N-1)/2))) {
            return false;
        }
        if (!isPalindrome(S.substring((N+3)/2-1))) {
            return false;
        }

        return true;
    }


    private static boolean isPalindrome(String S) {
        int N = S.length();

        for (int i=0; i<N/2; i++) {
            if (S.charAt(i) != S.charAt(N-i-1)) {
                return false;
            }
        }

        return true;
    }
}