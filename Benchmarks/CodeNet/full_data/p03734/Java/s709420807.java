import java.util.*;

public class Main {
    static Map<Integer, List<Integer>> map = new HashMap<>();
    static Integer[] keys;
    static int ans = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), W = in.nextInt();
        for(int i = 0; i < n; i++) {
            int w = in.nextInt(), v = in.nextInt();
            if(map.containsKey(w)) {
                map.get(w).add(v);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(v);
                map.put(w, list);
            }
        }
        keys = new Integer[map.keySet().size()];
        map.keySet().toArray(keys);
        solve(W, 0, 0, 0);
        System.out.println(ans);
    }

    public static void solve(int W, int idx, int wsum, int vsum) {
        int w = keys[idx];
        List<Integer> list = map.get(w);
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