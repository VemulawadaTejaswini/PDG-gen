
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) {
        Solver s = new Solver();
        s.solve();
    }
}

class Solver {
    Reader in = new Reader ();
    Writer out = new Writer ();
    final int mod = 1000000000 + 7;

    long same(int n) {
        long [] dp = new long [n + 1];
        long sum = 0;
        dp[1] = 0;
        for(int i = 2; i <= n; i++) {
            dp[i] = (i + sum) % mod;
            sum = (sum + dp[i - 1]) % mod;
        }
        return (1 + dp[n]) % mod;
    }
    void solve () {
        int n, m;
        n = in.nextInt();
        m = in.nextInt();
        char [] s = in.next().toCharArray();
        
        int cnt = 0;
        int min = m;
        for(int i = 0; i < m; i++) {
            if(i > 0 && s[i - 1] == s[i]) ++cnt;
            else {
                if(s[i] != s[0] && cnt % 2 == 1) {
                    min = Math.min(min, cnt);
                }
                cnt = 1;
            }
        }
        cnt = 0;
        for(int i = 0; i < m; i++) {
            if(s[i] == s[0]) ++cnt;
            else break;
        }
        if(cnt % 2 == 0) {
            min = Math.min(min, cnt + 1);
        }
        if(cnt == m) {
            System.out.println(same(n));
            System.exit(0);
        }

        long [] dp = new long [n + 1];
        dp[1] = 0;
        long [] sum = new long [2];
        sum[0] = sum[1] = 0;

        for(int i = 2; i <= n; i++) {
            if(i - 1 <= min) {
                dp[i] = i;
            }
            dp[i] = (dp[i] + sum[i % 2]) % mod;
            sum[i % 2] = (sum[i % 2] + dp[i]) % mod;
            if(i - 1 - min > 1) {
                sum[i % 2] = (sum[i % 2] - dp[i - 1 - min]) % mod;
            }
        }
        if(dp[n] < 0) dp[n] += mod;
        System.out.println(dp[n]);
    }
}

class Reader {
    private StringTokenizer a;
    private BufferedReader b;
    Reader () {
        a = null;
        try {
            b = new BufferedReader (new InputStreamReader (System.in)); // for file IO, replace this with new FileReader ("in.txt")
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String next () {
        while(a == null || !a.hasMoreTokens()) {
            try {
                a = new StringTokenizer (b.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return a.nextToken();
    }
    public int nextInt() {
        return Integer.parseInt(this.next());
    }
    public long nextLong () {
        return Long.parseLong(this.next());
    }
    public double nextDouble () {
        return Double.parseDouble(this.next());
    }
    public String nextLine() {
        try {
            return b.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
class Writer {
    private PrintWriter a;
    private StringBuffer b;
    Writer () {
        try {
            a = new PrintWriter (System.out); // for file IO, replace this with new FileWriter ("out.txt")
        } catch (Exception e) {
            e.printStackTrace();
        }
        b = new StringBuffer ("");
    }
    public void write (Object s) {
        b.append(s);
    }
    public void writeln(Object s) {
        b.append(s).append('\n');
    }
    public void flush () {
        a.print(b);
        a.flush();
        a.close();
    }
}
class Pair implements Comparator <Pair> {
    int first;
    int second;
    Pair  (int a, int b) {
        this.first = a;
        this.second = b;
    }
    Pair (Pair a) {
        this.first = a.first;
        this.second = a.second;
    }
    Pair () {}
    public String toString () {
        return "[" + first + ", " + second + "]";
    }
    public int compare (Pair a, Pair b) {
        if(a.first == b.first) {
            return a.second - b.second;
        } else {
            return a.first - b.first;
        }
    }
}
