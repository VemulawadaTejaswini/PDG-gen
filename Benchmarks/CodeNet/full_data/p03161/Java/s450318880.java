import java.io.*;
import java.util.*;

public class Main {

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() {
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

        public float nextFloat() {
            return Float.parseFloat(next());
        }

    }

    static InputReader r = new InputReader(System.in);
    static PrintWriter pw = new PrintWriter(System.out);

    /** CHECKLIST:
     * LIMITS (DOES BRUTE FORCE WORK?)
     * CHECK ALL PARAMETERS
     * INT VS LONG
     */
    public static void main(String[] args) {
        int n = r.nextInt();
        int k = r.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1; i <= n; i++){
            arr[i] = r.nextInt();
        }
        int[] dp = new int[n+1];
        dp[1] = 0; // frog starts here
        for(int i = 2; i <= n; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 1; j <= k; j++){
                if(i - j > 0){
                    min = Math.min(min, dp[i-j] + Math.abs(arr[i] - arr[i-j]));
                }
            }
            dp[i] = min;
        }
        pw.println(dp[n]);
        pw.close();
    }
}

/**
                _        _                 _                                                
               | |      | |               | |                                               
   ___ ___   __| | ___  | |__  _   _    __| | __ _ _ __ _ __ ___ _ __     _   _  __ _  ___  
  / __/ _ \ / _` |/ _ \ | '_ \| | | |  / _` |/ _` | '__| '__/ _ \ '_ \   | | | |/ _` |/ _ \ 
 | (_| (_) | (_| |  __/ | |_) | |_| | | (_| | (_| | |  | | |  __/ | | |  | |_| | (_| | (_) |
  \___\___/ \__,_|\___| |_.__/ \__, |  \__,_|\__,_|_|  |_|  \___|_| |_|   \__, |\__,_|\___/ 
                                __/ |                               ______ __/ |            
                               |___/                               |______|___/             
 */