import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[][] used;
    static int[] ans;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Drink> li = new ArrayList<>();
        for(int i = 0; i < n; i++){
            li.add(new Drink(sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(li);
        long ans = 0;
        for(Drink d : li){
            int y = d.y;
            int dm = d.m;
            if(m <= dm){
                ans += (long)y*m;
                break;
            }else{
                ans += (long)y*dm;
                m -= dm;
            }
        }
        System.out.println(ans);
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
