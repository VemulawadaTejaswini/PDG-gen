import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main implements Runnable {

    private void solve() throws IOException {

        int N = nextInt();
        int x = nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; ++i) arr[i] = nextInt();

        long ret = 0L;

        for(int i = 1; i < N; ++i) {
            if(arr[i] + arr[i-1] > x) {
                int diff = Math.abs((arr[i]+arr[i-1] - x));
                if(arr[i] >= diff) {
                    ret += diff;
                    arr[i] -= diff;
                } else {
                    ret += arr[i];
                    diff -= arr[i];
                    arr[i] = 0;
                    ret += diff;
                    arr[i-1] -= diff;
                }
            }
        }
        for(int i = 1; i < N; ++i) {
            if(arr[i] + arr[i-1] > x) {
                int diff = Math.abs((arr[i]+arr[i-1] - x));
                if(arr[i] >= diff) {
                    ret += diff;
                    arr[i] -= diff;
                } else {
                    ret += arr[i];
                    diff -= arr[i];
                    arr[i] = 0;
                    ret += diff;
                    arr[i-1] -= diff;
                }
            }
        }

        writer.println(ret);
    }


    public static void main(String[] args) {

        new Main().run();
    }

    BufferedReader reader;
    StringTokenizer tokenizer;
    PrintWriter writer;

    public void run() {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
//             reader = new BufferedReader(new FileReader("input.txt"));
            tokenizer = null;
            writer = new PrintWriter(System.out);
            solve();
            reader.close();
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

    String nextToken() throws IOException {
        while(tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }

        return tokenizer.nextToken();
    }
}
