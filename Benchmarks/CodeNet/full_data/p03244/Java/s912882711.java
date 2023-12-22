import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] v = new int[N];
        HashMap<Integer, Integer> emap = new HashMap<>();
        HashMap<Integer, Integer> omap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            v[i] = scan.nextInt();
            HashMap<Integer, Integer> map = i % 2 == 1 ? omap : emap;
            if (!map.containsKey(v[i])) {
                map.put(v[i], 0);
            }
            int count = map.get(v[i]);
            map.put(v[i], count+1);
        }
        TreeMap<Integer, List<Integer>> etmap = convert(emap);
        TreeMap<Integer, List<Integer>> otmap = convert(omap);
        int[] etop2 = top2(etmap);
        int[] otop2 = top2(otmap);
        long answer = Long.MAX_VALUE;
        if (etop2[0] != otop2[0]) {
            int a = etop2[0] == -1 ? 0 : emap.get(etop2[0]);
            int b = otop2[0] == -1 ? 0 : omap.get(otop2[0]);
            long t= Math.abs(a-N/2) + Math.abs(b-N/2);
            answer = t;
        } else {
            int a1 = etop2[0] == -1 ? 0 : emap.get(etop2[0]);
            int b1 = otop2[0] == -1 ? 0 : omap.get(otop2[0]);
            int a2 = etop2[1] == -1 ? 0 : emap.get(etop2[1]);
            int b2 = otop2[1] == -1 ? 0 : omap.get(otop2[1]);
            long t1= Math.abs(a1-N/2) + Math.abs(b2-N/2);
            long t2= Math.abs(a2-N/2) + Math.abs(b1-N/2);
            answer = Math.min(t1, t2);
        }
        System.out.println(answer);
    }
    public int[] top2(TreeMap<Integer, List<Integer>> tm) {
        int[] top2 = new int[2];
        top2[0] = -1;
        top2[1] = -1;
        Map.Entry<Integer, List<Integer>> ef = null;
        while (top2[0] == -1 || top2[1] == -1) {
            ef = tm.pollFirstEntry();
            if (ef == null) {
                break;
            }
            for (int x : ef.getValue()) {
                if (top2[0] == -1) {
                    top2[0] = x;
                    continue;
                }
                if (top2[1] == -1) {
                    top2[1] = x;
                }
            }
        }
        return top2;
    }
    public TreeMap<Integer, List<Integer>> convert(HashMap<Integer, Integer> map) {
        TreeMap<Integer, List<Integer>> tmap = new TreeMap<>(Comparator.reverseOrder());
        for(int x : map.keySet()) {
            int c = map.get(x);
            if (!tmap.containsKey(c)) {
                tmap.put(c, new ArrayList<>());
            }
            tmap.get(c).add(x);
        }
        return tmap;
    }
}
