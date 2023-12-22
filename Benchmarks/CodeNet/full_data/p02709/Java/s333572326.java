import java.util.*;
import java.io.*;
public class Main {
    int N;
    Pair[] ps;
    HashMap<String, Long> DP = new HashMap<>();
    public long opt(int l, int i) {
        int r = N - i + l - 1;
        if(i == N) return 0;
        String T = "" + l + ";" + i;
        if(DP.containsKey(T)) {
            return DP.get(T);
        }
        long v1 = Math.abs(ps[i].idx - l)*ps[i].value + opt(l+1, i+1);
        long v2 = Math.abs(ps[i].idx - r)*ps[i].value + opt(l, i+1);
        DP.put(T, Math.max(v1, v2));
        return Math.max(v1, v2);
    }
    class Pair implements Comparable<Pair> {
        int idx;
        long value;
        public Pair(int idx, long value) {
            this.idx=idx;this.value=value;
        }
        public int compareTo(Pair p){
            return -Long.compare(value, p.value);
        }
    }
    void solve(BufferedReader in) throws Exception {
        N = toInt(in.readLine());
        int[] A = toInts(in.readLine());
        ps = new Pair[N];
        for(int i = 0; i<N; i++) {
            ps[i] = new Pair(i, A[i]);
        }
        Arrays.sort(ps);
        System.out.println(opt(0, 0));
    }
    int toInt(String s) {return Integer.parseInt(s);}
    int[] toInts(String s) {
        String[] a = s.split(" ");
        int[] o = new int[a.length];
        for(int i = 0; i<a.length; i++) o[i] = toInt(a[i]);
        return o;
    }
    void e(Object o) {
        System.err.println(o);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        (new Main()).solve(in);
    }
}
