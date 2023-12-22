import java.io.*;
import java.util.*;
import java.math.*;
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
    //class  Declaration
 
static class pair implements Comparable < pair > {
    long x;
    long y;
    pair(long i, long j) {
        x = i;
        y = j;
    }
    public int compareTo(pair p) {
        if (this.x != p.x) {
            return Long.compare(this.x,p.x);
        } else {
            return Long.compare(this.y,p.y);
        }
    }
    public int hashCode() {
        return (x + " " + y).hashCode();
    }
    public String toString() {
        return x + " " + y;
    }
    public boolean equals(Object o) {
        pair x = (pair) o;
        return (x.x == this.x && x.y == this.y);
    }
}

static class Node implements Comparable <Node> {
    long time ;
    pair p ;
    
    Node(long time, pair p) {
        this.time = time;
        this.p = p;
    }
    public int compareTo(Node n) {
        
            return Long.compare(this.time,n.time);
        
    }

    public boolean equals(Object o) {
        Node n = (Node) o;
        return (this.time == n.time && (this.p.equals(n.p)));
    }
} 
// int[] dx = {0,0,1,-1};
// int[] dy = {1,-1,0,0};
// int[] ddx = {0,0,1,-1,1,-1,1,-1}; 
// int[] ddy = {1,-1,0,0,1,-1,-1,1};
 
final int inf = (int) 1e9 + 9;
final long biginf  = (long)1e18 + 7 ;
final long mod =  (long)1e9+7;  


void solve() throws Exception {
    int n=ni(),m=ni(); long s=ni();
    int[] to = new int[m]; int[] from = new int[m];
    long[] A = new long[m];
    long[] B = new long[m];

    long amax = -1;
    for(int i=0;i<m;++i){
        from[i] = ni() ; to[i] = ni(); A[i]=ni(); B[i]=ni();
        amax = Math.max(amax,A[i]);
    }
   
    int[][][] g = nwg(n,m,from,to,true);
   // dbg(g);

    long[] C = new long[n+1];
    long[] D = new long[n+1];
    for(int i=1;i<=n;++i){
        C[i]=ni(); D[i]=ni();
    }
    
    s = Math.min(s,amax*(n-1));
    long[][] dist = new long[n+1][(int)amax*(n-1) + 1];
    for(int i=0;i<dist.length;++i) Arrays.fill(dist[i],biginf);

    dist[1][(int)s] = 0;
    PriorityQueue<Node> pq= new PriorityQueue<>();
    pq.add(new Node(0,new pair(1,s)));
    while(pq.size() > 0){
            Node curr = pq.poll();
            long currTime = curr.time; 
            pair state = curr.p;
            if(currTime > dist[(int)state.x][(int)state.y]){
                continue ;
            }

          //  pn("curr node "+" time : "+curr.time+" : state "+curr.p);
            // go to adjacents if you have enough silver coins && you can go there in minimum time

            int silverCoins  = (int)curr.p.y ;
            int currVertex = (int)curr.p.x ;
            for(int[] adj : g[currVertex]){
                    if(silverCoins >=  A[adj[1]]  && (dist[adj[0]][silverCoins - (int)A[adj[1]]] > dist[currVertex][silverCoins] + B[adj[1]]) ){
                        dist[adj[0]][silverCoins - (int)A[adj[1]]] = dist[currVertex][silverCoins] + B[adj[1]] ;

                        long nxtTime=  dist[adj[0]][silverCoins - (int)A[adj[1]]];
                        pq.add(new Node(nxtTime,new pair(adj[0],silverCoins - (int)A[adj[1]] ) ));
                    } 
                    
                    //  just for safe side add new silver coins by spending some Di mins on gold to silver conversion center of this city
                    // again check : if you buy silver coins and spend some time but is there better way by someone else for this (node,silverCois)
                    // 1 more check do you need this much silver coins ? is it < = Amax*(n-1)
                    int moreSilverCoins = Math.min(silverCoins + (int)C[currVertex],(int)amax*(n-1));

                    if(dist[currVertex][moreSilverCoins] > dist[currVertex][silverCoins] + D[currVertex]){
                        dist[currVertex][moreSilverCoins] = dist[currVertex][silverCoins] + D[currVertex];
                        pq.add(new Node(dist[currVertex][moreSilverCoins],new pair(currVertex,moreSilverCoins)));
                    }
            }   


    }
  //  dbg(dist);
    for(int i=2;i<=n;++i){
        long ans = biginf;
        for(int j=0;j<dist[0].length;++j){
            ans = Math.min(ans,dist[i][j]);
        }
        pn(ans);
    }


}


long pow(long a, long b) {
    long result = 1;
    while (b > 0) {
        if (b % 2 == 1) result = (result * a) % mod;
        b /= 2;
        a = (a * a) % mod;
    }
    return result;
}
long gcd(long a, long b) {
    if (b == 0)
        return a;
    return gcd(b, a % b);
}
void run() throws Exception {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);
 
        long s = System.currentTimeMillis();
        solve();
        out.flush();
       // System.err.println(System.currentTimeMillis() - s + "ms");
}
public static void main(String[] args) throws Exception {
    new Main().run();
}
 
//output methods
private void dbg(Object... o){ System.err.println(Arrays.deepToString(o));}
void p(Object... o){for(Object oo:o)out.print(oo+" ");}
void pn(Object... o){for(int i = 0; i< o.length; i++)out.print(o[i]+(i+1 < o.length?" ":"\n"));}
void pni(Object... o){for(Object oo:o)out.print(oo+" ");out.println();out.flush();}
 
//input methods

private int[][] ng(int n, int e, int[] from, int[] to, boolean f){
    int[][] g = new int[n+1][];int[]cnt = new int[n+1];
    for(int i = 0; i< e; i++){
        cnt[from[i]]++;
        if(f)cnt[to[i]]++;
    }
    for(int i = 0; i<= n; i++)g[i] = new int[cnt[i]];
    for(int i = 0; i< e; i++){
        g[from[i]][--cnt[from[i]]] = to[i];
        if(f)g[to[i]][--cnt[to[i]]] = from[i];
    }
    return g;
}
private int[][][] nwg(int n, int e, int[] from, int[] to, boolean f){
    int[][][] g = new int[n+1][][];int[]cnt = new int[n+1];
    for(int i = 0; i< e; i++){
        cnt[from[i]]++;
        if(f)cnt[to[i]]++;
    }
    for(int i = 0; i<= n; i++)g[i] = new int[cnt[i]][];
    for(int i = 0; i< e; i++){
        g[from[i]][--cnt[from[i]]] = new int[]{to[i], i, 0};
        if(f) g[to[i]][--cnt[to[i]]] = new int[]{from[i], i, 1};
    }
    return g;
}


private byte[] inbuf = new byte[1024];
public int lenbuf = 0, ptrbuf = 0;
 
 
private int readByte() {
    if (lenbuf == -1) throw new InputMismatchException();
    if (ptrbuf >= lenbuf) {
        ptrbuf = 0;
        try {
            lenbuf = is.read(inbuf);
        } catch (IOException e) {
            throw new InputMismatchException();
        }
        if (lenbuf <= 0) return -1;
    }
    return inbuf[ptrbuf++];
}
private boolean isSpaceChar(int c) {
    return !(c >= 33 && c <= 126);
}
private int skip() {
    int b;
    while ((b = readByte()) != -1 && isSpaceChar(b));
    return b;
}
 
private double nd() {
    return Double.parseDouble(ns());
}
private char nc() {
    return (char) skip();
}
 
private String ns() {
    int b = skip();
    StringBuilder sb = new StringBuilder();
    while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
        sb.appendCodePoint(b);
        b = readByte();
    }
    return sb.toString();
}
 
private char[] ns(int n) {
    char[] buf = new char[n];
    int b = skip(), p = 0;
    while (p < n && !(isSpaceChar(b))) {
        buf[p++] = (char) b;
        b = readByte();
    }
    return n == p ? buf : Arrays.copyOf(buf, p);
}
 
private char[][] nm(int n, int m) {
    char[][] map = new char[n][];
    for (int i = 0; i < n; i++) map[i] = ns(m);
    return map;
}
 
private int[] na(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++) a[i] = ni();
    return a;
}
 
private int ni() {
    int num = 0, b;
    boolean minus = false;
    while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
    if (b == '-') {
        minus = true;
        b = readByte();
    }
 
    while (true) {
        if (b >= '0' && b <= '9') {
            num = num * 10 + (b - '0');
        } else {
            return minus ? -num : num;
        }
        b = readByte();
    }
}
 
private long nl() {
    long num = 0;
    int b;
    boolean minus = false;
    while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
    if (b == '-') {
        minus = true;
        b = readByte();
    }
 
    while (true) {
        if (b >= '0' && b <= '9') {
            num = num * 10 + (b - '0');
        } else {
            return minus ? -num : num;
        }
        b = readByte();
    }
}

}