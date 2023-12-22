import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[][] grid = new int[3][c];
        int[][] map = new int[c][c];
        for(int i = 0; i < c; i++){
            for(int j = 0; j < c; j++){
                map[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                grid[(i+j)%3][sc.nextInt()-1]++;
            }
        }
        long ans = Long.MAX_VALUE;
        for(int i = 0; i < c; i++){
            long ans1 = calc(map,grid,0,i,c);
            for(int j = 0; j < c; j++){
                if(i == j) continue;
                long ans2 = calc(map,grid,1,j,c);
                for(int k = 0; k < c; k++){
                    if(i == k || j == k) continue;
                    long ans3 = calc(map,grid,2,k,c);
                    ans = Math.min(ans,ans1+ans2+ans3);
                }
            }
        }
        System.out.println(ans);
    }
    
    public static long calc(int[][] map, int[][] grid, int mod, int change, int c){
        long ret = 0;
        for(int j = 0; j < c; j++){
            ret += map[j][change] * grid[mod][j];
        }
        return ret;
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
