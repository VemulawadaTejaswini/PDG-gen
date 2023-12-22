import java.util.*;
import java.io.*;
 
public class Main {
    static ArrayList<ArrayList<Point>> map;
    static long[] dist;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        map = new ArrayList<ArrayList<Point>>();
        for(int i = 0; i < n; i++){
            map.add(new ArrayList<Point>());
        }
        for(int i = 0; i < n-1; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            int c = sc.nextInt();
            map.get(a).add(new Point(b,c));
            map.get(b).add(new Point(a,c));
        }
        int q = sc.nextInt();
        int s = sc.nextInt()-1;
        dist = new long[n];
        Arrays.fill(dist,Long.MAX_VALUE);
        dist[s] = 0;
        boolean[] arr = new boolean[n];
        arr[s] = true;
        dfs(s,0,arr);
        for(int i = 0; i < q; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            pw.println(dist[a] + dist[b]);
        }
        pw.flush();
    }
    
    public static void dfs(int s, long dd, boolean[] a){
        for(Point p : map.get(s)){
            if(!a[p.x]){
                dist[p.x] = dd+p.d;
                a[p.x] = true;
                dfs(p.x,dd+p.d,a);
                a[p.x] = false;
            }
        }
        return;
    }
    
}

class Point{
    int x;
    long d;
    public Point(int x, long d){
        this.x = x;
        this.d = d;
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}
