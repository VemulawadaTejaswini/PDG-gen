import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long A = scan.nextLong();
        long B = scan.nextLong();
        long gcd = gcd(A, B);
        Map<Long, Long> map = divisors(gcd);
        System.out.println(map.size() + 1);
    }
    private Map<Long, Long> divisors(long N) {
        Map<Long, Long> result = new HashMap<>();
        for (long i = 2; i * i <= N; i++) {
            if (N % i != 0) {
                continue;
            }
            long count = 0;
            while (N % i == 0) {
                count += 1;
                N /= i;
            }
            result.put(i, count);
        }
        if (N != 1) {
            result.put(N, 1L);
        }
        return result;
    }
    private long gcd(long A, long B) {
        if (B == 0) {
            return A;
        }
        return gcd(B,A % B);
    }
}
