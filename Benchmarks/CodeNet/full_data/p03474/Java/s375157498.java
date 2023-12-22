import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = 1;
        Solver s = new Solver();
        for (int i = 1; i <= t; i++) {
            s.solve(i, in, out);
        }
        out.close();
    }

}

class Solver {
    void solve(int test, InputReader in, PrintWriter out) throws IOException {
        int a = in.nextInt();
        int b = in.nextInt();
        String s = in.next();
        for (int i = 0; i < s.length(); i++) {
            if (i == a) {
                if (s.charAt(i) != '-') {
                    out.println("No");
                    return;
                }
            } else {
                if (!Character.isDigit(s.charAt(i))) {
                    out.println("No");
                    return;
                }
            }
        }
        out.println("Yes");
    }
}

class InputReader {
    BufferedReader br;
    StringTokenizer st;

    public InputReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = null;
    }

    public String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public String nextLine() throws IOException {
        return br.readLine();
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}