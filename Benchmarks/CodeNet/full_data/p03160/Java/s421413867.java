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
  
    static long m=998244353;
  
    void solve() throws IOException {
        int n=ni();
        int[]A=new int[n];
        long[]B=new long[n];
        A[0]=ni();
        A[1]=ni();
        B[1]=Math.abs(A[0]-A[1]);
        for (int x=2;x<n;x++) {
            A[x]=ni();
            B[x]=Math.min(B[x-2]+Math.abs(A[x]-A[x-2]), B[x-1]+Math.abs(A[x]-A[x-1]));
        }
        System.out.println(B[n-1]);
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}