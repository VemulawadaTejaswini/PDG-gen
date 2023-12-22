import java.util.*;
import java.io.*;
 
public class Main {
    static HashMap<Integer,ArrayList<Integer>> to = new HashMap<Integer,ArrayList<Integer>>();
    static int[] ans;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        ans = new int[n];
        boolean[] wasCreated = new boolean[n];
        for(int i = 0; i < n-1; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            if(wasCreated[a]){
                to.get(a).add(b);
            }else{
                ArrayList<Integer> arr = new ArrayList<Integer>();
                arr.add(b);
                to.put(a,arr);
                wasCreated[a] = true;
            }
            if(wasCreated[b]){
                to.get(b).add(a);
            }else{
                ArrayList<Integer> arr = new ArrayList<Integer>();
                arr.add(a);
                to.put(b,arr);
                wasCreated[b] = true;
            }
        }
        for(int i = 0; i < q; i++){
            int p = sc.nextInt()-1;
            int x = sc.nextInt();
            ans[p] += x;
        }
        dfs(0,-1);
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    }
    
    public static void dfs(int v, int p){
        for(int u : to.get(v)){
            if(u == p) continue;
            ans[u] += ans[v];
            dfs(u,v);
        }
    }
    
    static class FastScanner {
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
}
