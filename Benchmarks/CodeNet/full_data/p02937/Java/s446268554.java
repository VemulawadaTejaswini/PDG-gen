import java.io.PrintWriter;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        String s = in.next();
        String t = in.next();
        int sn = s.length();
        int tn = t.length();

        Map<Character, List<Integer>> sMap = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (sMap.containsKey(ch)) {
                sMap.get(ch).add(i);
            } else {
                List<Integer> l = new ArrayList<>();
                l.add(i);
                sMap.put(ch, l);
            }
        }

        Map<Character, int[]> map = new HashMap<>();
        sMap.forEach((k, v) -> {
            v.sort((Comparator.comparingInt(o -> o)));
            map.put(k, v.stream().mapToInt(i->i).toArray());
        });

        // out.println(sMap);
        long ans = 0;
        int before = -1;
        chars = t.toCharArray();
        for (char ch : chars) {
            int[] possible = map.get(ch);
            if (possible == null || possible.length == 0) {
                ans = -1;
                break;
            }

            int minIndex = nextIndex(possible, before, sn);
            int min = distance(minIndex, before, sn);
            ans += min;
            before = minIndex;
        }

        out.println(ans);
    }

    private static int nextIndex(int[] possible, int before, int sn) {
         int pt = Arrays.binarySearch(possible, before);
         if (pt >= 0)
             return sn;
         pt = ~pt;

         return possible[pt % possible.length];
    }

    private static int distance(int i, int before, int sn) {
        if (i == before)
            return sn;
        if (i > before)
            return i - before;
        return i + sn - before;
    }

}
