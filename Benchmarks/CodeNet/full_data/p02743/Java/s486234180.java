import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();
        if (c - a - b <= 0) {
            System.out.println("No");
            return;
        }
        long target = sqrt(a * b * 4);
        if (target < c - a - b) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
    public static long sqrt(long x) {
        long left = 0;
        long right = x;
        while (left + 1 < right) {
            long mid = (left + right) / 2;
            if (mid * mid <= x) {
                left = mid;
            } else {
                right = mid;
            }
        }
        if (left * left <= x && x < (left + 1) * (left + 1)) {
            return left;
        }
        return left + 1;
    }
}
