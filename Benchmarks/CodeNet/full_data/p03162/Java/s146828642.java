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