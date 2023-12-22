import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[h*w+1];
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                int index = sc.nextInt();
                arr[index] = w*i+j;
            }
        }
        int[][] cum = new int[d][(h*w)/d+1];
        for(int i = 1; i <= h*w; i++){
            int ci = i%d;
            int cj = i/d;
            if(cj != 0){
                int prev = i-d;
                cum[ci][cj] += cum[ci][cj-1] + Math.abs(arr[i]/w - arr[prev]/w) + Math.abs(arr[i]%w - arr[prev]%w);
            }
        }
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int s = sc.nextInt();
            int g = sc.nextInt();
            int ci = s%d; 
            System.out.println(cum[ci][g/d]-cum[ci][s/d]);
        }
    }
    
    public static void printArr(int[][] arr, int h, int w){
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return;
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
    
    public String[] nextArray(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = next();
        return a;
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
