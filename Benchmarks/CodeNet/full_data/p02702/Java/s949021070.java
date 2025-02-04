//package beginner164.d;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

import static java.math.BigInteger.TEN;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        private static final BigInteger _2019 = BigInteger.valueOf(2019);
        private static final BigInteger _202 = BigInteger.valueOf(202);

        public void solve(int testNumber, InputReader in, PrintWriter out) {
           String s = in.next();
           if (s.length() < 4) {
               out.println("0");
               return;
           }

           int answer = 0;
           for (int i = 0; i < s.length() - 4; ++i) {
               StringBuilder sb = new StringBuilder(s.substring(i, i+3));
               for (int j = i + 4; j <= s.length(); ++j) {
                   sb.append(s.charAt(j-1));
                   BigInteger ssBi = new BigInteger(sb.toString());
//                   System.out.println(ssBi);
                   if (isDivisible(ssBi)) {
//                       System.out.println("found");
                       ++answer;
                   }
               }
           }

           out.println(answer);
        }

        private boolean isDivisible(BigInteger ssBi) {
            while (ssBi.compareTo(_2019) == 1) {
                BigInteger mod = ssBi.mod(TEN);
                ssBi = ssBi.divide(TEN).add(_202.multiply(mod));

                if (ssBi.compareTo(_2019) == 0) {
                    return true;
                }
            }

            return false;
        }
    }



    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}