import java.util.*;

public class Main {
    static Map<Long, List<Long>> map = new HashMap<>();
    static Long[] keys;
    static long ans = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long W = in.nextLong();
        for(int i = 0; i < n; i++) {
            long w = in.nextLong(), v = in.nextLong();
            if(map.containsKey(w)) {
                map.get(w).add(v);
            } else {
                List<Long> list = new ArrayList<>();
                list.add(v);
                map.put(w, list);
            }
        }
        keys = new Long[map.keySet().size()];
        map.keySet().toArray(keys);
        solve(W, 0, 0L, 0L);
        System.out.println(ans);
    }

    public static void solve(long W, int idx, long wsum, long vsum) {
        long w = keys[idx];
        List<Long> list = map.get(w);
        Collections.sort(list);
        for(int i = 0; i < list.size()+1; i++) {
            if(i != 0) {
                vsum += list.get(i-1);
                wsum += w;
            }
            if(idx == keys.length - 1) {
                if(wsum <= W) {
                    ans = Math.max(ans, vsum);
                }
            } else {
                solve(W, idx+1, wsum, vsum);
            }
        }
    }
}