import java.io.*;
import java.util.*;
import java.math.BigInteger;

class Main{

    void solve(){
        H = ni();
        W = ni();
        grid = new int[H][W];
        for (int i = 0; i < H; i++) {
            String s = ns();
            for (int j = 0; j < W; j++) {
                if(s.charAt(j)=='#') grid[i][j] = 1;
            }
        }
        visited = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if(visited[i][j] == 0){
                    ArrayList<Integer> conn = new ArrayList<>();
                    conn.add(0);
                    conn.add(0);
                    dfs(i,j,conn);
                    conns.add(conn);
                }
            }
        }
        long ans = 0;
        for (ArrayList<Integer> conn : conns) {
            ans += conn.get(0) * conn.get(1);
        }
        out.println(ans);
        out.flush();
    } 
    void dfs(int i, int j, ArrayList<Integer>conn){
        // System.out.print(i);
        // System.out.print(j);
        // System.out.println(conn.toString());
        visited[i][j] = 1;
        if(grid[i][j] == 0) conn.set(0,conn.get(0)+1);
        else conn.set(1,conn.get(1)+1);
        if(i>0 && grid[i][j] + grid[i-1][j]==1 && visited[i][j]==0) dfs(i,j,conn);
        if(i<H-1 && grid[i][j] + grid[i+1][j]==1 && visited[i+1][j]==0) dfs(i+1,j,conn);
        if(j>0 && grid[i][j] + grid[i][j-1]==1 && visited[i][j-1]==0) dfs(i,j-1,conn);
        if(j<W-1 && grid[i][j] + grid[i][j+1]==1 && visited[i][j+1]==0) dfs(i,j+1,conn);
    }
    ArrayList<ArrayList<Integer>> conns = new ArrayList<>();
    int[][] visited ;
    int H;
    int W;
    int[][] grid;
    public static void main(String[] args){
        Main m = new Main();
        m.solve();
    }

    Main(){
        this.scan = new FastScanner();
        this.out = new PrintWriter(System.out);
    }

    private FastScanner scan;
    private PrintWriter out;
    private final int MOD = 1_000_000_007;
    private final int INF = 2_147_483_647;
    private final long LINF = 9223372036854775807L;

    // Scanner
    int ni(){ return scan.nextInt();}
    int[] ni(int n){int[] a = new int[n]; for(int i = 0; i < n; i++){a[i] = ni();} return a;}
    int[][] ni(int y, int x){int[][] a = new int[y][x];
        for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = ni();}} return a;}
    long nl(){return scan.nextLong();}
    long[] nl(int n){long[] a = new long[n]; for(int i = 0; i < n; i++){a[i] = nl();} return a;}
    long[][] nl(int y, int x){long[][] a = new long[y][x];
        for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = nl();}} return a;}
    String ns(){return scan.next();}
    String[] ns(int n){String[] a = new String[n]; for(int i = 0; i < n; i++){a[i] = ns();} return a;}
    String[][] ns(int y, int x){String[][] a = new String[y][x];
        for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = ns();}} return a;}
}
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}
