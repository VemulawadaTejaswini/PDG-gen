
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    FastScanner in;
    PrintWriter out;

    public static void main(String[] args) {
        new Main().run();
    }

    void solve() {
        int str = in.nextInt();
        int[] input = new int[4];
        int j = 10;
        for (int i = 3; i >= 0; i--) {
            input[i] = str % j;
            str = str / j;
        }
        String[] opers = new String[]{"+", "-"};
        String result = "";
        out:
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 2; k++) {
                for (int l = 0; l < 2; l++) {
                    int num = input[0];
                    if (i == 0) {
                        num += input[1];
                    } else {
                        num -= input[1];
                    }
                    if (k == 0) {
                        num += input[2];
                    } else {
                        num -= input[2];
                    }
                    if (l == 0) {
                        num += input[3];
                    } else {
                        num -= input[3];
                    }
                    if (num == 7) {
                        result = input[0] + opers[i] + input[1] + opers[k] + input[2] + opers[l] + input[3] + "=7";
                    }
                }
            }
        }
        System.out.println(result);

    }


    void run() {
        in = new FastScanner();
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    public class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String nextToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }

        public long nextLong() {
            return Long.parseLong(nextToken());
        }

        public double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }

}