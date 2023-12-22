import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    private static Map<Long, Integer> map = new HashMap<>();

    private static void primeFactors(long n) {
        while (n % 2 == 0) {
            map.put(2L, map.getOrDefault(2L, 0) + 1);
            n /= 2;
        }
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        if (n > 2) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final long MOD = 1_000_000_007;
        for (int i = 2; i <= n; i++) {
            primeFactors(i);
        }
        long sum = 1;
        for (Entry<Long, Integer> e : map.entrySet()) {
            sum *= e.getValue() + 1;
            sum %= MOD;
        }
        System.out.println(sum);
    }

}
