import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        int l = lcm(n, m);
        Map<Long, Character> x = new HashMap<>();
        for (int i = 0; i < n; i++) {
            x.put((long) i * l / n, s.charAt(i));
        }
        for (int i = 0; i < m; i++) {
            long key = (long) i * l / m;
            if (x.containsKey(key) && x.get(key) != t.charAt(i)) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(l);
    }

}
