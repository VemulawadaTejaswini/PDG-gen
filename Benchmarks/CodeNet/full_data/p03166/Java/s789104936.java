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

        
        new Main().g();
        out.flush();
    }

    void g() throws Exception
    {
        int[] ary = toIntArray();
        int n = ary[0], m = ary[1];
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 1; i <= n; i++)
        {
            map.put(i, new ArrayList<>());
        }

        int[] depth = new int[n + 1];
        while(m-- > 0)
        {
            ary = toIntArray();
            int from = ary[0], to = ary[1];
            map.get(from).add(to);
        }

        int len = 0;

        for(int i = 1; i <= n; i++)
        {
            if(depth[i] == 0)
            {
                len = Math.max(len, dfs(i, map, depth));
            }
        }
        // System.out.println(Arrays.toString(depth));
        out.println(len - 1);
    }

    int dfs(int cur, Map<Integer, List<Integer>> map, int[] f)
    {
        if(f[cur] > 0) return f[cur];
        int ans = 1;
        for(int next : map.get(cur))
        {
            ans = Math.max(ans, 1 + dfs(next, map, f));
        }
        return f[cur] = ans;
    }

    void f() throws Exception
    {
        String a = in.readLine(), b = in.readLine();
        int m = a.length(), n = b.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(a.charAt(i) == b.charAt(j))
                {
                    dp[i + 1][j + 1] = 1 + dp[i][j];
                }
                else
                {
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }


        int i = m - 1, j = n - 1;
        String str = "";

        while(i >= 0 && j >= 0)
        {
            if(a.charAt(i) == b.charAt(j))
            {
                str = a.charAt(i) + str;
                i--;
                j--;
            }
            else
            {
                if(dp[i + 1][j + 1] == dp[i + 1][j])
                {
                    j--;
                }
                else
                {
                    i--;    
                }
            }
        }
        out.println(str);
    }    

    void e() throws Exception
    {
        int[] ary = toIntArray();
        int n = ary[0], w = ary[1];
        long[] f = new long[100010];
        // find biggest value with least cost?
        Arrays.fill(f, 1000_000_010);
        f[0] = 0;
        while(n-- > 0)
        {
            ary = toIntArray();
            int cost = ary[0], value = ary[1];
            for(int j = 100000; j >= value; j--)
            {
                f[j] = Math.min(f[j], f[j - value] + cost);
            }
        }
        for(int i = 100000; i >= 0; i--)
        {
            if(f[i] <= w)
            {
                out.println(i);
                return;
            }
        }
    }    

    void d() throws Exception
    {
        int[] ary = toIntArray();
        int n = ary[0], w = ary[1];
        long[] f = new long[w + 1];
        while(n-- > 0)
        {
            ary = toIntArray();
            int cost = ary[0], value = ary[1];
            for(int j = w; j >= cost; j--)
            {
                f[j] = Math.max(f[j], f[j - cost] + value);
                // System.out.printf("%d %d\n", j, f[j - cost] + value);
            }
            
            // System.out.println(Arrays.toString(f));
        }
        


        System.out.println(f[w]);
    }

    void c() throws Exception
    {
        int n = readInt();
        int[] f = new int[3];
        for(int i = 0; i < n; i++)
        {
            int[] ary = toIntArray();
            ary[0] += Math.max(f[1], f[2]);
            ary[1] += Math.max(f[0], f[2]);
            ary[2] += Math.max(f[1], f[0]);
            f = ary;
        }
        System.out.println(Math.max(Math.max(f[0], f[1]), f[2]));
    }

    void b() throws Exception
    {
        int[] ary = toIntArray();
        int n = ary[0], k = ary[1];
        ary = toIntArray();
        int[] cost = new int[n];
        Arrays.fill(cost, 1 << 30);
        cost[0] = 0;
        for(int i = 1; i < n; i++)
        {
            for(int j = 1; j <= k; j++)
            {
                if(i - j < 0) break;
                cost[i] = Math.min(cost[i], cost[i - j] + Math.abs(ary[i] - ary[i - j]));
            }
        }
        
        // System.out.println(Arrays.toString(cost));

        System.out.println(cost[n - 1]);
    }

    void a() throws Exception
    {
        int n = readInt();
        int[] ary = toIntArray();
        int[] cost = new int[n];
        cost[1] = Math.abs(ary[1] - ary[0]);
        for(int i = 2; i < n; i++)
        {
            cost[i] = Math.min(cost[i - 1] + Math.abs(ary[i] - ary[i - 1]), 
                                cost[i - 2] + Math.abs(ary[i] - ary[i - 2]));
        }
        
        // System.out.println(Arrays.toString(cost));

        System.out.println(cost[n - 1]);
    }
}