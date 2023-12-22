import java.util.*;
import java.io.*;
 
public class Main {
    static long[] dist;
    static ArrayList<HashMap<Integer,Long>> root;
    static boolean[] arrived;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        root = new ArrayList<>();
        for(int i = 0; i < n; i++){
            root.add(new HashMap<Integer,Long>());
        }
        for(int i = 0; i < n-1; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            long c = sc.nextLong();
            root.get(a).put(b,c);
            root.get(b).put(a,c);
        }
        int q = sc.nextInt();
        int k = sc.nextInt()-1;
        arrived = new boolean[n];
        dist = new long[n];
        dfs(k,0L);
        for(int i = 0; i < q; i++){
            System.out.println(dist[sc.nextInt()-1] + dist[sc.nextInt()-1]);
        }
    }
    
    public static void dfs(int now, long d){
        arrived[now] = true;
        dist[now] = d;
        for(Map.Entry<Integer,Long> e : root.get(now).entrySet()){
            int k = e.getKey();
            long v = e.getValue();
            if(!arrived[k]){
                dfs(k,d+v);
            }
        }
        return;
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }
    
    public void close() throws Exception{
        this.reader.close();
        return;
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