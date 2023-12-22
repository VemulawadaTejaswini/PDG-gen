import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long e_t = scan.nextLong();
        long e_a = scan.nextLong();
        for (int i = 2; i <= N; i++) {
            long t = scan.nextLong();
            long a = scan.nextLong();
            long j = Math.max(ceil(e_t, t), ceil(e_a, a));
            e_t = t * j;
            e_a = a * j;
        }
        System.out.println(e_t + e_a);
    }
    public long ceil(long x, long y) {
        if (x % y == 0) {
            return x / y;
        } else {
            return x / y + 1;
        }
    }
}
