import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        long lcm = lcm(n, m);
        int lIndex = 1;
        while (lcm * lIndex < Math.max(n, m)) {
            lIndex++;
        }
        lcm = lIndex * lcm;
        HashMap<Long, Character> map = new HashMap<>();
        int index = -1;
        long nl = lcm / n;
        while (++index < n) {
            long key = index * nl;
            map.put(key, s.charAt(index));
        }
        index = -1;
        long nm = lcm / m;
        while (++index < m) {
            long key = index * nm;
            if (map.containsKey(key)) {
                if (!map.get(key).equals(t.charAt(index))) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(lcm);
    }

    private static long lcm(long a, long b) {
        return Math.max(a, b) / gcd(a, b) * Math.min(a, b);
    }

    private static long gcd(long a, long b) {
        long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }
}