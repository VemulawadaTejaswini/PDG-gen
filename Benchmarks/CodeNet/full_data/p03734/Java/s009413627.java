import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static String line;
    public static StringTokenizer st;
    public static ArrayList<ArrayList<Integer>> adjList;
    public static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1};
    public static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1};
    public static int INF = 0x3f3f3f3f;
    public static long LINF = 0x3f3f3f3f3f3f3f3fL;
    public static int MOD = 1000000007;

    public static TreeMap<Pair, Integer> memo;
    public static int[] w, v;

    public static int solve(int item, int W){
        if(item >= w.length) return 0;
        Pair p = new Pair(item, W);
        if(memo.containsKey(p)) return memo.get(p);

        int best = solve(item+1, W);
        if(W >= w[item]){
            best = Math.max(best, solve(item+1, W-w[item]) + v[item]);
        }
        memo.put(p, best);
        return best;
    }

    public static void main(String[] args) throws Exception{
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        w = new int[N];
        v = new int[N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }

        memo = new TreeMap<Pair, Integer>();
        pw.print(solve(0, W) + "\n");

        pw.close(); 
        br.close();
    }
}

class Pair implements Comparable<Pair>{
    public int x, y;

    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int compareTo(Pair p){
        if(x != p.x) return x < p.x ? -1 : 1;
        else if(y != p.y) return y < p.y ? -1 : 1;
        return 0;
    }
}