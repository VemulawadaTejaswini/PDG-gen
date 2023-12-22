import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
       MyScanner sc = new MyScanner();
       int A = sc.nextInt();
       int B = sc.nextInt();

       int ans = Math.max(A+B, A-B);
       ans = Math.max(ans, A*B);
       System.out.println(ans);
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;
    
        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }
    
        int nextInt() {
            return Integer.parseInt(next());
        }
    
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}