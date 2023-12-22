import java.io.*;
import java.util.*;
import java.math.*;
 
class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static String line;
    public static StringTokenizer st, st2;
    public static ArrayList<ArrayList<Integer>> adjList;
    public static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1, 0};
    public static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1, 0};
    public static int INF = 0x3f3f3f3f;
    public static int MOD = 1000000007;
    public static long LINF = 0x3f3f3f3f3f3f3f3fL;

    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(br.readLine());
        TreeMap<Integer, TreeSet<Integer>> d = new TreeMap<Integer, TreeSet<Integer>>();
        ArrayList<Pair> A = new ArrayList<Pair>();

        ArrayList<Integer> a2 = new ArrayList<Integer>();
        ArrayList<Integer> b2 = new ArrayList<Integer>();

        st = new StringTokenizer(br.readLine());
        st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            if (!d.containsKey(a)) {
                d.put(a, new TreeSet<Integer>());
            }
            A.add(new Pair(a, b));
            a2.add(a);
            b2.add(b);
        }

        Collections.sort(A);
        Collections.sort(a2);
        Collections.sort(b2);

        for (int i = 0; i < N; i++) {
            d.get(A.get(i).a).add(i);
            if (a2.get(i) > b2.get(i)) {
                N = -1;
            }
        }

        boolean f = false;
        for (int i = 0; i < N-1; i++) {
            // System.out.println(d);
            Pair p = A.get(i);
            if (p.a <= p.b) {
                f = true;
                break;
            }
            int fn = d.firstKey();
            if (fn > p.b) {
                break;
            }
            if (d.get(fn).size() >= 2) {
                f = true;
                break;
            }
            int toSwap = d.get(fn).first();
            d.remove(fn);
            if (d.firstKey() <= p.b) {
                f = true;
                break;
            }
            A.get(toSwap).a = p.a;
            d.get(p.a).remove(i);
            d.get(p.a).add(toSwap);
        }

        pw.println(f ? "Yes" : "No");

        pw.close();
        br.close();
    }
}

class Pair implements Comparable<Pair>{
    public int a, b;

    Pair(int _a, int _b){
        a = _a;
        b = _b;
    }
 
    public String toString(){
        return a + " " + b;
    }

    public int compareTo(Pair p){
        if (b != p.b) return b < p.b ? -1 : 1;
        if (a != p.a) return a < p.a ? -1 : 1;
        return 0;
    }
}