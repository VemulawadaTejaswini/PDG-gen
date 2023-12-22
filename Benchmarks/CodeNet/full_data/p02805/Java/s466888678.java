//
import java.math.*;
import java.util.*;
import java.io.*;
  
public class Main { 
  
    static BufferedReader in;
    static String file = "../in";

    public static void main(String[] args) throws Exception
    {
        int test = 10,   // 0 for local testing, 1 for std input
            _k = Integer.valueOf("1");
        if(test > 0) in = new BufferedReader(new InputStreamReader(System.in));
        else in = new BufferedReader(new FileReader(file));
        if(test < 0) {String[] str = in.readLine().split(" ");}

        new Main().f();

    }

    void f() throws Exception
    {
        int n = Integer.valueOf(in.readLine());

        int[] x = new int[n], y = new int[n];

        for(int i = 0; i < n; i++) {
            String[] sp = in.readLine().split(" ");
            x[i] = Integer.valueOf(sp[0]);
            y[i] = Integer.valueOf(sp[1]);
        }
        // find maximum distance between any two points?

        double d = Double.MAX_VALUE;
        for(int i = 0; i < n; i++)
        {
            d = Math.min(d, rad(x, y));
        }
        System.out.println(d);
    }

    double rad(int[] x, int[] y)
    {
        double lo = 0., hi = Double.MAX_VALUE;
        double err = 0.0000001;
        while(hi - lo > err)
        {
            double m = (lo + hi) / 2.;
            if(!covers(x, y, m)) lo = m;
            else hi = m;
        }
        return lo;
    }

    boolean covers(int[] x, int[] y, double rad)
    {
        int n = x.length;
        double sq = (rad * 2) * (rad * 2);
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                int dx = x[i] - x[j], dy = y[i] - y[j];
                if(sq < dx * dx + dy * dy) return false;    
            }
            
        }
        return true;
    }

    void e() throws Exception
    {
        String[] sp = in.readLine().split(" ");
        int n = Integer.valueOf(sp[0]),
            k = Integer.valueOf(sp[1]);
        int[] ary = new int[n];
        sp = in.readLine().split(" ");    
        for(int i = 0; i < n; i++) ary[i] = Integer.valueOf(sp[i]);
        Arrays.sort(ary);
        // 
        long[] f = new long[n + 10];
        f[k - 1] = 1;

        int mod = 1_000_000_007;
        
        for(int i = k; i <= n; i++)
        {
            f[i] = (f[i - 1] * i / (i - k + 1)) % mod;
        }

        long sum = 0;

        for(int i = 0; i < n; i++)
        {
            long right = f[n - 1 - i];
            long left = f[i];
            // System.out.printf("%d %d %d\n", right, left, ary[i]);
            // sum %= mod;
            sum = (sum -right * ary[i]) % mod;
            sum = (sum + left * ary[i]) % mod;
            // sum += left * ary[i];
            // System.out.println(sum);
        }

        System.out.println(sum % mod);
    }

    void d() throws Exception
    {
        String[] sp = in.readLine().split(" ");
        int h = Integer.valueOf(sp[0]),
            w = Integer.valueOf(sp[1]);
        char[][] board = new char[h][];
        for(int i = 0; i < h; i++)
        {
            board[i] = in.readLine().toCharArray();
        }
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < h; i++)
        {
            for(int j = 0; j < w; j++)
            {
                if(board[i][j] == '.')
                    list.add(new int[]{i, j});
            }
        }

        int size = list.size();
        int dist = 0;
        for (int i = 0; i < size; i++) 
        {
            int tmp = bfs(board, list.get(i));
            // System.out.printf("%s %d\n", Arrays.toString(list.get(i)), tmp);
            dist = Math.max(dist, tmp);
        }

        System.out.println(dist);
    }
    
    int bfs(char[][] b, int[] start)
    {
        Queue<int[]> q = new LinkedList<>();
        q.offer(start);
        int[] dx = {0, 1, 0, -1}, 
                dy = {1, 0, -1, 0};
        int step = 0;
        int maxd = 0;
        int m = b.length, n = b[0].length;
        int[][] bb = new int[m][n];

        for(int[] brow : bb) Arrays.fill(brow, 410);

        while(!q.isEmpty())
        {
            int size = q.size();
            while(size-- > 0)
            {
                int[] cur = q.poll();
                int x = cur[0], y = cur[1];
                if(bb[x][y] <= step) continue;
                bb[x][y] = step;
                maxd = Math.max(maxd, step);
                for(int k = 0; k < 4; k++)
                {
                    int nx = x + dx[k],
                        ny = y + dy[k];
                    if(nx < 0 || ny < 0 || nx >= m || ny >= n || b[nx][ny] == '#') continue;
                    q.offer(new int[]{nx, ny});
                }
            }
            step++;
        }

        // for(int[] bbb : bb) System.out.printf("%s \n", Arrays.toString(bbb));
        return maxd;
    }

    void c() throws Exception
    {
        String[] sp = in.readLine().split(" ");
        int n = Integer.valueOf(sp[0]),
            m = Integer.valueOf(sp[1]);
        int[] wa = new int[n + 1];
        boolean[] ac = new boolean[n + 1];
        for(int i = 0; i < m; i++)
        {
            sp = in.readLine().split(" ");
            int q = Integer.valueOf(sp[0]);
            if(sp[1].equals("WA"))
            {
                if(!ac[q]) wa[q]++;
            }
            else
            {
                if(!ac[q]) ac[q] = true;
            }
        }
        int acount = 0, wcount = 0;
        for(int i = 1; i <= n; i++)
        {
            if(ac[i])
            {
                acount++;
                wcount += wa[i];
            }
        }
        System.out.printf("%d %d\n", acount, wcount);
        
    }
    void b() throws Exception
    {
        String[] sp = in.readLine().split(" ");
        int n = Integer.valueOf(sp[0]),
            k = Integer.valueOf(sp[1]),
            m = Integer.valueOf(sp[2]);
        sp = in.readLine().split(" ");
        int sum = m * n;
        for(int i = 0; i < n - 1; i++) {
            sum -= Integer.valueOf(sp[i]);
        }
        if(sum <= k) System.out.println(Math.max(0, sum));
        else System.out.println(-1);
    }

    void a() throws Exception
    {
        char c = in.readLine().charAt(0);
        System.out.println((char)(c + 1));
    }
}