//
import java.math.*;
import java.util.*;
import java.io.*;
  
public class Main { 
  
    static BufferedReader in;
    static PrintWriter out = new PrintWriter(System.out);
    static String file = "../in";
    static int test = 10; // 0 for local testing, 1 for std input
    static int inf = 1_000_000, mod = 1_000_000_007;



    void swap(int[]ary, int i, int j)
    {
        int t = ary[i];
        ary[i] = ary[j];
        ary[j] = t;
    }
    
    String[] split() throws Exception
    {
        return in.readLine().split(" ");
    }

    int readInt() throws Exception
    {
        return Integer.valueOf(in.readLine());
    }

    long[] toLongArray() throws Exception
    {
        String[] sp = split();
        int n = sp.length;
        long[] ary = new long[n];
        for(int i = 0; i < n; i++) ary[i] = Long.valueOf(sp[i]);
        return ary;
    }

    int[] toIntArray() throws Exception
    {
        String[] sp = split();
        int n = sp.length;
        int[] ary = new int[n];
        for(int i = 0; i < n; i++) ary[i] = Integer.valueOf(sp[i]);
        return ary;
    }

    String reverse(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }


    long pow(long a, int pow)
    {
        long res = 1;
        while(pow > 0)
        {
            if(pow % 2 != 0) {
                res *= a;
                res %= mod;
            }
            a = a * a;
            a %= mod;
            pow /= 2;
        }

        return res;
    }

    public static void main(String[] args) throws Exception
    {
        int _k = Integer.valueOf("1");
        if(test > 0) in = new BufferedReader(new InputStreamReader(System.in));
        else in = new BufferedReader(new FileReader(file));
        if(test < 0) {String[] str = in.readLine().split(" ");
        char[] gg = in.readLine().toCharArray();}
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
        // System.out.println((-100 + 0) / 2);

        
        new Main().c();
        out.flush();
    }

    void e() throws Exception
    {
        int[] ary = toIntArray();
        int x = ary[0], y = ary[1], a = ary[2], b = ary[3], c = ary[4];

        int[] red = toIntArray(), green = toIntArray(), white = toIntArray();

        Arrays.sort(red);
        Arrays.sort(green);
        Arrays.sort(white);

        long redHP = 0, greenHP = 0;
        Queue<Integer> rstack = new PriorityQueue<>(), gstack = new PriorityQueue<>();
        
        for(int i = 0; i < x; i++)
        {
            redHP += red[a - 1 - i];
            rstack.offer(red[a - 1 - i]);
        }
        for(int i = 0; i < y; i++)
        {
            greenHP += green[b - 1 - i];
            gstack.offer(green[b - 1 - i]);
        }

        // now try to pop the smallest one and add in the biggest one
        // System.out.printf("%d %d\n", redHP, greenHP);

        int widx = c - 1;
        int inf = 1 << 30;
        while(widx >= 0)
        {

            int minRed = rstack.isEmpty() ? inf : rstack.peek(), 
                minGreen = gstack.isEmpty() ? inf : gstack.peek();
            
            int curWhite = white[widx];
            if(minRed >= curWhite && minGreen >= curWhite) break;
            if(minRed < minGreen)
            {
                redHP -= minRed;
                rstack.poll();
                redHP += curWhite;
            }
            else
            {
                greenHP -= minGreen;
                gstack.poll();
                greenHP += curWhite;
            }
            widx--;
        }
        out.println(redHP + greenHP);
    }

    void d() throws Exception
    {
        int[] ary = toIntArray();
        int n = ary[0], x = ary[1], y = ary[2];
        int[][] f = new int[n + 1][n + 1];
        
        for(int[] ff : f) Arrays.fill(ff, n + 1);

        // bfs
        int[][] edge = new int[n + 1][];
        
        
        edge[1] = new int[]{2};
        if(x == 1) edge[1] = new int[]{2, y};

        for(int i = 2; i < n; i++)
        {
            edge[i] = new int[]{i - 1, i + 1};
            if(i == x)
            {
                edge[i] = new int[]{i - 1, i + 1, y};
            }
            if(i == y)
            {
                edge[i] = new int[]{i - 1, i + 1, x};
            }
        }

        edge[n] = new int[]{n - 1};
        if(y == n) edge[n] = new int[]{n - 1, x};

        // edge[x] = new int[]{edge[x][0], y};
        // edge[y] = new int[]{edge[y][0], x};

        for(int i = 1; i <= n; i++)
        {
            bfs(i, f, edge);
        }

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 1; i <= n; i++)
        {
            for(int j = i + 1; j <= n; j++)
            {
                map.put(f[i][j], map.getOrDefault(f[i][j], 0) + 1);
            }
        }

        // for(int[] ff : f) System.out.println(Arrays.toString(ff));

        for(int i = 1; i < n; i++)
        {
            out.println(map.getOrDefault(i, 0));
        }
    }

    void bfs(int cur, int[][] f, int[][] edge)
    {
        Queue<Integer> q = new LinkedList<>();
        q.offer(cur);
        
        int dist = 1;
        boolean[] vis = new boolean[f.length];

        while(!q.isEmpty())
        {
            int size = q.size();
            while(size-- > 0)
            {
                int from = q.poll();
                vis[from] = true;
                for(int to : edge[from])
                {

                    if(f[cur][to] <= dist) continue;
                    f[cur][to] = dist;
                    // if(vis[to]) continue;
                    q.offer(to);
                }
            }
            dist++;
        }
    }



    void c() throws Exception
    {
        long[] ary = toLongArray();
        long n = ary[0], k = ary[1];
        n %= k;
        long n1 = n, n2 = Math.abs(n - k);
        // System.out.println(n1);
        // System.out.println(n2);
        out.println(Math.min(n1, n2));
    }

    void b() throws Exception
    {
        int[] ary = toIntArray();
        int n = ary[0], m = ary[1];
        ary = toIntArray();
        int total = 0;
        for(int vote : ary) total += vote;
        Arrays.sort(ary);

        boolean flag = true;
        
        for(int i = n - 1; i >= n - m; i--)
        {
            int v = ary[i];
            if(v * 4 * m < total) flag = false;
        }
        if(flag) out.println("Yes");
        else out.println("No");
    }

    void a() throws Exception
    {
        int[] ary = toIntArray();
        System.out.printf("%d %d %d", ary[2], ary[0], ary[1]);
    }
}