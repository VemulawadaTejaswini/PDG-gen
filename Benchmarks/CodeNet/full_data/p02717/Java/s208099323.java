
import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        int x= in.nextInt();
        int y = in.nextInt();
        int z =in.nextInt();
        in.out.println(z + " "+ x + " " + y);
        in.out.close();
    }
}


class FastScanner {
    BufferedReader br;
    StringTokenizer st = new StringTokenizer("");
    PrintWriter out;

    FastScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
    }

    FastScanner(String in, String out_) throws FileNotFoundException {
        br = new BufferedReader(new FileReader(in));
        out = new PrintWriter(out_);
    }

    String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    long nextLong() throws IOException {
        return Long.parseLong(next());
    }
}