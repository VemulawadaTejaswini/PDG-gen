import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        Map<Pair, Integer> m = new HashMap<Pair, Integer>();
        int[] d = {-2, -1, 0};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) for (int k = 0; k < 3; k++) {
                int ny = a[i] + d[j], nx = b[i] + d[k];
                if (ny <= 0 || ny + 2 > h || nx <= 0 || nx + 2 > w) continue;
                Pair p = new Pair(ny, nx);
                m.put(p, m.getOrDefault(p, 0) + 1);
            }
        }
        long[] cnt = new long[10];
        for (Pair p : m.keySet()) {
            int c = m.get(p);
            cnt[c]++;
        }
        System.out.println(((long)(h - 2)) * (w - 2) - m.size());
        for (int i = 1; i <= 9; i++) {
            System.out.println(cnt[i]);
        }
    }
}

class Pair implements Comparable<Pair> {
    int first;
    int second;
    public Pair(int i, int j) {
        this.first = i;
        this.second = j;
    }
    public int compareTo(Pair p) {
        if (this.first != p.second) return this.first - p.first;
        return this.second - p.second;
    }
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null) return false;
        if (!(o instanceof Pair)) return false;
        Pair p = (Pair) o;
        if (this.first != p.first || this.second != p.second) return false;
        return true;
    }
    public int hashCode() {
        return Objects.hash(this.first, this.second);
    }
    public String toString() {
        String ret = Integer.toString(this.first) + ", " + Integer.toString(this.second);
        return ret;
    }
}
