import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long ans = 0;
        for (int i = b; i < w; i++) {
            ans = (ans + f(i, h - a - 1) * f(w - i - 1, a - 1) % 1000000007) % 1000000007;
        }
        System.out.println(ans);
    }

    static long f(long h, long w) {
        return combinationAndMod(h + w, Math.min(h, w));
    }

    static long combinationAndMod(long n, long r) {
        long x = 1, y = 1;
        for (long i = 1; i <= r; i++) {
            x = x * (n - r + i) % 1000000007;
            y = y * i % 1000000007;
        }
        return x * powAndMod(y, 1000000005) % 1000000007;
    }

    static long powAndMod(long a, long b) {
        if (b == 0)
            return 1;
        if ((b & 1) == 1)
            return a * powAndMod(a, b - 1) % 1000000007;
        return powAndMod(a * a % 1000000007, b / 2);
    }
}