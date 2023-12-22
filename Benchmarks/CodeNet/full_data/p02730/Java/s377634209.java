import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        solve();

    }

    private static void solve() {

        String s = scanner.next();

        int n = s.length();

        boolean result = true;

        for (int i = 0; i < n / 2; i++) {

            if (i < (n / 2) / 2) {
                result &= s.charAt(i) == s.charAt((n - 1) / 2 - i-1);
                int l = i + (n + 3) / 2;
                result &= s.charAt(l) == s.charAt(n - 1 - l);
            }

            result &= s.charAt(i) == s.charAt(n - 1 - i);

        }

        System.out.println(result ? "Yes" : "No");
    }
}