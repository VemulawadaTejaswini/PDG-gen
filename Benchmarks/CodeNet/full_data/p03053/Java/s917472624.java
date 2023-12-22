import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        boolean[][] map = new boolean[h][w];
        Deque<Point> q = new ArrayDeque<Point>();
        for(int i = 0; i < h; i++){
            String s = sc.next();
            int j = 0;
            for(char c : s.toCharArray()){
                if(c == '#'){
                    map[i][j] = true;
                    q.add(new Point(0,j,i));
                }
                j++;
            }
        }
        int ans = 0;
        int[] gx = {-1,0,0,1};
        int[] gy = {0,-1,1,0}; 
        while(q.size() > 0){
            Point p = q.poll();
            int cnt = p.cnt;
            int x = p.x;
            int y = p.y;
            for(int i = 0; i < 4; i++){
                int nx = x + gx[i];
                int ny = y + gy[i];
                if(check(nx,ny,w,h,map)){
                    map[ny][nx] = true;
                    q.add(new Point(cnt+1,nx,ny));
                }
            }
            ans = Math.max(ans,cnt);
        }
        System.out.println(ans);
    }
    
    public static boolean check(int x, int y, int w, int h, boolean[][] map){
        return (x >= 0 && x < w && y >= 0 && y < h && !map[y][x]);
    }
}

class Point{
    int cnt,x,y;
    public Point(int cnt, int x, int y){
        this.cnt = cnt;
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
