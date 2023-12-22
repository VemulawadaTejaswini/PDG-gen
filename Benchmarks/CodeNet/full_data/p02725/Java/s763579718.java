import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(final String[] args) throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out, true);

        int k = in.nextInt();
        int n = in.nextInt();
        String[] tokens = in.nextLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(tokens[i]);
        }
        Arrays.sort(a);

        int[] d = new int[n - 1];
        for (int i = 1; i < n; i++) {
            d[i - 1] = a[i] - a[i - 1];
        }

        int forward = 0;
        int backward = 0;

        int left = 0;
        int right = d.length - 1;

        while (left <= right) {
            if (backward < forward) {
                backward += d[left];
                left++;
            } else {
                forward += d[right];
                right--;
            }
        }

        if (backward == forward) {
            out.println(backward + forward);
        } else {
            out.println(Math.max(backward, forward));
        }
    }
}
