import java.util.*;
import java.io.*;

public class Main {
    static void checker(boolean x) throws Exception {
        if(!x) {
            Exception e = new Exception();
            throw e;
        } 
    }
    public static void main(String [] args) throws Exception {
        Reader in = new Reader ();
        Writer out = new Writer ();
        int n = in.nextInt();
        int k = in.nextInt();
        int [] a = new int [n + 5];
        ArrayList <Integer> [] g = new ArrayList [n + 5];
        int [] deg = new int [n + 5];
        checker(n <= 5000);
        for(int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }
        for(int i = 0; i <= n; i++) {
            g[i] = new ArrayList <> ();
            deg[i] = 0;
        }
        for(int i = 1; i <= n; i++) {
            for(int j = Math.max(0, i - k) + 1; j < i; j++) {
                if(a[j] < a[i]) {
                    g[j].add(i);
                    ++deg[i];
                }
            }
            for(int j = i + 1; j < i + k && j <= n; j++) {
                if(a[j] < a[i]) {
                    g[j].add(i);
                    ++deg[i];
                }
            }
        }
        TreeSet <Integer> t = new TreeSet <> ();
        for(int i = 1; i <= n; i++) {
            if(deg[i] == 0) {
                t.add(i);
            }
        }
        int [] inv = new int [n + 5];
        int [] ans = new int [n + 5];
        int pointer = 0;
        while(!t.isEmpty()) {
            int x = t.first();
            t.remove(x);
            inv[++pointer] = x;
            for(int i : g[x]) {
                --deg[i];
                if(deg[i] == 0) {
                    t.add(i);
                }
            }
        }
        for(int i = 1; i <= n; i++) {
            ans[inv[i]] = i;
        }
        for(int i = 1; i <= n; i++) {
            out.writeln(ans[i]);
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