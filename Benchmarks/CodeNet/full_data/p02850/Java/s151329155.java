import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[][] used;
    static int[] ans;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        for(int i = 0; i < n; i++){
            nodes[i] = new Node();
        }
        int[] cnts = new int[n];
        Edge[] edges = new Edge[n-1];
        for(int i = 0; i < n-1; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            a--;b--;
            Edge e = new Edge(a,b);
            edges[i] = e;
            nodes[a].edges.add(e);
            nodes[b].edges.add(e);
        }
        int cnt = dfs(nodes, 0, -1, 0);
        System.out.println(cnt);
        for(int i = 0; i < n-1; i++){
            System.out.println(edges[i].color);
        }
    }
    
    private static int dfs(Node[] nodes, int node, int from, int color) {
        int c = 1;
        int max = color;
        for (Edge e : nodes[node].edges) {
            int to = e.p1 != node ? e.p1 : e.p2;
            if (to != from) {
                if (c == color) c++;
                e.color = c;
                max = Math.max(max, dfs(nodes, to, node, c));
                c++;
            }
        }
        return max;
    }
    
}

class Node{
    ArrayList<Edge> edges = new ArrayList<>();
}
class Edge{
    int p1,p2;
    int color = -1;
    public Edge(int p1, int p2){
        this.p1 = p1;
        this.p2 = p2;
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


