import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    // static int mod = 1_000_000_007;
    int mod = 998244353;
    // long inf = Long.MAX_VALUE/2;
    int inf = Integer.MAX_VALUE/2;

    void solve(){
        int n = ni();
        int m = ni();
        int[][] r = new int[m][4];
        int lmin = n;
        int rmax = 0;
        for(int i = 0; i < m; i++){
            r[i][0] = ni();
            r[i][1] = ni();
            r[i][2] = ni();
            r[i][3] = i;
            lmin = Math.min(lmin, r[i][0]);
            rmax = Math.max(rmax, r[i][1]);
        }
        int[][] list = new int[2*m][4];
        for(int i = 0; i < m; i++){
            list[i*2][0] = r[i][0];
            list[i*2][1] = 0;
            list[i*2][2] = r[i][3];
            list[i*2][3] = r[i][2];
            list[i*2+1][0] = r[i][1];
            list[i*2+1][1] = 1;
            list[i*2+1][2] = r[i][3];
            list[i*2+1][3] = r[i][2];
        }
        Arrays.sort(list, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if(a[0] != b[0])return (a[0] - b[0]);
				return a[1] - b[1];
			}
		});
        if (lmin!=1 || rmax!=n) {
            out.println(-1);
            return;
        }
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        boolean[] seen = new boolean[m];
        Dijkstra dj = new Dijkstra(m+1);
        ArrayList<Integer> last_list = new ArrayList<>();
        for(int i = 0; i < 2*m; i++){
            if(list[i][1]==0){
                for(int j = 0; j < m; j++){
                    if(seen[j]){
                        dj.addDirectedEdge(j, list[i][2], list[j][3]);
                        dj.addDirectedEdge(list[i][2], j, list[j][3]);
                        // out.println(j+" "+list[i][2]+" "+list[j][3]);
                    }
                }
                seen[list[i][2]] = true;
            }
            else{
                seen[list[i][2]] = false;
                if (list[i][0]==n) {
                    last_list.add(list[i][2]);
                    dj.addDirectedEdge(m, list[i][2], list[i][3]);
                    dj.addDirectedEdge(list[i][2], m, list[i][3]);
                }
            }
        }
        long[] dist1 = dj.getDist(0);
        if (dist1[m]==Long.MAX_VALUE / 3){
            out.println(-1);
            return;
        }
        out.println(dist1[m]);
    }

    static class Dijkstra {
        int n;
        ArrayList<Pair>[] G;
        long INF = Long.MAX_VALUE / 3;

        public Dijkstra(int n) {
            this.n = n;
            G = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                G[i] = new ArrayList<>();
            }
        }

        public void addDirectedEdge(int from, int to, int cost) {
            G[from].add(new Pair(to, cost));
        }

        public long[] getDist(int s) {
            PriorityQueue<Pair> Q = new PriorityQueue<>();
            Q.add(new Pair(s, 0));
            long[] dist = new long[n];
            Arrays.fill(dist, INF);
            boolean[] used = new boolean[n];
            while (!Q.isEmpty()) {
                Pair p = Q.poll();
                if (used[p.x]) continue;
                used[p.x] = true;
                dist[p.x] = p.y;

                for (Pair edge : G[p.x]) {
                    Q.add(new Pair(edge.x, p.y + edge.y));
                }
            }
            return dist;
        }

        class Pair implements Comparable<Pair> {
            int x;
            long y;

            Pair(int x, long y) {
                this.x = x;
                this.y = y;
            }

            public int compareTo(Pair p) {
                return Long.compare(y, p.y);
            }

        }

    }

    void run() throws Exception
    {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);
        long s = System.currentTimeMillis();
        solve();
        out.flush();
        if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
    }
    
    public static void main(String[] args) throws Exception { new Main().run(); }
    
    private byte[] inbuf = new byte[1024];
    private int lenbuf = 0, ptrbuf = 0;
    
    private int readByte()
    {
        if(lenbuf == -1)throw new InputMismatchException();
        if(ptrbuf >= lenbuf){
            ptrbuf = 0;
            try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
            if(lenbuf <= 0)return -1;
        }
        return inbuf[ptrbuf++];
    }
    
    private boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
    private int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
    
    private double nd() { return Double.parseDouble(ns()); }
    private char nc() { return (char)skip(); }
    
    private String ns()
    {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!(isSpaceChar(b) && b != ' ')){
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    
    private char[] ns(int n)
    {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while(p < n && !(isSpaceChar(b))){
            buf[p++] = (char)b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }
    
    private char[][] nm(int n, int m)
    {
        char[][] map = new char[n][];
        for(int i = 0;i < n;i++)map[i] = ns(m);
        return map;
    }
    
    private int[] na(int n)
    {
        int[] a = new int[n];
        for(int i = 0;i < n;i++)a[i] = ni();
        return a;
    }
    
    private int ni()
    {
        int num = 0, b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        
        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    
    private long nl()
    {
        long num = 0;
        int b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        
        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    
    private static void tr(Object... o) { System.out.println(Arrays.deepToString(o)); }
 
}
