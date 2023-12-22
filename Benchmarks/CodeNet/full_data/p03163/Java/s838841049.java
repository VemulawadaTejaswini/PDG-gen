import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	PrintWriter out = new PrintWriter(System.out);
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tok = new StringTokenizer("");
    String next() throws IOException {
        if (!tok.hasMoreTokens()) { tok = new StringTokenizer(in.readLine()); }
        return tok.nextToken();
    }
    int ni() throws IOException { return Integer.parseInt(next()); }
    long nl() throws IOException { return Long.parseLong(next()); }
  
    static int[]w;
    static int[]v;
    static long[][]d;
    
    void solve() throws IOException {
        int n=ni(),W=ni();
        w=new int[n+1];
        v=new int[n+1];
        d=new long[W+1][n+1];
        for (int x=1;x<=n;x++) {w[x]=ni(); v[x]=ni(); for (int y=1;y<=W;y++) d[y][x]=-1;}
        System.out.println(solve(n,W));
    }
    
    long solve(int n, int W) {
        if (n==0 || W<1) return 0;
        if (d[W][n]==-1) {
            if (w[n]>W) d[W][n]=solve(n-1,W);
            else d[W][n]=Math.max(solve(n-1,W),solve(n-1,W-w[n])+v[n]);
        }
        return d[W][n];
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}