import java.util.*;
import java.io.*;
 
public class Main {
    static ArrayList<ArrayList<Integer>> map;
    static int n;
    static int[] distT,distA;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        n = sc.nextInt();
        int t = sc.nextInt()-1;
        int a = sc.nextInt()-1;
        map = new ArrayList<>();
        for(int i = 0; i < n; i++){
            map.add(new ArrayList<Integer>());
        }
        distT = new int[n];
        distA = new int[n];
        for(int i = 0; i < n-1; i++){
            int v = sc.nextInt()-1;
            int w = sc.nextInt()-1;
            map.get(v).add(w);
            map.get(w).add(v);
        }
        boolean[] arrived = new boolean[n]; 
        dfs(t,0,arrived,true);
        Arrays.fill(arrived,false);
        dfs(a,0,arrived,false);
        int ans = 0;
        int even = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(distT[i] > distA[i]){
                continue;
            }else if(distT[i] == distA[i]){
                even = Math.min(even,distT[i]);
            }else{
                //System.out.println(i + " " + distA[i] + " " + distT[i]);
                ans = Math.max(ans,(distT[i]+distA[i])/2);
            }
            
        }
        System.out.println(even != Integer.MAX_VALUE ? Math.max(ans,even) : ans);
    }
    
    public static void dfs(int now, int dist, boolean[] arrived, boolean isT){
        arrived[now] = true;
        if(isT){
            distT[now] = dist;
        }else{
            distA[now] = dist;
        }
        for(int next : map.get(now)){
            if(!arrived[next]){
                dfs(next,dist+1,arrived,isT);
            }
        }
        arrived[now] = false;
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
    
    public String[] nextArray(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = next();
        return a;
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
