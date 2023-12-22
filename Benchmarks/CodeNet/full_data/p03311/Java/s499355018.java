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
        int[] ary = toIntArray();

        for(int i = 0; i < n; i++) ary[i] -= i;

        // need to find some B that's optimal - minimum
        // there must be a concavity somewhere
        // b lies within range ary[0] to ary[n - 1]
        // quite likely it's one of the points - medium

        Arrays.sort(ary);

        long sum = 0;

        int b = ary[n / 2];

        // if(n % 2 == 0) b = ary[n / 2];
        // else b = (ary[n / 2] + ary[(n + 1) / 2]) / 2;
        for(int i = 0;  i < n; i++)
        {
            sum += Math.abs(ary[i] - b);
        }
        out.println(sum);
    }
}