
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

        private static void solve(InputReader in, PrintWriter out) {
            Double b=in.nextDouble();
            System.out.println(2*Math.PI*b);
        }
        public static void main(String args[]){
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            InputReader in = new InputReader(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            solve(in,out);
            out.close();
        }
        private static class InputReader {
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

        public int nextInt() {
            return Integer.parseInt(next());
        }
            public Double nextDouble() {
                return Double.parseDouble(next());
            }
    }
}