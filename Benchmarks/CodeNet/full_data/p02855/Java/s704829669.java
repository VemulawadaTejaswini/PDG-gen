import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        char[][] map = new char[h][w];
        boolean[] onStrawberry = new boolean[h];
        boolean[] filled = new boolean[h];
        for(int i = 0; i < h; i++){
            map[i] = sc.next().toCharArray();
            boolean flg = false;
            for(char c : map[i]){
                if(c == '#'){
                    flg = true;
                    break;
                }
            }
            onStrawberry[i] = flg;
        }
        int now = 1;
        int[][] ans = new int[h][w];
        for(int i = 0; i < h; i++){
            if(!onStrawberry[i]) continue;
            for(int j = 0; j < w; j++){
                ans[i][j] = now;
                if(map[i][j] == '#'){
                    if(now < k) now++;
                }
            }
            for(int j = i-1; j >= 0; j--){
                if(filled[j] || onStrawberry[j]){
                    break;
                }
                ans[j] = ans[i];
                filled[j] = true;
            }
            for(int j = i+1; j < h; j++){
                if(filled[j] || onStrawberry[j]){
                    break;
                }
                ans[j] = ans[i];
                filled[j] = true;
            }
            filled[i] = true;
        }
        for(int i = 0; i < h; i++){
            StringBuilder sb = new StringBuilder();
            for(int c : ans[i]){
                sb.append(c + " ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}


class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}
