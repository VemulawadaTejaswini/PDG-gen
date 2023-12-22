import java.io.*;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

class Main {
    final static int INF = 1 << 28;
    final static long LNF = 1L << 60;
    final static double EPS = 1e-9;
    final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;

    static final long MOD = 1_000_000_007;

    public static void main(String[] args) throws Exception {
        final MyScanner sc = new MyScanner();
        int N;
        N = sc.nextInt();
        int[] u = new int[N-1];
        int[] v = new int[N-1];
        int[] w = new int[N-1];
        for(int i = 0 ; i < N-1 ; i++){
                u[i] = sc.nextInt()-1;
                v[i] = sc.nextInt()-1;
                w[i] = sc.nextInt();
        }
        solve(N, u, v, w);
    }

    static void solve(int N, int[] u, int[] v, int[] w){
        Node[] nodes = new Node[N];
        for (int i = 0; i < N; i++) {
            nodes[i] = new Node();
        }

        for (int i = 0; i < N-1; i++) {
            nodes[u[i]].children.add(new Pair<Node, Integer>(nodes[v[i]], w[i]));
            nodes[v[i]].children.add(new Pair<Node, Integer>(nodes[u[i]], w[i]));
        }

        dfs(nodes[0], 0);

        for (Node n : nodes) {
           System.out.println(n.color); 
        }
    }

    static void dfs(Node n, int color) {
        n.color = color;
        for (Pair<Node, Integer> p : n.children) {
            if (p.first.color != -1)
                continue;
            else {
                if(p.second % 2 == 1) dfs(p.first, 1 - color);
                else dfs(p.first, color);
            }
        }
    }

    static class Node implements Comparable<Node> {
        public ArrayList<Pair<Node, Integer>> children = new ArrayList<>();
        public int color = -1;

        @Override
        public int compareTo(Node n){return 0;};
    }
    
    static public class Pair<S extends Comparable<S>, T extends Comparable<T>> implements Comparable<Pair<S,T>> {
        public S first;
        public T second;
    
        public Pair(S first, T second){
            this.first = first;
            this.second = second;
        }
    
        @Override
        public int compareTo(Pair<S,T> pair){
            int result = this.first.compareTo(pair.first);
            if(result != 0) return result;
            else return this.second.compareTo(pair.second);
        }
    }


    static class MyScanner {
 
        BufferedReader br;
        StringTokenizer st;
 
        MyScanner(FileReader fileReader) {
            br = new BufferedReader(fileReader);
        }
 
        MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String nn() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        String next() {
            String ans = "";
            try {
                ans = br.readLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return ans;
        }
 
        char nextChar() {
            return nn().charAt(0);
        }
 
        int nextInt() {
            return Integer.parseInt(nn());
        }
 
        long nextLong() {
            return Long.parseLong(nn());
        }
 
        double nextDouble() {
            return Double.parseDouble(nn());
        }
 
        Integer[] niArr0(int n) {
            Integer[] ar = new Integer[n];
            for (int i = 0; i < n; i++) {
                ar[i] = nextInt();
            }
            return ar;
        }
 
        Integer[] niArr1(int n) {
            Integer[] ar = new Integer[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = nextInt();
            }
            return ar;
        }
 
        Long[] nlArr0(int n) {
            Long[] ar = new Long[n];
            for (int i = 0; i < n; i++) {
                ar[i] = nextLong();
            }
            return ar;
        }
 
        Long[] nlArr1(int n) {
            Long[] ar = new Long[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = nextLong();
            }
            return ar;
        }
    }

}
