import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] charH = new int[h][26];
        int[][] charW = new int[w][26];
        for(int i = 0; i < h; i++){
            char[] s = sc.next().toCharArray();
            int j = 0;
            for(char c : s){
                int index = c - 'a';
                charH[i][index]++;
                charW[j][index]++;
                j++;
            }
        }
        for(int i = 0; i < h; i++){
            boolean isCenter = w % 2 == 1 ? true : false;
            for(int a : charH[i]){
                if(a % 2 != 0){
                    if(isCenter){
                        isCenter = false;
                    }else{
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        for(int i = 0; i < w; i++){
            boolean isCenter = h % 2 == 1 ? true : false;
            for(int a : charW[i]){
                if(a % 2 != 0){
                    if(isCenter){
                        isCenter = false;
                    }else{
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        System.out.println("Yes");
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
