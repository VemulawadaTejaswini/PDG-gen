import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        long n = scanner.nextLong();
        long x = scanner.nextLong();
        long y = n - x;
        long ans = n;
        while (x != 0 && y != 0) {
            Utils.println(x, y, ans);
            if (x > y) {
                ans += x / y * y * 2;
                x %= y;
            } else {
                ans += y / x * x * 2;
                y %= x;
            }
        }
        System.out.println(ans - x - y);
    }
}