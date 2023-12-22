import java.util.*;
import java.io.*;

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

        // Input
        int n = in.nextInt();
        char[] s = in.next().toCharArray();

        int[] we = new int[n];
        we[0] = 0;
        for (int i = 1; i < n; i++) {
            if (s[i - 1] == 'W') {
                we[i] = we[i - 1] + 1;
            } else {
                we[i] = we[i - 1];
            }
        }

        int[] ew = new int[n];
        ew[0] = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (s[i + 1] == 'E') {
                ew[i] = ew[i + 1] + 1;
            } else {
                ew[i] = ew[i + 1];
            }
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int difference = Math.abs(we[i] + ew[i]);
            if (difference < answer) {
                answer = difference;
            }
        }
        System.out.println(answer);
    }

}
