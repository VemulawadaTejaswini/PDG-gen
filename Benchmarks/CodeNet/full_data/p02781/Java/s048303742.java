import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        int k = sc.nextInt();
        long i = 0;
        long x = 0;
        ArrayList arr = new ArrayList();
        long temp;
        long res = 0;
        for (; i <= n; i++) {
            temp = i;

            for (x = 0; temp > 0; ) {
                long temp2 = temp;
                temp2 %= 10;
                if (temp2 != 0)
                    x++;
                temp /= 10;
            }
            if (x == k) {
                res += 1;
            }
        }
        pw.println(res);

        pw.close();
    }

/*    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String file) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(file));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

    } */
}