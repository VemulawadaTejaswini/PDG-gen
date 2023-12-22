import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {


    private void solve(InputReader in, PrintWriter out) {
        String s = in.next();
        long k = in.nextLong();
        BigInteger res = BigInteger.ZERO;
        List<List<BigInteger>> list = new ArrayList<>();
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) == 1) {
                List<BigInteger> lists = new ArrayList<>();
                lists.add(res);
                res = res.add(BigInteger.ONE);
                lists.add(res);
                list.add(lists);
            } else {
                List<BigInteger> lists = new ArrayList<>();
                lists.add(res);
                res = res.add(BigInteger.valueOf(Integer.parseInt(arr[i]) * 5000000000000000L));
                lists.add(res);
                list.add(lists);
            }
        }
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).get(0).compareTo(BigInteger.valueOf(k)) <= 0 && list.get(i).get(1).compareTo(BigInteger.valueOf(k)) > 0) {
                index = i;
                break;
            }
        }
        out.println(arr[index]);
    }


    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        try (
                InputReader in = new InputReader(System.in);
                PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }


    static class InputReader implements AutoCloseable {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        @Override
        public void close() {

        }
    }


}
