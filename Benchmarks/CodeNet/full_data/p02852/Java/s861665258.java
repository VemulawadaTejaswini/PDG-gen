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
        String s=next();
        int[]A=new int[n+1];
        for (int x=0;x<=n;x++) {
            if (s.charAt(x)=='1') A[x]=1;
        }
        
        int c=0;
        int[] B=new int[n+10];
        int p=n;
        boolean f=false;
        
        outer:
        while (true) {
            int newp=p-m;
            if (newp<=0) { B[c]=p; break; }
            while (A[newp]==1) {
                newp++;
                if (newp==p) { f=true; break outer; }
            }
            B[c]=p-newp;
            c++;
            p=newp;
        }
        
        if (f) out.println("-1");
        else {
            for (int x=c;x>=0;x--) out.print(B[x]+" ");
            out.println();
        }
        out.flush();
    }
    
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}