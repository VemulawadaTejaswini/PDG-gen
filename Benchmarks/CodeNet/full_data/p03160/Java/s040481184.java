import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        int n,a;
        n=in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        a=0;
        int[] dp = new int[n];
        int ans = solver.call(arr , a , dp);
        out.println(ans);
        out.close();
    }

    static class TaskA {
        public int call( int[] arr , int a , int[] dp ) {
            if(arr.length!=2) {
                for (int i = arr.length - 2; i >= arr.length - 3; i--) {
                    dp[i] = Math.abs(arr[i] - arr[arr.length - 1]);
                }
                for (int i = arr.length - 4; i >= 0; i--) {
                    dp[i] = Math.min(Math.abs(arr[i] - arr[i + 1]) + dp[i + 1], Math.abs(arr[i] - arr[i + 2]) + dp[i + 2]);
                }
            }
            else
            {
                dp[0]=Math.abs(arr[0] -arr[1]);
            }
            return dp[0];
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

        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }


    }
}