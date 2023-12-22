import java.util.*;
import java.io.*;
 
public class Main {
    static ArrayList<ArrayList<Integer>> map;
    static int[] distT,distA;
    static boolean[] visited;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int takahashi = sc.nextInt()-1;
        int aoki = sc.nextInt()-1;
        map = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++){
            map.add(new ArrayList<>());
        }
        for(int i = 0; i < n-1; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            map.get(a).add(b);
            map.get(b).add(a);
        }
        distT = new int[n];
        visited = new boolean[n];
        visited[takahashi] = true;
        dfs(takahashi,0,true);
        distA = new int[n];
        visited = new boolean[n];
        visited[aoki] = true;
        dfs(aoki,0,false);
        int ans = -1;
        for(int i = 0; i < n; i++){
            if(distT[i] < distA[i]){
                ans = Math.max(ans,((distT[i]+distA[i])/2));
            }
        }
        pw.println(ans);
        pw.flush();
    }
    
    private static void dfs(int now, int dist ,boolean isT){
        if(isT){
            distT[now] = dist;
        }else{
            distA[now] = dist;
        }
        for(int next : map.get(now)){
            if(!visited[next]){
                visited[next] = true;
                dfs(next,dist+1,isT);
            }
        }
        return;
    }

    static class GeekInteger {
        public static void save_sort(int[] array) {
            shuffle(array);
            Arrays.sort(array);
        }
 
        public static int[] shuffle(int[] array) {
            int n = array.length;
            Random random = new Random();
            for (int i = 0, j; i < n; i++) {
                j = i + random.nextInt(n - i);
                int randomElement = array[j];
                array[j] = array[i];
                array[i] = randomElement;
            }
            return array;
        }
 
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
