import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static long[] buildValues(int d) {
        long[] res = new long[d/2];
        long high = (long) Math.pow(10, d - 1);
        long low = 1L;
        for (int i = 0; i < d / 2; i++) {
            res[i] = high - low;
            high /= 10;
            low *= 10;
        }

        return res;
    }

    public static long dp(long[] vs, long D) {
        Map<Long, Long> map = new HashMap<>();
        Map<Long, Long> nextMap = new HashMap<>();
        map.put(0L, 1L);
        for (long v : vs) {
            nextMap.clear();
            for (Map.Entry<Long, Long> e : map.entrySet()) {
                for (int i = 0; i < 10; i++) {
                    nextMap.put(e.getKey() + i * v, e.getValue() * (10 - i));
                }
            }
            for (Map.Entry<Long, Long> e : nextMap.entrySet()) {
                map.put(e.getKey(), e.getValue());
            }
        }
        return (map.getOrDefault(D, 0L) + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int D = in.nextInt();

        long res = 0;
        for (int d = 1; d <= 10; d++) {
            long[] vs = buildValues(d);
            long next = dp(vs, D);
            if (d % 2 == 1) next *= 10;
            res += next;
        }
        System.out.println(res);
    }
    /*
    a = 10x + y
    b = 10y + x
    a - b = 9x - 9y = 9(x - y)


    a = 100x + 10y + z
    b = 100z + 10y + x
    a - b = 99x - 99z = 99(x - z) + 0y

    a = 1000x + 100y + 10z + w
    b = 1000w + 100z + 10y + x
    a - b = 999x - 999w + 90y - 90z = 999(x - w) + 90(y - z)

    a = 10000x + 1000y + 100z + 10w + v
    b = 10000v + 1000w + 100z + 10y + x
    a - b = 9999(x - v) + 990(y - w) + 0z
    */
    static int rev(int x) {
        String s = "0";
        while (x > 0) {
            s += x % 10 + "";
            x /= 10;
        }
        return Integer.valueOf(s);
    }
}
