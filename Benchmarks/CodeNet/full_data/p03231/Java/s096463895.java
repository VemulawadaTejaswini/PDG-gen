import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        String t = sc.next();

        long l = lcm(n, m);
        Map<Long, Character> x = new HashMap<>();
        for (int i = 0; i < n; i++) {
            x.put(i * l / n, s.charAt(i));
        }
        for (int i = 0; i < m; i++) {
            long key = i * l / m;
            if (x.containsKey(key) && x.get(key) != t.charAt(i)) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(l);
    }

}
