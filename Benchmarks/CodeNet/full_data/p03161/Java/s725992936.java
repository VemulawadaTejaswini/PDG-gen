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
        solver.call(in,out);
        out.close();
    }

    public static int twoPower(int n  ,int[] arr){
        int b;
        int count=-1;
        b = arr.length-1 -n;
        while(b!=0){
            b/=2;
            count++;
        }
        return count;
    }

    static class TaskA {
        public void call(InputReader in, PrintWriter out ) {
            int b , n  , k;
            n=in.nextInt();
            k=in.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=in.nextInt();
            }

            int[] dp = new int[n];

            for(int i=dp.length-2; i>=0;i--){
                b=Integer.MAX_VALUE;
                for (int j =1;j+i<dp.length && j<=k;j++)  {
                    int first = Math.abs(arr[i] - arr[j+i]) + dp[j+i];
                    if (first < b) {
                        b = first;
                    }

                }
                dp[i] = b ;
            }
            out.println(dp[0]);
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
