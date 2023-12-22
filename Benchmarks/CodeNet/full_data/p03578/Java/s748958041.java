import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int d = Integer.parseInt(sc.next());
            if (h.containsKey(d)) {
                h.put(d, h.get(d) + 1);
            } else {
                h.put(d, 1);
            }
        }
        int m = Integer.parseInt(sc.next());
        HashMap<Integer, Integer> g = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int t = Integer.parseInt(sc.next());
            if (g.containsKey(t)) {
                g.put(t, g.get(t) + 1);
            } else {
                g.put(t, 1);
            }
        }
        sc.close();
        boolean f = true;
        for (int k : g.keySet()) {
            if (!h.containsKey(k) || h.get(k) < g.get(k)) {
                f = false;
                break;
            }
        }
        System.out.println((f ? "YES" : "NO"));
    }
}