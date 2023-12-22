import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static int n;
    static boolean[] a;
    static Boolean[] memo;
    static int count = 0;
    public static void main(String[]$) {
        n = scanner.nextInt();
        a = new boolean[n];
        memo = new Boolean[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt() == 1;
        }
        for (int i = 1; i <= n; i++) {
            f(i);
        }
        System.out.println(count);
        for (int i = 0; i < n; i++) {
            if (memo[i]) {
                System.out.println(i + 1);
            }
        }
    }

    static boolean f(int i) {
        if (memo[i - 1] != null) {
            return memo[i - 1];
        }
        boolean b = a[i - 1];
        int j = 2;
        while (i * j <= n) {
            if (f(i * j)) {
                b = !b;
            }
            j++;
        }
        if (b) {
            count++;
        }
        return memo[i - 1] = b;
    }
}