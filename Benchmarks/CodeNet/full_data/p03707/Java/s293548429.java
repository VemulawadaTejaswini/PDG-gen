import java.util.*;
import java.io.*;

class Main {
    static int [][] a = new int [2005][2005];
    static int [][] up = new int [2005][2005];
    static int [][] left = new int [2005][2005];

    static int up_sum(int x, int y, int p, int q) {
        int ans = 0;
        ans += up[p][q];
        ans -= up[x - 1][q];
        ans -= up[p][y - 1];
        ans += up[x - 1][y - 1];
        return ans;
    }
    static int left_sum(int x, int y, int p, int q) {
        int ans = 0;
        ans += left[p][q];
        ans -= left[x - 1][q];
        ans -= left[p][y - 1];
        ans += left[x - 1][y - 1];
        return ans;
    }
    static int sum(int x, int y, int p, int q) {
        int ans = 0;
        ans += a[p][q];
        ans -= a[x - 1][q];
        ans -= a[p][y - 1];
        ans += a[x - 1][y - 1];
        return ans;
    }

    public static void main(String [] args) {
        Reader in = new Reader ();
        Writer out = new Writer ();
        int n = in.nextInt();
        int m = in.nextInt();
        int qr = in.nextInt();

        for(int i = 1; i <= n; i++) {
            String s = in.next();
            for(int j = 1; j <= m; j++) {
                a[i][j] = s.charAt(j-1) - '0';
            }
        }
        for(int i = 2; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(a[i][j] == a[i - 1][j] && a[i][j] == 1) {
                    up[i][j] = 1;
                }
            }
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 2; j <= m; j++) {
                if(a[i][j] == a[i][j - 1] && a[i][j] == 1) {
                    left[i][j] = 1;
                }
            }
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                left[i][j] += left[i - 1][j] + left[i][j - 1] - left[i - 1][j - 1];
                up[i][j] += up[i - 1][j] + up[i][j - 1] - up[i - 1][j - 1];
                a[i][j] += a[i - 1][j] + a[i][j - 1] - a[i - 1][j - 1];            
            }
        }
        for(int cs = 1; cs <= qr; cs++) {
            int x, y, p, q;
            x = in.nextInt();
            y = in.nextInt();
            p = in.nextInt();
            q = in.nextInt();
            int ans = 0;
            ans += up_sum(x+1, y, p, q);
            ans += left_sum(x, y+1, p, q);
            ans = sum(x, y, p, q) - ans;
            out.writeln(ans);
        }
        out.flush();
    }
    static class Reader {
        private StringTokenizer a;
        private BufferedReader b;
        Reader () {
            a = null;
            b = new BufferedReader (new InputStreamReader (System.in));
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
    static class Writer {
        private PrintWriter a;
        private StringBuffer b;
        Writer () {
            a = new PrintWriter (System.out);
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
    static class Pair implements Comparator <Pair> {
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
}