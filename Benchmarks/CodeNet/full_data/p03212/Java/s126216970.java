import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        System.out.println(solve(n));
    }

    private static long solve(long n) {
        return dfs("", n);
    }

    private static long dfs(String s, long n) {
        long res = 0;
        if (!s.isEmpty()) {
            if (check(s, n)) {
                res++;
            } else if (Long.parseLong(s) > n) {
                return 0;
            }
        }
        for (String next : Arrays.asList("7", "5", "3")) {
            res += dfs(s + next, n);
        }
        return res;
    }

    private static boolean check(String s, long n) {
        long sl = Long.parseLong(s);
        if (sl > n) {
            return false;
        }
        if (!s.contains("3") || !s.contains("5") || !s.contains("7")) {
            return false;
        }
        return true;
    }
}
