import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        boolean[] eat = new boolean[n];
        ArrayList<Dish> li = new ArrayList<Dish>();
        for(int i = 0; i < n; i++){
            long a = sc.nextLong();
            long b = sc.nextLong();
            li.add(new Dish(a,b,i));
        }
        Collections.sort(li);
        long ans = 0;
        for(int i = 0; i < n; i++){
            Dish d = li.get(i);
            if(i % 2 == 0){
                ans += d.a;
            }else{
                ans -= d.b;
            }
        }
        System.out.println(ans);
    }
}
class Dish implements Comparable<Dish>{
    int i;
    long a,b,diff;
    public Dish(long a,long b,int i){
        this.a = a;
        this.b = b;
        this.diff = b+a;
        this.i = i;
    }
    
    public int compareTo(Dish d){
        if(this.diff > d.diff){
            return -1;
        }else if(this.diff < d.diff){
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
