import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt();
        Susi[] susi = new Susi[N];
        for (int n = 0; n < N; n++) susi[n] = new Susi(sc.nextInt(), sc.nextLong());
        Arrays.sort(susi, Comparator.reverseOrder());
        PriorityQueue<Susi> used = new PriorityQueue<>();
        PriorityQueue<Susi> rem = new PriorityQueue<>((s1, s2) -> -Long.compare(s1.priority, s2.priority));
        Map<Integer, Integer> map = new HashMap<>();
        long max = 0;
        long[] f = new long[N];
        for (int i = 0; i < K; i++) {
            used.add(susi[i]);
            if (map.containsKey(susi[i].t)) {
                int x = map.get(susi[i].t);
                map.put(susi[i].t, x + 1);
            } else {
                map.put(susi[i].t, 1);
            }
            max += susi[i].d;
            f[i] = max + (long) map.size() * (long) map.size();
        }
        for (int i = K; i < N; i++) rem.add(susi[i]);
        int c = 0;
        outside: while (used.size() > 0) {
            Susi s = used.poll();
            if (map.get(s.t) > 1) {
                while (rem.size() > 0) {
                    Susi u = rem.poll();
                    if (!map.containsKey(u.t)) {
                        max += u.d - s.d;
                        map.put(u.t, 1);
                        f[K + c] = max + (long)map.size() * (long)map.size();
                        c++;
                        continue outside;
                    }
                }
            }
        }
        max = f[K - 1];
        for (int i = K; i < N; i++) {
            max = f[i] > max ? f[i] : max;
        }
        System.out.println(max);
        sc.close();
    }
}
class Susi implements Comparable<Susi> {
    int t;
    long d;
    long priority;
    Susi(int t, long d) {
        this.t = t;
        this.d = d;
        priority = d;
    }
    @Override
    public int compareTo(Susi other) {
        return Long.compare(priority, other.priority);
    }
    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + t;
        result = prime * result + (int)(d ^ (d >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Susi other = (Susi)obj;
        return t == other.t && d == other.d;
    }
}
