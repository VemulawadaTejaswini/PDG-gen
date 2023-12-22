import java.io.*;
import java.io.IOException;
import java.util.*;

@SuppressWarnings({"rawtypes", "unchecked"})
class Main {
    final static int INF = 1 << 28;
    final static long LNF = 1L << 59;

    public static void main(String[] args) throws Exception {
        final MyScanner sc = new MyScanner();
        long N;
        N = sc.nextLong();
        long M;
        M = sc.nextLong();
        int[] a = new int[(int)(M)];
        int[] b = new int[(int)(M)];
        long[] c = new long[(int)(M)];
        for(int i = 0 ; i < M ; i++){
                a[i] = sc.nextInt()-1;
                b[i] = sc.nextInt()-1;
                c[i] = -sc.nextLong();
        }
        solve(N, M, a, b, c);
    }

    static void solve(long N, long M, int[] a, int[] b, long[] c){
        BellmanFord bf = new BellmanFord(N);
        bf.addEdges(a, b, c);
        long[] distmap = bf.bellmanFord(0);
        if(distmap[(int)N-1] < -LNF / 2) System.out.println("inf");
        else System.out.println(-distmap[(int)N-1]);
    }

    static public class BellmanFord{
        private Node[] nodes;
    
        public BellmanFord(long N) {
            this.nodes = new Node[(int)N];
            for (int i = 0; i < N; i++) {
                nodes[i] = new Node(i);
            }
        }
        
        public long[] bellmanFord(int from) {
            for (Node node : this.nodes) {
                node.dist = LNF;
            }
            this.nodes[from].dist = 0;
            boolean[] negative = new boolean[this.nodes.length];
            Arrays.fill(negative, false);

            for (int i = 0; i < this.nodes.length; i++) {
                for (Node node: this.nodes) {
                    // if(node.dist > LNF / 2) continue;
                    for (Pair<Node, Long> p: node.connectedNodes) {
                        if(p.first.dist > node.dist + p.second) {
                            // N-1 times should be enough if there is no negative cycle.
                            if(i != this.nodes.length - 1) p.first.dist = node.dist + p.second;
                            else negative[p.first.index] = true;
                        }
                    }
                }
            }

            for (int i = 0; i < this.nodes.length; i++) {
                if(negative[i]) this.nodes[i].dist = -LNF;
            }

            long[] distmap = new long[this.nodes.length];
            for (int i = 0; i < distmap.length; i++) {
                distmap[i] = this.nodes[i].dist;
            }
            return distmap;
        }
    
        public void addEdges(int[] from, int[] to) {
            long[] w = new long[from.length]; 
            Arrays.fill(w, 1);
            this.addEdges(from, to, w);
        }
    
        public void addEdges(int[] from, int[] to, long[] w) {
            for (int i = 0; i < from.length; i++) {
                this.nodes[from[i]]
                .connectedNodes
                .add(new Pair<Node, Long>(this.nodes[to[i]], w[i]));
            }
        }
    
        private class Node {
            ArrayList<Pair<Node, Long>> connectedNodes = new ArrayList<>();
            int index;
            long dist = LNF;
            Node(int index){
                this.index = index;
            }
        }
    
        private class Pair<F,S> {
            F first;
            S second;
            Pair(F first, S second) {
                this.first = first;
                this.second = second;
            }
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
