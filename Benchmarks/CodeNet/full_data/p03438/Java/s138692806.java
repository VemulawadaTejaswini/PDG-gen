import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        new Main().go();
    }

    PrintWriter out;
    Reader in;
    BufferedReader br;

    Main() throws IOException {

        try {

            //br = new BufferedReader( new FileReader("input.txt") );
            in = new Reader("input.txt");
            out = new PrintWriter( new BufferedWriter(new FileWriter("output.txt")) );
        }
        catch (Exception e) {

            //br = new BufferedReader( new InputStreamReader( System.in ) );
            in = new Reader();
            out = new PrintWriter( new BufferedWriter(new OutputStreamWriter(System.out)) );
        }
    }

    void go() throws IOException {

        int t = 1;
        while (t > 0) {
            solve();
            //out.println();
            t--;
        }

        out.flush();
        out.close();
    }

    int inf = 2000000000;
    int mod = 1000000007;
    double eps = 0.000000001;

    int n;
    int m;

    //ArrayList<Integer>[] g = new ArrayList[1000000];

    HashMap<Integer, Integer> map = new HashMap<>();

    void solve() throws IOException {

        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();

        for (int i = 0; i < n; i++)
            b[i] = in.nextInt();

        long z = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] <= b[i]) {
                z += (b[i] - a[i]) / 2;
            }
            else {
                z -= a[i] - b[i];
            }

            //System.err.println(a[i]+" "+b[i]);
        }

        out.println(z >= 0 ? "Yes" : "No");
    }


    class Pair implements Comparable<Pair>{

        int a;
        int b;

        Pair(int a, int b) {

            this.a = a;
            this.b = b;
        }

        public int compareTo(Pair p) {

            if (a > p.a) return 1;
            if (a < p.a) return -1;
            if (b > p.b) return 1;
            if (b < p.b) return -1;
            return 0;
        }
    }

    class Item {

        int a;
        int b;
        int c;

        Item(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

    }

    class Reader {

        BufferedReader  br;
        StringTokenizer tok;

        Reader(String file) throws IOException {
            br = new BufferedReader( new FileReader(file) );
        }

        Reader() throws IOException {
            br = new BufferedReader( new InputStreamReader(System.in) );
        }

        String next() throws IOException {

            while (tok == null || !tok.hasMoreElements())
                tok = new StringTokenizer(br.readLine());
            return tok.nextToken();
        }

        int nextInt() throws NumberFormatException, IOException {
            return Integer.valueOf(next());
        }

        long nextLong() throws NumberFormatException, IOException {
            return Long.valueOf(next());
        }

        double nextDouble() throws NumberFormatException, IOException {
            return Double.valueOf(next());
        }


        String nextLine() throws IOException {
            return br.readLine();
        }

    }

}