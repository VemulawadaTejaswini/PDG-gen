import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        ArrayList<rPoint> red = new ArrayList<>();
        ArrayList<bPoint> blue = new ArrayList<>();
        boolean[] useRed = new boolean[n];
        for(int i = 0; i < n; i++){
            red.add(new rPoint(sc.nextInt(),sc.nextInt()));
        }
        for(int i = 0; i < n; i++){
            blue.add(new bPoint(sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(red);
        Collections.sort(blue);
        int ans = 0;
        for(bPoint b : blue){
            for(int i = 0; i < n; i++){
                if(useRed[i]) continue;
                rPoint r = red.get(i);
                if(r.x < b.x && r.y < b.y){
                    ans++;
                    useRed[i] = true;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}

class rPoint implements Comparable<rPoint>{
    int x,y;
    public rPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int compareTo(rPoint p){
        if(this.x < p.x){
            return -1;
        }else if(this.x > p.x){
            return 1;
        }else{
            if(this.y > p.y){
                return -1;
            }else if(this.y < p.y){
                return 1;
            }
        }
        return 0;
    }
}

class bPoint implements Comparable<bPoint>{
    int x,y;
    public bPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int compareTo(bPoint p){
        if(this.y < p.y){
            return -1;
        }else if(this.y > p.y){
            return 1;
        }else{
            if(this.x < p.x){
                return -1;
            }else if(this.x > p.x){
                return 1;
            }
        }
        return 0;
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
