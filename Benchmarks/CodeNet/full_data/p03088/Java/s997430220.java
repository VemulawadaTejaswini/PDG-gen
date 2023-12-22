import java.util.*;

public class Main {

    private static final long MOD = 1000000007L;

    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    private boolean isAGC(String str) {
        if (str.contains("AGC")) {
            return true;
        } else if (str.contains("GAC")) {
            return true;
        } else if (str.contains("ACG")) {
            return true;
        } else if (str.startsWith("A") && str.endsWith("GC")) {
            return true;
        } else if (str.startsWith("AG") && str.endsWith("C")) {
            return true;
        }
        return false;
    }

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 3) {
            System.out.println(61);
            return;
        }

        String ACGT = "ACGT";
        Map<String, Long> map = new HashMap<>();
        for (char c1 : ACGT.toCharArray()) {
            for (char c2 : ACGT.toCharArray()) {
                for (char c3 : ACGT.toCharArray()) {
                    for (char c4 : ACGT.toCharArray()) {
                        String key = "" + c1 + c2 +c3 + c4;
                        map.put(key, isAGC(key) ? 0L : 1L);
                    }
                }
            }
        }
        for (int cur = 4; cur < N; cur += 1) {
            Map<String, Long> nextMap = new HashMap<>();
            for (String key : map.keySet()) {
                for (char next : ACGT.toCharArray()) {
                    String nextKey = (key + next).substring(1);
                    if (!isAGC(nextKey)) {
                        if (!nextMap.containsKey(nextKey)) {
                            nextMap.put(nextKey, 0L);
                        }
                        long nextValue = nextMap.get(nextKey) + map.get(key);
                        nextValue %= MOD;
                        nextMap.put(nextKey, nextValue);
                    }
                }
            }
            map = nextMap;
        }

        long ans = 0L;
        for (long value : map.values()) {
            ans += value;
            ans %= MOD;
        }
        System.out.println(ans);
    }

}
