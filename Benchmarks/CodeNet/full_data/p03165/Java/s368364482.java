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

    /** CHECKLIST:
     * LIMITS (DOES BRUTE FORCE WORK?)
     * CHECK ALL PARAMETERS
     * INT VS LONG
     */
    public static void main(String[] args) {
        
        String s = r.next();
        String t = r.next();
        int m = s.length();
        int n = t.length();
        int[][] L = new int[m+1][n+1];
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                if(i == 0 || j == 0){
                    L[i][j] = 0;
                } else if(s.charAt(i-1) == t.charAt(j-1)){
                    L[i][j] = L[i-1][j-1] + 1;
                } else{
                    L[i][j] = Math.max(L[i][j-1], L[i-1][j]);
                }
            }
        }
        char[] lcs = new char[1 + L[m][n]];
        lcs[L[m][n]] = ' ';
        int i = m;
        int j = n;
        int index = L[m][n];
        while(i > 0 && j > 0){
            if(s.charAt(i-1) == t.charAt(j-1)){
                lcs[index-1] = s.charAt(i-1);
                i--; j--; index--;
            } else if (L[i-1][j] > L[i][j-1]){
                i--; 
            } else {
                j--;
            }
        }
        for(int k = 0; k <= L[m][n]; k++){
            pw.print(lcs[k]);
        }
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