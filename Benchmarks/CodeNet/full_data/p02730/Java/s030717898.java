import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String S = sc.next();
            int N = S.length();
            System.out.println(isPalindrome(S) && isPalindrome(S.substring(0, (N - 1) / 2)) && isPalindrome(S.substring((N + 3) / 2 - 1, N)) ? "Yes" : "No");
        }
    }

    private static boolean isPalindrome(String s) {
        for (int l = 0, r = s.length() - 1; l < r; l++, r--) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
        }
        return true;
    }
}
