import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long gcd(long x, long y) {
        return y == 0 ? x : gcd(y, x % y);
    }

    static long lcm(long x, long y) {
        return x * (y / gcd(x, y));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
//        String[] str = br.readLine().split(" ");

        long[] t = new long[n];
        for (int i = 0; i < n; i++) {
            t[i] = Long.parseLong(br.readLine());
        }

        long recent_lcm = lcm(t[0], t[1]);
        for (int i = 2; i < n; i++) {
            recent_lcm = lcm(recent_lcm, t[i]);
        }

        System.out.println(recent_lcm);

    }
}