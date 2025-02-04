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

    int[] toIntArray() throws Exception
    {
        String[] sp = split();
        int n = sp.length;
        int[] ary = new int[n];
        for(int i = 0; i < n; i++) ary[i] = Integer.valueOf(sp[i]);
        return ary;
    }

    long[] toLongArray() throws Exception
    {
        String[] sp = split();
        int n = sp.length;
        long[] ary = new long[n];
        for(int i = 0; i < n; i++) ary[i] = Long.valueOf(sp[i]);
        return ary;
    }

    String reverse(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }

    long choose(int n, int a)
    {
        long nf = 1;
        for(int i = 1; i <= a; i++)
        {
            nf *= i;
            nf %= mod;
            nf *= pow(i, mod - 2);
            nf %= mod;
        }
        return nf;
    }

    long pow(int a, int pow)
    {
        return pow(0L + a, pow);
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

    int gcd(int a, int b)
    {
        if(b == 0) return a;
        return gcd(b, a % b);
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

        new Main().d();
        out.flush();
    }

    void d() throws Exception
    {
        long[] ary = toLongArray();
        
        int n = (int)ary[0];
        long x = ary[1];


        long[] L = new long[65], p = new long[65];

        L[0] = 1;
        p[0] = 1;
        for(int i = 1; i <= (int) n; i++)
        {
            L[i] = 3 + 2 * L[i - 1];
            p[i] = 1 + 2 * p[i - 1];
        }

        // count layers
        // b, L[N], p, L[N], b
        System.out.println(count(L, p, x, n));
    }

    long count(long[] L, long[] P, long x, int n)
    {
        if(n == 0 && x == 1) return 1;
        if(x <= 1) return 0;
        if(x <= L[n - 1] + 1) return count(L, P, x - 1, n - 1);
        if(x == L[n - 1] + 2) return P[n - 1] + 1;
        if(x <= 2 * L[n - 1] + 2) return P[n - 1] + 1 + count(L, P, x - 2 - L[n - 1], n - 1);
        return P[n];
    }



    int find(int[] f , int p)
    {
        int fp = f[p];
        while(fp != f[fp]) fp = f[f[fp]];
        return f[p] = fp;
    }
}
