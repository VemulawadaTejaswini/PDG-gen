import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long ans = 0;
        for (long i = a; i <= b; i++) {
            if (a % x == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
