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

    String reverse(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }

    long choose(int n, int a)
    {
        if(n - a < a) return choose(n, n - a);
        long fn = 1, fa = 1;
        for(int i = 1; i <= a; i++)
        {
            fn *= n - i + 1;
            fn %= mod;
            fa *= i;
            fa %= mod;
        }

        // System.out.println(fn);
        // System.out.println(fa);

        return fn * pow(fa, mod - 2) % mod;
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

        new Main().c();
        out.flush();
    }


    void c() throws Exception
    {
        int n = readInt();
        int[][] ary = new int[n][3];
        for(int i = 0; i < n; i++)
        {
            int[] a = toIntArray();
            int pa = a[0], pb = a[1], pc = pb - pa;
            ary[i] = new int[]{pa, pb, pc};
        }

        Arrays.sort(ary, (a, b)->(b[2] - a[2]));

        long sum = 0;
        int pos = 0, dir = 1;
        for(int i = 0; i < n; i++)
        {
            sum += dir * ary[i][pos];
            pos = 1 - pos;
            dir *= -1;
        }
        System.out.println(sum);
    }
}