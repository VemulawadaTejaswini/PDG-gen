import java.io.*;
import java.io.IOException;
import java.util.*;

@SuppressWarnings({"rawtypes", "unchecked"})
class Main {
    final static int INF = 1 << 28;
    final static long LNF = 1L << 60;
    final static double EPS = 1e-9;
    final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;

    static final long MOD = 1_000_000_007;
    static int H;
    static int W;

    public static void main(String[] args) throws Exception {
        final MyScanner sc = new MyScanner();
        // Failed to predict input format
        H = sc.nextInt();
        W = sc.nextInt();

        ArrayList<Integer> from = new ArrayList<>();
        ArrayList<Integer> to = new ArrayList<>();

        char[][] map = new char[H+2][W+2];
        for (char[] cs : map) {
            Arrays.fill(cs, '#');
        }

        for (int j = 1; j <= H; j++) {
            String masu = sc.next();
            for (int i = 1; i <= W; i++) {
                map[j][i] = masu.charAt(i-1);
            }
        }

        for (int j = 1; j <= H; j++) {
            for (int i = 1; i <= W; i++) {
                if(map[j][i] == '#') continue;

                if(map[j][i+1] == '.'){
                    from.add(chnum(j, i));
                    to.add(chnum(j, i+1));
                };
                if(map[j+1][i] == '.'){
                    from.add(chnum(j, i));
                    to.add(chnum(j+1, i));
                };
            }
        }

        Dijkstra dk = new Dijkstra((long)(H*W));

        int[] froma = from.stream().mapToInt(i -> i).toArray();
        int[] toa = to.stream().mapToInt(i -> i).toArray();

        dk.addEdges(froma, toa);
        dk.addEdges(toa, froma);

        long ans = 0;
        for (int j = 1; j <= H; j++) {
            for (int i = 1; i <= W; i++) {
                if(map[j][i] == '#') continue;
                long[] dm = dk.dijekstra(chnum(j, i));
                for (long l : dm) {
                    if(l > INF / 2) continue;
                    ans = Math.max(ans, l);
                }

            }
        }

        System.out.println(ans);

    }

    static int chnum(int j, int i) {
        return (j-1)*W + (i-1);
    }

    static public class Dijkstra {
        final static int INF = 1 << 28;
        private Node[] nodes;
    
        public Dijkstra(long N) {
            this.nodes = new Node[(int)N];
            for (int i = 0; i < N; i++) {
                nodes[i] = new Node(i);
            }
        }
        
        public long[] dijekstra(int from) {
            for (Node node : nodes) {
                node.fixed = false;
            }
    
            long[] distmap = new long[this.nodes.length];
            Arrays.fill(distmap, INF);
    
            PriorityQueue<Pair<Node, Long>> Q = new PriorityQueue<>((Pair<Node, Long> p1, Pair<Node, Long> p2) -> Long.compare(p1.second, p2.second));
            Q.add(new Pair<Node, Long>(this.nodes[from], (long)0));
    
            while(!Q.isEmpty()) {
                Pair<Node, Long> p = Q.poll();
                if(p.first.fixed) continue;
                distmap[p.first.index] = p.second;
                p.first.fixed = true;
    
                for (Pair<Node, Long> edge: p.first.connectedNodes) {
                    Q.add(new Pair<Node, Long>(edge.first, edge.second + p.second));
                }
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
            boolean fixed = false;
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
            return nn();
        }

        String nextLine() {
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
