import java.util.*;
import java.io.*;
 
public class Main {
    static long ans = 0;
    static char[] s;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        s = sc.next().toCharArray();
        boolean[] plus = new boolean[s.length-1];
        divide(plus,0);
        System.out.println(ans);
    }
    
    public static void divide(boolean[] p, int index){
        if(p.length == index){
            calc(p);
            return;
        }
        divide(p,index+1);
        p[index] = true;
        divide(p,index+1);
        p[index] = false;
        return;
    }
    
    public static void calc(boolean[] p){
        long tmp = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(s[0]);
        for(int i = 0; i < p.length; i++){
            if(p[i]){
                tmp += Long.parseLong(sb.toString());
                sb.setLength(0);
            }
            sb.append(s[i+1]);
        }
        tmp += Long.parseLong(sb.toString());
        //System.out.println(tmp);
        ans += tmp;
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
