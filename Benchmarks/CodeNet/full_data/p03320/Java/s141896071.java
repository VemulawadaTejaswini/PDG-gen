/**
 * @author cplayer on 2018/6/23.
 * @version 1.0
 */

import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        try {
            InputReader in;
            PrintWriter out;
            boolean useOutput = false;
            // if (System.getProperty("ONLINE_JUDGE") == null) useOutput = true;
            if (useOutput) {
                FileInputStream fin = new FileInputStream(new File("src/data.in"));
                in = new InputReader(fin);
                FileOutputStream fout = new FileOutputStream(new File("src/data.out"));
                out = new PrintWriter(fout);
            } else {
                InputStream inputStream = System.in;
                in = new InputReader(inputStream);
                OutputStream outputStream = System.out;
                out = new PrintWriter(outputStream);
            }
            Solver solver = new Solver();
            solver.solve(in, out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Solver {

        public void solve(InputReader cin, PrintWriter cout) {
            try {
                int k = cin.nextInt();
                int curLen = 0;
                BigInteger cur = BigInteger.ZERO;
                BigInteger base = BigInteger.ZERO;
                BigInteger uppbound = BigInteger.TEN.pow(15);
                int loop = 1;
                while (k > 0) {
                    cur = new BigInteger(Integer.valueOf(loop).toString());
                    for (int i = 0; i < curLen; ++i) {
                        cur = cur.multiply(BigInteger.TEN);
                    }
                    cur = cur.add(base);
                    loop++;
                    if (loop == 10) {
                        loop = 1;
                        base = base.multiply(BigInteger.TEN).add(new BigInteger("9"));
                        curLen++;
                    }
                    if (cur.compareTo(uppbound) >= 0) break;
                    cout.println(cur.toString());
                    k--;
                }
            } catch (RuntimeException e) {
                e.printStackTrace();
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }

        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 1000000);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
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

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }

}