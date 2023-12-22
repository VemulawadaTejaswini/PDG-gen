
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        String s = scanner.next();
        boolean bd;
        boolean ac;
        if (b < c && c < d) {
            bd = calculate(n, b, d, s)[d];
            ac = calculate(n, a, c, s)[c];
            if (bd && ac) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else if (c < b && b < d) {
            bd = calculate(n, b, d, s)[d];
            ac = calculate(n, a, c, s)[c];
            if (bd && ac) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            boolean[] dp = calculate(n, b, d, s);
            if (dp[d] == false) {
                System.out.println("No");
                return;
            }
            Set<Integer> bStands = new TreeSet<>();
            for (int i = b; i <= d; ++i) {
                if (dp[i]) {
                    bStands.add(i);
                }
            }
            boolean[] aDp = calculate(n, a, c, s);
            if (aDp[c] == false) {
                System.out.println("No");
                return;
            }
            Set<Integer> aStands = new TreeSet<>();
            for (int i = a; i <= c; ++i) {
                if (aDp[i]) {
                    aStands.add(i);
                }
            }
            for (int i = b; i <= d; ++i) {
                if (bStands.contains(i) && aStands.contains(i - 1) && aStands.contains(i + 1)) {
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");

        }

    }

    public static boolean[] calculate(int n, int start, int end, String s) {
        boolean [] dp = new boolean[n + 1];
        for (int i = 1; i <= n; ++i) {
            dp[i] = false;
        }
        dp[start] = true;
        for (int i = start + 1; i <= end; ++i) {
            if (s.charAt(i - 1) == '#') {
                dp[i] = false;
            } else {
                if (i - 1 >= 1) {
                    dp[i] = dp[i - 1];
                }
                if (i - 2 >= 1) {
                    dp[i] = dp[i] || dp[i - 2];
                }
            }
        }
        return dp;
    }
}
