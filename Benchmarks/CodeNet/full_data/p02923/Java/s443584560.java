import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        int N = sc.nextInt();
        int[] H = new int[N];
        for (int i=0; i<N; i++){
            H[i] = sc.nextInt();
        }
        int moveCnt = 0;
        int prevHeight = H[0];
        int ans = 0;

        for (int i=1; i<N; i++){
            if (H[i] <= prevHeight){
                moveCnt++;
            }else {
                ans = Math.max(ans, moveCnt);
                moveCnt = 0;
            }
            prevHeight = H[i];
        }
        ans = Math.max(ans, moveCnt);
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