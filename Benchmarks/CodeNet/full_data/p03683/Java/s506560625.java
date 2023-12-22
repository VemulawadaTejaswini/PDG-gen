import java.io.*;
import java.util.*;

public class Main implements Runnable {

    private void solve() throws IOException {

        long N = nextLong();
        long M = nextLong();

        long MOD = 1_000_000_007L;

        if(Math.abs(N - M) > 1) {
            writer.println(0);
        } else {
            long pA = 1L;
            long pB = 1L;
            // start with N
            long A = N;
            long B = M;
            while(A > 0 && B > 0) {
                pA *= ( A  );
                pA %= MOD;
                pA *= ( B );
                pA %= MOD;
                --A;
                --B;
            }
            boolean isValidA = (B >= 0 && (A == 0));
            A = N;
            B = M;
            while(A > 0 && B > 0) {
                pB *= (A );
                pB %= MOD;
                pB *= (B);
                pB %= MOD;
                --A;
                --B;
            }
            boolean isValidB = ( A >= 0 && (B == 0));
            long ret = 0L;
            if(isValidA) ret += pA;
            if(isValidB) ret += pB;
            ret %= MOD;
            writer.println(ret);

        }
    }


    public static void main(String[] args) {
        new Main().run();
    }

    BufferedReader reader;
    //    BufferedReader reader2;
    StringTokenizer tokenizer;
    PrintWriter writer;
    //    BufferedWriter writer;

    public void run() {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
//            reader = new BufferedReader(new FileReader("input.txt"));
            //            reader2 = new BufferedReader(new FileReader("1.in"));
            tokenizer = null;
            writer = new PrintWriter(System.out);
//            writer = new     PrintWriter("output.txt");
//                                                    writer = new BufferedWriter(System.out);
            //                        writer = new BufferedWriter(new OutputStreamWriter(System.out));
            solve();
            reader.close();
            //            reader2.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    short nextShort() throws IOException {
        return Short.parseShort(nextToken());
    }

    String nextToken() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }

        return tokenizer.nextToken();
    }

}