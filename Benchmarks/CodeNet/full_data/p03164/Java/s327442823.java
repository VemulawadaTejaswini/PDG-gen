import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.math.BigInteger;
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
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
         // for declaring
        int n , weight;
        long[] w;
        int[] v;

        public void solve(int testNumber, InputReader in, PrintWriter out) {

                n = in.nextInt();
                weight = in.nextInt();
                int total_value = 0 ;
                w = new long[n];
                v = new int[n];
                for(int i = 0 ; i < n ; i++ ){
                    w[i] = Long.parseLong(in.next());
                    v[i] = in.nextInt();
                    total_value += v[i];
                }
                // index ache value aro value ache weight
                long[] dp = new long[total_value+1];
                Arrays.fill(dp,1_000_000_000_000l);
                dp[0] = 0;
                for(int i = 0 ; i < n ; i++ ){
                    for(int j = total_value-v[i] ; j >= 0; j-- ){
                        dp[j+v[i]] = Math.min(dp[j+v[i]],dp[j]+w[i]);
                    }
                }
                //printArray(dp);
                int ans = 0;
                for( int i = 0 ; i <= total_value ; i++ ){
                    if( dp[i] <= (long)weight ){
                        ans = Math.max(ans,i);
                    }
                }
                out.println(ans);
            }
        }

        public static void printArray(int[] arr){
            for(int i = 0 ; i < arr.length ; i++ ){
                System.out.println(arr[i]);
            }
        }
        public static void printArray(long[] arr){
        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.println(arr[i]);
        }
    }
        public static void printArray(String[] arr){
        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.println(arr[i]);
        }
    }
        public static void printArray(char[] arr){
        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.println(arr[i]);
        }
    }



    }

    class InputReader {
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

    }


