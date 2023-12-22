import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] xl = new long[n];
        long[] yl = new long[n];
        ArrayList<Point> pl = new ArrayList<>();
        for(int i = 0; i < n; i++){
            long x = sc.nextLong();
            long y = sc.nextLong();
            xl[i] = x;
            yl[i] = y;
            pl.add(new Point(x,y));
        }
        Arrays.sort(xl);
        Arrays.sort(yl);
        long ans = Long.MAX_VALUE;
        for(int i = 0; i < n; i++){
            for(int i2 = i+1; i2 < n; i2++){
                for(int j = 0; j < n; j++){
                    for(int j2 = j+1; j2 < n; j2++){
                        long lx = xl[i];
                        long rx = xl[i2];
                        long ly = yl[j];
                        long ry = yl[j2];
                        long S = Math.abs(rx-lx)*Math.abs(ry-ly);
                        if(ans <= S){
                            continue;
                        }
                        int cnt = 0;
                        for(int m = 0; m < n; m++){
                            Point p = pl.get(m);
                            if(lx <= p.x && p.x <= rx && ly <= p.y && p.y <= ry) cnt++;   
                        }
                        if(cnt >= k){
                            ans = S;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
    
}

class Point{
    long x,y;
    public Point(long x, long y){
        this.x = x;
        this.y = y;
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
