import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        Node[] a = new Node[n];
        for(int i = 0; i < n; i++){
            a[i] = new Node(i,sc.nextInt());
        }
        Arrays.sort(a);
        long[][] dp = new long[n+1][n+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; i + j < n; j++) {
                dp[i+1][j] = Math.max(dp[i+1][j], dp[i][j]+a[i+j].v * (a[i+j].i - i));
                dp[i][j+1] = Math.max(dp[i][j+1], dp[i][j]+a[i+j].v * ((n-1-j) - a[i+j].i));
            }
        }
        long ans = 0;
        for(int i = 0; i <= n; i++){
            ans = Math.max(ans,dp[i][n-i]);
        }
        pw.println(ans);
        pw.flush();
    }

    static class GeekInteger {
        public static void save_sort(int[] array) {
            shuffle(array);
            Arrays.sort(array);
        }
 
        public static int[] shuffle(int[] array) {
            int n = array.length;
            Random random = new Random();
            for (int i = 0, j; i < n; i++) {
                j = i + random.nextInt(n - i);
                int randomElement = array[j];
                array[j] = array[i];
                array[i] = randomElement;
            }
            return array;
        }
 
    }
}

class Node implements Comparable<Node>{
    int i, v;
    public Node(int i, int v){
        this.i = i;
        this.v = v;
    }
    
    public int compareTo(Node n){
        if(this.v > n.v){
            return -1;
        }else if(this.v < n.v){
            return 1;
        }else if(this.i < n.i){
            return -1;
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
