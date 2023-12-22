
import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[] a;
    static int first;


    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        n = 11;
        a = new int[n];
        first = n - 1;
        int q = in.nextInt();
        while (q-- > 0) {
            boolean act = false;
            for (int i = n - 1; i >= first; i--) {
                if (a[i] != 9 && (i == first || a[i] - a[i - 1] < 1)) {
                    clean(i);
                    act = true;
                    break;
                }
            }
            if (!act) levelup();
        }
        int i = 0;
        while (a[i] == 0) i++;
        for (int j = i; j < n; j++) {
            in.out.print(a[j] + "");
        }
        in.out.close();
    }

    static void levelup() {
        first--;
        a[first] = 1;
        for (int i = first + 1; i < n; i++) {
            a[i] = 0;
        }
    }

    static void clean(int i) {
        a[i] = (a[i] + 1);
        for (int j = i + 1; j < n; j++) {
            a[j] = Math.max(0, (a[j - 1] - 1));
        }
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