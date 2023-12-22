import java.io.*;
import java.util.*;

public class Main {

    private  static void solver(InputReader sc, PrintWriter out) {
       int n= sc.nextInt();
       int arr[] = new int[n];
       for(int i=0;i<n;i++){
           arr[i]= sc.nextInt();
       }
       int[] dp = new int[n];
       dp[0] = 0;
       dp[1] = Math.abs(arr[1]-arr[0]);
       for(int i=2;i<n;i++){
           dp[i] = Math.min(Math.abs(arr[i]-arr[i-1])+dp[i-1],Math.abs(arr[i]-arr[i-2])+dp[i-2]);
       }
      /* for(int i=0;i<n;i++)
           out.print(dp[i]+" ");*/
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