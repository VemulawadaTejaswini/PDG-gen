import java.io.*;
import java.util.*;

public class Main {

    private  static void solver(InputReader sc, PrintWriter out) {
        int n= sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(arr[1]-arr[0]);
        for(int i=2;i<n;i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i - 1; j >=(i-k) && j>=0; j--) {
                int mins = Math.abs(arr[i] - arr[j]) + dp[j];
                if(mins < min){
                    min = mins;
                }
            }
            dp[i] = min;
        }
        out.println(dp[n-1]);
    }
    public static void main(String[] args) throws Exception{
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solver(in,out);
        out.close();
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
        public long nextLong(){
            return Long.parseLong(next());
        }
        public void readLongArr(int n){
            long arr[] = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = nextLong();
            }
        }
        public void readIntArr(int n){
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = nextInt();
            }
        }
    }
}