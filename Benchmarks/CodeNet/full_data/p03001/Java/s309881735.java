
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        double W = sc.nextDouble();
        double H = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        boolean hafx = W - x == x ? true : false;
        boolean hafy = H - y == y ? true : false;

        double littleX = x < W - x ? x : W - x;
        double littleY = y < H - y ? y : H - y;

        if (hafx && hafy) {
            out.println(H * littleX + " " + 1);
        } else if (hafx) {
            out.println(H * littleX + " " + 0);
        } else if (hafy) {
            out.println(W * littleY + " " + 0);
        } else {
            //            if (littleX < littleY) {
            //                out.println(littleY * W + " " + 0);
            //            } else {
            //                out.println(H * littleX + " " + 0);
            //            }
            double res = littleX * H < littleY * W ? littleY * W : littleX * H;
            out.println(res + " " + 0);
        }

        out.flush();
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
}