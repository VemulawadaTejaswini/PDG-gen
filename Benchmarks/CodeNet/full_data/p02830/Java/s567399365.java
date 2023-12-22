import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final int MOD = (int) Math.pow(10, 9);
    private static final int[][] DIRECTIONS = {{1, 1}, {0, 1}, {-1, 1}, {1, 0}, {-1, 0}, {0, -1}};

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int a = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            res = res + s.charAt(i) + t.charAt(i);
        }

        System.out.println(res);
        System.exit(0);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
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
            try{
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
