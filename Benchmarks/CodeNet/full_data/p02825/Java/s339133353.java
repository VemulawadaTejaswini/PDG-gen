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
        int n=ni();
        if (n%3>0) {
            System.out.println("-1");
            return;
        }
        
        int y=0;
        int z=n-3;
        for (int x=0;x<n/3;x++) {
            for (int p=0;p<3;p++) {
                for (int q=0;q<y;q++) out.print(".");
                if (p==0) out.print("aa.");
                else out.print("..a");
                for (int q=0;q<z;q++) out.print(".");
                out.println();
            }
            y+=3;
            z-=3;
        }
        out.flush();
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}