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

        
        new Main().d();
        out.flush();
    }

    void d() throws Exception
    {
        int[] ary = toIntArray();
        int n = ary[0], x = ary[1], y = ary[2];
        int[][] f = new int[n + 1][n + 1];
        
        for(int[] ff : f) Arrays.fill(ff, n + 1);

        for(int i = 1; i < n; i++)
        {
            f[i][i + 1] = 1;
            f[i][i] = 0;
            f[i + 1][i] = 1;
        }

        f[n][n] = 0;
        f[x][y] = 1;
        f[y][x] = 1;

        for(int k = 1; k <= n; k++)
        {
            boolean update = false;
            for(int i = 1; i <= n; i++)
            {
                for(int j = 1; j <= n; j++)
                {
                    if(f[i][j] > f[i][k] + f[k][j])
                    {
                        f[i][j] = f[i][k] + f[k][j];
                        update = true;
                    }
                }
            }
            // if(!update) break;
        }

        // for(int[] ff : f)
        // {
        //     System.out.println(Arrays.toString(ff));
        // }

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 1; i <= n; i++)
        {
            for(int j = i + 1; j <= n; j++)
            {
                map.put(f[i][j], map.getOrDefault(f[i][j], 0) + 1);
            }
        }

        for(int i = 1; i < n; i++)
        {
            out.println(map.getOrDefault(i, 0));
        }
    }



    void c() throws Exception
    {
        int[] ary = toIntArray();
        int k = ary[0], n = ary[1];
        ary = toIntArray();
        int[] dist = new int[n];
        for(int i = 0; i < n - 1; i++)
        {
            dist[i] = ary[i + 1] - ary[i];
        }
        dist[n - 1] = ary[0] + k - ary[n - 1];
        
        int mini = k;
        
        for(int d : dist)
        {
            mini = Math.min(mini, k - d);
        }

        out.println(mini);
    }

    void b() throws Exception
    {
        int x = readInt();
        long hp = (x / 500) * 1000;
        x %= 500;
        hp += (x / 5) * 5;
        out.println(hp);
    }

    void a() throws Exception
    {
        char[] chs = in.readLine().toCharArray();
        if(chs[2] == chs[3] && chs[4] == chs[5]) 
        {
            out.println("Yes");
        }
        else out.println("No");
    }
}