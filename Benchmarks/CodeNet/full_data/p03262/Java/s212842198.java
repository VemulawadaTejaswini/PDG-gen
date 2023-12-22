import java.util.Scanner;

public class Main {

    static int gcd(int x, int y) {
        if (x < y) {
            int t = x;
            x = y;
            y = t;
        }

        if (x % y == 0) {
            return y;
        }

        return gcd(x % y, y);
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int x = std.nextInt();
        int[] xs = new int[n];
        for (int i = 0; i < n; i++) {
            xs[i] = Math.abs(std.nextInt() - x);
        }
        int ans = 1;
        for (int i = 0; i < n; i++) {
            if (xs[i] == 0) {
                continue;
            }
            if (ans == 1) {
                ans = xs[i];
            } else {
                ans = gcd(xs[i], ans);
            }
        }

        System.out.println(ans);
    }
}
