import java.io.*;
import java.util.*;

public class Main {

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null; }
        String next() { while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try { tokenizer = new StringTokenizer(reader.readLine()); } 
                catch (IOException e) { throw new RuntimeException(e);} }
            return tokenizer.nextToken(); }
        public int nextInt() { return Integer.parseInt(next()); }
        public long nextLong() { return Long.parseLong(next()); }
        public double nextDouble() { return Double.parseDouble(next()); }
    }

    static InputReader r = new InputReader(System.in);
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {
        
        int n = r.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1; i <= n; i++){
            arr[i] = r.nextInt();
        }
        Arrays.sort(arr);
        int bad = 0;
        for(int i = 1; i <= n; i++){
            for(int j = i+1; j <= n; j++){
                int idx = Arrays.binarySearch(arr, arr[i] + arr[j]);
                if(idx < 0) idx = -idx-1;
                // System.out.println(idx);
                bad += (n - idx + 1);
            }
        } // 1 2 3 4 
        // System.out.println(bad);
        int total = (n * (n-1) * (n-2)) / 6;
        pw.println(total - bad);
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