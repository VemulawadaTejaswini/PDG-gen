import javax.management.Query;
import javax.print.attribute.SupportedValuesAttribute;
import java.io.*;
import java.security.interfaces.DSAKeyPairGenerator;
import java.sql.Array;
import java.util.*;
import java.util.function.Predicate;


public class Main {

    static class TaskB {

        static int oo = Integer.MAX_VALUE - 1;

        static int MOD = 1000000007;


        public void solve(InputReader in, PrintWriter out) {
            int n = in.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];

            for(int i = 0; i < n; i++)
            {
                a[i] = in.nextInt();
                b[i] = in.nextInt();
                c[i] = in.nextInt();
            }

            int[][] dp = new int[n][3];
            dp[0][0] = a[0];
            dp[0][1] = b[0];
            dp[0][2] = c[0];

            for(int i = 1; i < n; i++)
            {
                dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2]) + a[i];
                dp[i][1] = Math.max(dp[i-1][2], dp[i-1][0]) + b[i];
                dp[i][2] = Math.max(dp[i-1][0], dp[i-1][1]) + c[i];
            }
            out.print(Math.max(Math.max(dp[n-1][0], dp[n-1][1]), dp[n-1][2]));
        }
    }

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(in, out);
        out.close();
    }



    static void sort(int[] a)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer i: a)list.add(i);
        Collections.sort(list);
        for(int i = 0; i < a.length; i++)a[i]=list.get(i);
    }


    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer = new StringTokenizer("");

        public InputReader(InputStream inputStream) {
            this.reader = new BufferedReader(
                    new InputStreamReader(inputStream));
        }

        public String next() {
            while (!tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }
    }
}