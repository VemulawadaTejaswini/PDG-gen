import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<War> li = new ArrayList<>();
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            li.add(new War(a,b));
        }
        Collections.sort(li);
        int ans = 0;
        int right = -Integer.MAX_VALUE;
        for(War a : li){
            if(right <= a.l){
                ans++;
                right = a.r;
            }else if(right > a.r){
                right = a.r;
            }
        }
        System.out.println(ans);
    }
}

class War implements Comparable<War>{
    int l,r;
    public War(int l, int r){
        this.l = l;
        this.r = r;
    }
    
    public int compareTo(War a){
        if(this.l < a.l){
            return -1;
        }else if(this.l > a.l){
            return 1;
        }else{
            if(this.r < a.r){
                return -1;
            }else if(this.r > a.r){
                return 1;
            }else{
                return 0;
            }
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
    
    public void close() throws Exception{
        this.reader.close();
        return;
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