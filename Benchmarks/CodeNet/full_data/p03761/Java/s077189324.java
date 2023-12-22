import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[][] used;
    static int[] ans;
    public static void main(String[] args) throws Exception {
        char[] alps = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int[][] count = new int[n][26];
        for(int i = 0; i < n; i++){
            char[] s = sc.next().toCharArray();
            for(char c : s){
                int j = c - 'a';
                count[i][j]++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < 26; j++){
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < n; i++){
                min = Math.min(min,count[i][j]);
            }
            for(int i = 0; i < min; i++) sb.append(alps[j]);
        }
        System.out.println(sb.toString());
    }
}

class Drink implements Comparable<Drink>{
    int y,m;
    public Drink(int y, int m){
        this.y = y;
        this.m = m;
    }
    
    public int compareTo(Drink d){
        if(this.y < d.y){
            return -1;
        }else if(this.y > d.y){
            return 1;
        }else{
            return 0;
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
