import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> li = new ArrayList<Point>();
        for(int i = 0; i < n; i++){
            li.add(new Point(sc.nextInt(),sc.nextInt(),sc.nextInt()));
        }
        for(int i = 0; i <= 100; i++){
            for(int j = 0; j <= 100; j++){
                boolean flg = true;
                Point c = li.get(0);
                int chk = Math.abs(c.x-i)+Math.abs(c.y-j)+c.h;
                for(int k = 1; k < n; k++){
                    Point p = li.get(k);
                    if(!(p.h == 0 && chk <= Math.abs(p.x-i)+Math.abs(p.y-j)) && chk != Math.abs(p.x-i)+Math.abs(p.y-j)+p.h){
                        flg = false;
                        break;
                    }
                }
                if(flg){
                    System.out.println(i+" "+j+" "+chk);
                    return;
                }
            }
        }
    }
}

class Point{
    int x,y,h;
    public Point(int x, int y, int h){
        this.x = x;
        this.y = y;
        this.h = h;
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
