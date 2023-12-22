import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        long[] a = new long[n];
        a[0] = in.nextInt();
        for(int i = 1; i < n; i++) {
            a[i] = in.nextLong() + a[i - 1];
        }
        Map<Long, Long> map = new HashMap<>();
        map.put(0L, 1L);
        for(long key: a) {
            Long val = map.get(key);
            map.put(key, val == null ? 1L : val + 1L);
        }
        long ans = 0;
        for(long key : map.keySet()) {
            Long val = map.get(key);
            if(val > 1) {
                ans += (val * (val - 1)) / 2;
            }
        }
        System.out.println(ans);
    }
}