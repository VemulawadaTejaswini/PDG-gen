import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DMultipleOf2019 solver = new DMultipleOf2019();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMultipleOf2019 {
        char[] arr;
        int mod = 2019;

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            arr = sc.next().toCharArray();
            long numMultiples = 0;
            for (int i = 0; i < arr.length; i++) {
                int remainder = 0;
                long prefixesFound = 0;
                boolean[] vis = new boolean[mod];
                for (int j = i; j < arr.length; j++) {
                    remainder = (10 * remainder + arr[j] - '0') % mod;
                    if (vis[remainder])
                        break;
                    vis[remainder] = true;
                    if (remainder == 0)
                        prefixesFound++;
                }
                numMultiples += 1l * prefixesFound * (prefixesFound + 1) / 2;
            }
            pw.println(numMultiples);
        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
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

    }
}

