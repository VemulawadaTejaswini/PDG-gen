import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        char[] s = sc.next().toCharArray();
        int x = sc.nextInt();
        int y = sc.nextInt();
        HashSet<Integer> nowx = new HashSet<Integer>();
        nowx.add(0);
        HashSet<Integer> nowy = new HashSet<Integer>();
        nowy.add(0);
        boolean isX = true;
        boolean isFirst = true;
        int fcnt = 0;
        for(char c : s){
            if(c == 'T'){
                HashSet<Integer> set = new HashSet<>();
                if(isX){
                    for(int nx : nowx){
                        set.add(nx+fcnt);
                        if(!isFirst) set.add(nx-fcnt);
                    }
                    isFirst = false;
                    nowx = set;
                    isX = false;
                }else{
                    for(int ny : nowy){
                        set.add(ny+fcnt);
                        set.add(ny-fcnt);
                    }
                    nowy = set;
                    isX = true;
                }
                fcnt = 0;
            }else{
                fcnt++;
            }
        }
        HashSet<Integer> set = new HashSet<>();
        if(isX){
            for(int nx : nowx){
                set.add(nx+fcnt);
                if(!isFirst) set.add(nx-fcnt);
            }
            nowx = set;
        }else{
            for(int ny : nowx){
                set.add(ny+fcnt);
                set.add(ny-fcnt);
            }
            nowy = set;
        }
        System.out.println(nowx.contains(x) && nowy.contains(y) ? "Yes" : "No");
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
    
    public double[] nextDoubleArray(int n) {
        double[] a = new double[n];
        for (int i = 0; i < n; i++)
            a[i] = nextDouble();
        return a;
    } 
}
