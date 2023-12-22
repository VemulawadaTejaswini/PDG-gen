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

        // out.println(sMap);
        long ans = 0;
        int before = -1;
        chars = t.toCharArray();
        for (char ch : chars) {
            List<Integer> possible = sMap.get(ch);
            if (possible == null || possible.size() == 0) {
                ans = -1;
                break;
            }

            int minIndex = -1;
            int min = Integer.MAX_VALUE;
            for (int i : possible) {
                if (min > distance(i, before, sn)) {
                    minIndex = i;
                    min = distance(i, before, sn);
                }
            }
            ans += min;
            before = minIndex;
        }

        out.println(ans);
    }

    private static int distance(int i, int before, int sn) {
        if (i == before)
            return sn;
        return (i + sn - before) % sn;
    }

}
