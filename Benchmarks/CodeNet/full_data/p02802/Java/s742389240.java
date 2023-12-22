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
  
    void solve() throws IOException {
        int n=ni(),m=ni();
        int corr=0;
        int wrong=0;
        int[]A=new int[n+1];
        boolean[]B=new boolean[n+1];
        
        for (int x=0;x<m;x++) {
            int v=ni();
            if (next().equals("AC")) {
                if (!B[v]) { corr++; B[v]=true; wrong+=A[v]; }
            }
            else {
                if (!B[v]) A[v]++;
            }
        }
        
        System.out.println(corr+" "+wrong);
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}