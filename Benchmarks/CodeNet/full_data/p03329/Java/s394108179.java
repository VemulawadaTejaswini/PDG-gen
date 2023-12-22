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

    private static int withdrawByMultiplier(int totalAmount, int multiplier) {
        if (totalAmount < multiplier) {
            return totalAmount;
        }

        int withdrawAmount = 1;
        while (withdrawAmount * multiplier <= totalAmount) {
            withdrawAmount *= multiplier;
        }

        int remainingAmount = totalAmount -withdrawAmount;
        int nine = 1 + withdrawByMultiplier(remainingAmount, 9);
        int six = 1 + withdrawByMultiplier(remainingAmount, 6);

        return Math.min(nine, six);
    }

    private static int withdraw(int totalAmount) {
        return Math.min(withdrawByMultiplier(totalAmount, 9), withdrawByMultiplier(totalAmount, 6));
    }

    public static void main(final String[] args) throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out, true);

        int n = in.nextInt();
        out.println(withdraw(n));
    }

}
