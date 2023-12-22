import java.util.*;

public class Main {
    private static class R {
        public String s;
        public int n;
        public R(String s, int n) { this.s = s; this.n = n; }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            String s = sc.nextLine();
            if (!mp.containsKey(s)) mp.put(s, 0);
            mp.put(s, mp.get(s) + 1);
        }
        List<R> l = new ArrayList<>(mp.size());
        for (Map.Entry<String, Integer> e : mp.entrySet()) {
            l.add(new R(e.getKey(), e.getValue()));
        }
        Collections.sort(l, (a, b) -> {
            int cmp = b.n - a.n;
            return cmp != 0 ? cmp : (a.s.compareTo(b.s));
        });
        int v = l.get(0).n;
        int p = 0;
        while (p < l.size() && l.get(p).n == v) {
            System.out.println(l.get(p).s);
            p++;
        }
    }
}
