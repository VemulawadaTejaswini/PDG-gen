import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        String S = scan.next();
        String T = scan.next();
        char[] chars_s = S.toCharArray();
        char[] chars_t = T.toCharArray();
        if (chars_s[0] != chars_t[0]) {
            System.out.println(-1);
            return;
        }
        if (N == M) {
            if (S.equals(T)) {
                System.out.println(N);
                return;
            } else {
                System.out.println(-1);
                return;
            }
        }
        long gcd = gcd(N, M);
        long lcm = N / gcd * M;
        HashMap<Long, Character> map = new HashMap<>();
        long ds = lcm / N;
        for (int i = 0; i < N; i++) {
            long x = 1 + i * ds;
            map.put(x, chars_s[i]);
        }
        long dt = lcm / M;
        for (int i = 0; i < M; i++) {
            long y = 1 + i * dt;
            if (map.containsKey(y) && map.get(y) != chars_t[i]) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(lcm);
    }
    private long gcd(long x, long y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
}
