import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        String s = sc.next();
        String t = sc.next();
        sc.close();

        // 主処理
        long l = lcm(n, m);
        int lpn = (int) (l / n);
        int lpm = (int) (l / m);

        boolean judge = true;
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String w = String.valueOf(s.charAt(i));
            int index = (i * lpn) + 1;
            if (!map.containsKey(index) || w.equals(map.get(index))) {
                map.put(index, w);
            } else {
                judge = false;
                break;
            }
        }

        for (int i = 0; i < m; i++) {
            String w = String.valueOf(t.charAt(i));
            int index = (i * lpm) + 1;
            if (!map.containsKey(index) || w.equals(map.get(index))) {
                map.put(index, w);
            } else {
                judge = false;
                break;
            }
        }

        long result = judge ? l : -1;

        // 出力
        System.out.println(result);
    }

    public static long lcm(long a, long b) {
        long gcd = gcd(a, b);
        return a / gcd * b;
    }

    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}