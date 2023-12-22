import java.io.*;
import java.util.*;

public class Main {

    
    public void solve() throws IOException {
      int n = nextInt();
      int a[] = new int[n];
      for (int i = 0 ; i < n ; i++) {
        a[i] = nextInt()-1;
      }
      int res = 0;
      for (int i = 0 ; i < n ; i++) {
        if (a[a[i]] == i) {
          res ++;
        }
      }
      out.println(res/2);
    }

    

    
    
    BufferedReader bf;
    StringTokenizer st;
    PrintWriter out;
    
    public String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) 
            st = new StringTokenizer(bf.readLine());
        return st.nextToken();
    }
    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    
    public long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public Main() throws IOException {
        bf = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));      
        solve();
        bf.close();
        out.close();
    }
    
    public static void main(String args[]) throws IOException {
        new Main();
    }
}