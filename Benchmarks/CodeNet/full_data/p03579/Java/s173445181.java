import java.io.*;
import java.io.IOException;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

class Main {
    final static int INF = 1 << 28;
    final static long LNF = 1L << 60;
    final static double EPS = 1e-9;
    final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;

    static final long MOD = 1_000_000_007;

    public static void main(String[] args) throws Exception {
        final MyScanner sc = new MyScanner();
        long N;
        N = sc.nextLong();
        long M;
        M = sc.nextLong();
        long[] A = new long[(int)(M)];
        long[] B = new long[(int)(M)];
        for(int i = 0 ; i < M ; i++){
                A[i] = sc.nextLong()-1;
                B[i] = sc.nextLong()-1;
        }
        solve(N, M, A, B);
    }

    static void solve(long N, long M, long[] A, long[] B){
        int n = (int)N;                        
        int m = (int)M;
        int[] a = Arrays.stream(A).mapToInt(i->(int)i).toArray();
        int[] b = Arrays.stream(B).mapToInt(i->(int)i).toArray();

        Graph g = new Graph(n);
        for (int i = 0; i < m; i++) {
            g.nodes[a[i]].connectedNodes.add(g.nodes[b[i]]);
            g.nodes[b[i]].connectedNodes.add(g.nodes[a[i]]);
        }

        if(!g.is_bipartite()) System.out.println(M * (M-1) / 2 - M);
        else {
            int right = 0;
            int left = 0;
            for (Node ni : g.nodes) {
                if(ni.color == 0) right++;
                else left++;
            }
            System.out.println(right * left - M);
        }

    }

    static class Node {
        public ArrayList<Node> connectedNodes = new ArrayList<>();
        public int color = -1;
    }

    static class Graph {
        public Node[] nodes;

        public Graph(int N) {
            nodes = new Node[N];
            for (int i = 0; i < N; i++) {
                nodes[i] = new Node();
            }
        }

        public boolean is_bipartite(){
            final class dfs {
                // color = -1, 0, 1
                boolean color(Node n, int color) {
                    if(n.color == color) return true;
                    if(n.color == 1 - color) return false;
                    n.color = color;

                    for (Node ni: n.connectedNodes) {
                        if(!color(ni, 1 - color)) return false;
                    }
                    return true;
                }
            }
            return new dfs().color(nodes[0], 0);
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
