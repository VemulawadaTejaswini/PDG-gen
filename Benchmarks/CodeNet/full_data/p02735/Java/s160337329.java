//
import java.math.*;
import java.util.*;
import java.io.*;
  
public class Main { 
  
    static BufferedReader in;
    static PrintWriter out = new PrintWriter(System.out);
    static String file = "../in";
    static int test = 10; // 0 for local testing, 1 for std input
    static int inf = 1 << 30, mod = 1_000_000_007;

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
        if(test < 0) {String[] str = in.readLine().split(" ");}
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
        // System.out.println((-100 + 0) / 2);

        new Main().a();
        out.flush();
    }

    void a() throws Exception
    {
        int[] ary = toIntArray();
        int h = ary[0], w = ary[1];
        char[][] grid = new char[h][w];
        // from 0 0 to [h - 1, w - 1]

        for(int i = 0; i < h; i++)
        {
            grid[i] = in.readLine().toCharArray();
        }

        int[][] dp = new int[h + 1][w + 1];

        for(int[] dd : dp) Arrays.fill(dd, 1 << 20);

        for(int i = 0; i < h; i++)
        {
            for(int j = 0; j < w; j++)
            {
                if(i == 0 && j == 0)
                {
                    if(grid[i][j] == '#') dp[1][1] = 1;
                    else dp[1][1] = 0;
                    continue;
                }

                if(grid[i][j] == '#')
                {
                    if(i - 1 >= 0)
                    {
                        if(grid[i - 1][j] == '#') 
                            dp[i + 1][j + 1] = Math.min(dp[i + 1][j + 1], dp[i][j + 1]);
                        else
                            dp[i + 1][j + 1] = Math.min(dp[i + 1][j + 1], dp[i][j + 1] + 1);
                    }
                    else
                    {
                        dp[i + 1][j + 1] = dp[i + 1][j];
                        if(grid[i][j - 1] == '.') dp[i + 1][j + 1]++;                            
                    }
                    if(j - 1 >= 0)
                    {
                        if(grid[i][j - 1] == '#') 
                            dp[i + 1][j + 1] = Math.min(dp[i + 1][j + 1], dp[i + 1][j]);
                        else
                            dp[i + 1][j + 1] = Math.min(dp[i + 1][j + 1], dp[i + 1][j] + 1);   
                    }
                    else
                    {
                        dp[i + 1][j + 1] = dp[i][j + 1];
                        if(grid[i - 1][j] == '.') dp[i + 1][j + 1]++;
                    }
                }
                 else
                {
                    dp[i + 1][j + 1] = Math.min(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        out.println(dp[h][w]);        
    }

}