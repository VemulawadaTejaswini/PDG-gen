import java.util.*;
import java.io.*;

class Main {
    public static void main(String [] args) {
        Reader in = new Reader ();
        Writer out = new Writer ();

        int n = in.nextInt();
        int [] a = new int [n + 5];

        for(int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }
        long ans = (long) 1e16;
        for(int cs = 0; cs <= 1; cs++) {
            int pos = cs;
            long sum = 0;
            long res = 0;

            for(int i = 1; i <= n; i++) {
                if(pos == 1) {
                    long can = -sum + 1;
                    if(a[i] >= can) sum += a[i];
                    else {
                        res += Math.abs(can - a[i]);
                        sum += can;
                    }
                } else {
                    long can = -sum - 1;
                    if(a[i] <= can) sum += a[i];
                    else {
                        res += Math.abs(can - a[i]);
                        sum += can;
                    } 
                }
                pos ^= 1;
            }
            ans = Math.min(ans, res);
        }
        System.out.println(ans);
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
