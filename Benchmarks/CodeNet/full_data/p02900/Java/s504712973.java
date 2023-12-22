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
        int A = scan.nextInt();
        int B = scan.nextInt();
        int gcd = gcd(A, B);
        Map<Integer, Integer> map = divisors(gcd);
        System.out.println(map.size() + 1);
    }
    private Map<Integer, Integer> divisors(int N) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 2; i <= N; i++) {
            if (N % i != 0) {
                continue;
            }
            int count = 0;
            while (N % i == 0) {
                count += 1;
                N /= i;
            }
            result.put(i, count);
        }
        return result;
    }
    private int gcd(int A, int B) {
        if (B == 0) {
            return A;
        }
        return gcd(B,A % B);
    }
}
