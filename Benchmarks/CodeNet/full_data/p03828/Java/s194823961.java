import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long ans = 1;
        final int MOD = (int) (Math.pow(10, 9) + 7);
        for (int i = 1; i <= n; i++) {
            getPf(i);
        }
        for(int a : map.values()) {
            ans *= (a + 1);
            ans %= MOD;
        }
        System.out.println(ans);
    }

    // 素因数分解
    private static Map<Integer, Integer> getPf(int n) {
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                map.merge(i, 1, Integer::sum);
                n /= i;
            }
        }
        if (n != 1) {
            map.merge(n, 1, Integer::sum);
        }
        return map;
    }
}