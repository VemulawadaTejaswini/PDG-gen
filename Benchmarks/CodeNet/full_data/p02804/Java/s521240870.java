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

        new Main().e();

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
        int mod = 1_000_000_007;
        long sum = 0;

        int[] f = new int[1_00_010];
        f[0] = 1;
        for(int i = 1; i <= 100_000; i++)
        {
            f[i] = f[i - 1] * i % mod; 
        }
 
        for(int i = 0; i < n; i++)
        {
            long f1 = comb(i, k - 1, f, mod);
            long f2 = comb(n - 1 - i, k - 1, f, mod);
            // System.out.printf("%d %d %d\n", f1, f2, ary[i]);
            sum = (sum + f1 * ary[i]) % mod;
            sum = (sum - f2 * ary[i]) % mod;
        }
 
        System.out.println(sum % mod);
    }

    long comb(int n, int m, int[] f, int mod)
    {
        // n choose m
        if(n == 0 || n < m) return 0;
        if(m == 0) return 1;
        // C(n, m) % p = n! % p * (m! ^(phi(p) - 1) * ((n - m)! ^(phi(p) - 1))
        return (f[n] * pow((f[m] * f[n - m]) % mod, mod - 2, mod)) % mod;
    }

    long pow(long a, int b, int mod)
    {
        long re = 1;
        while(b > 0)
        {
            if(b % 2 != 0) re = (re * a) % mod;
            a = (a * a) % mod;
            b /= 2;
        }

        return re;
    }
}