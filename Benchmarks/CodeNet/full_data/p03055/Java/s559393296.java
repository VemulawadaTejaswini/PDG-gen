import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) {
        Solver s = new Solver();
        s.solve();
    }
}

class Queue {
    int [] q;
    int head, tail;
    Queue (int n) {
        q = new int [n];
        head = tail = 0;
    }
    void push(int x) {
        q[tail++] = x;
    }
    int front() {
        return q[head];
    }
    int pop() {
        return q[head++];
    }
    int size() {
        return tail - head;
    }
}

class Solver {
    Reader in = new Reader ();
    Writer out = new Writer ();

    Pair farthest_node(int root, int n, ArrayList <Integer> [] g) {
        int [] dist = new int [n];
        Arrays.fill(dist, -1);

        Queue q = new Queue (n);
        q.push(root);
        dist[root] = 0;

        while(q.size() > 0) {
            int x = q.pop();
            for(int i : g[x]) {
                if(dist[i] == -1) {
                    dist[i] = 1 + dist[x];
                    q.push(i);
                }
            }
        }
        int farthest = 0;
        for(int i = 1; i < n; i++) {
            if(dist[farthest] < dist[i]) {
                farthest = i;
            }
        }
        return new Pair(dist[farthest], farthest);
    }
    void solve () {
        int n = in.nextInt();
        ArrayList <Integer> g[] = new ArrayList [n];
        for(int i = 0; i < n; i++) {
            g[i] = new ArrayList <> ();
        }
        for(int i = 1; i < n; i++) {
            int p = in.nextInt() - 1;
            int q = in.nextInt() - 1;
            g[p].add(q);
            g[q].add(p);
        }
        Pair p = farthest_node(0, n, g);
        Pair q = farthest_node(p.second, n, g);
        int diameter = q.first;

        if(diameter % 3 == 1) {
            System.out.println("Second");
        } else {
            System.out.println("First");
        }
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

