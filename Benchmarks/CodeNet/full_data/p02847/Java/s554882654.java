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
        String s=next();
        int ans=0;
        if (s.equals("SAT")) ans=1;
        if (s.equals("FRI")) ans=2;
        if (s.equals("THU")) ans=3;
        if (s.equals("WED")) ans=4;
        if (s.equals("TUE")) ans=5;
        if (s.equals("MON")) ans=6;
        if (s.equals("SUN")) ans=7;
        System.out.println(ans);
    }
    
    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}