import java.util.*;
import java.io.*;

class Task {
    public static void main(String[] args) {
        Solver s = new Solver();
        s.solve();
    }
}

class Solver {
    Reader in = new Reader();
    Writer out = new Writer();

    void solve() {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a * 3 + b;
        int d = c / 2;
        out.println(d);
        out.flush();
    }
}

class Reader {
    private StringTokenizer a;
    private BufferedReader b;

    Reader() {
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

    Writer() {
        try {
            a = new PrintWriter (System.out); // for file IO, replace this with new FileWriter ("out.txt")
        } catch (Exception e) {
            e.printStackTrace();
        }
        b = new StringBuffer ("");
    }

    public void print(Object s) {
        b.append(s);
    }

    public void println(Object s) {
        b.append(s).append('\n');
    }

    public void flush() {
        a.print(b);
        a.flush();
        a.close();
    }
}