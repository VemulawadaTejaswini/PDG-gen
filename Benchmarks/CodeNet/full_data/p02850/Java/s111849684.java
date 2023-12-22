import java.util.*;
import java.io.*;
 
public class Main {
    static ArrayList<ArrayList<Integer>> to = new ArrayList<>();
    static int[] ans;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int cnt = 0;
        ans = new int[n];
        for(int i = 0; i < n; i++){
            to.add(new ArrayList<>());
        }
        for(int i = 0; i < n-1; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            a--;b--;
            to.get(a).add(b);
            to.get(b).add(a);
        }
        for(ArrayList<Integer> li : to){
            cnt = Math.max(cnt,li.size());
        }
        System.out.println(cnt);
        ArrayDeque<Integer> q = new ArrayDeque<Integer>();
        ans[0] = 1;
        q.addLast(1);
        dfs(0,-1,cnt,q);
        for(int a : ans){
            System.out.println(a);
        }
    }
    
    public static void dfs(int v, int p, int max, ArrayDeque<Integer> q){
        for(int u : to.get(v)){
            if(u == p) continue;
            ArrayDeque<Integer> q2 = q.clone();
            int pp = q2.pollFirst();
            for(int i = 1; i <= max; i++){
                if(i == pp || q.contains(i)){
                    continue;
                }else{
                    ans[u] = i;
                    q2.addLast(i);
                    dfs(u, v, max, q2);
                }
            }
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
