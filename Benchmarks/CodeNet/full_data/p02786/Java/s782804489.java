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

        new Main().d();

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
                if(sq <= dx * dx + dy * dy) return false;    
            }
            
        }
        return true;
    }

    void e() throws Exception
    {
        int n = Integer.valueOf(in.readLine());
        String[] sp = in.readLine().split(" ");
        // gcd , lcm
        // gcd = gcd(a, b)
        // lcm = a * b / gcd
        
        int mod = 1_000_000_007;
        int[] ary = new int[n];
        for(int i = 0; i < n; i++) 
        {
            ary[i] = Integer.valueOf(sp[i]);
        }
        Arrays.sort(ary);

        long gcd = 1, lcm = (long) ary[0];
        for(int i = 1; i < n; i++)
        {
            long a = lcm;
            long b = (long)ary[i];
            long g = gcd(a, b);
 
            lcm = a * b / g;
        }
 
        long sum = 0;
 
        for(int i = 0; i < n; i++)
        {  
            sum = (sum + lcm / ary[i]) % mod;
        }
         
        System.out.println(sum % mod);
    }

    // boolean isPrime(int k, int[] p, int idx)
    // {
    //     if(k < 2) return false;
    //     if(k < 4) return true;
    //     if(k % 2 == 0) return false;
    //     for(int i = 0; i < idx; i++)
    //     {
    //         if(k % p[i] == 0) return false;
    //     }
    //     return true;
    // }

    // long pow(int a, int b)
    // {
    //     if(b == 0) return 1;
    //     if(b == 1) return a;
    //     long pp = pow(a, b / 2);
    //     pp *= pp;
    //     if(b % 2 != 0) return pp * a;
    //     return pp;
    // }

    long gcd(long a, long b)
    {
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    void d() throws Exception
    {
        long h = Long.valueOf(in.readLine());

        // binary heap style
        //
        long count = 1;
        long sum = 0;
        while(h > 0)
        {
            h /= 2;
            sum += count;
            count *= 2;
        }
        System.out.println(sum);
    }
    
    boolean satisfy(int a, int b)
    {
        String s1 = String.valueOf(a),
                s2 = String.valueOf(b);
        int m = s1.length(), n = s2.length();
        if(s1.charAt(0) == s2.charAt(n - 1) && 
            s1.charAt(m - 1) == s2.charAt(0)) return true;
        return false;
    }

    void c() throws Exception
    {
        String[] sp = in.readLine().split(" ");
        int n = Integer.valueOf(sp[0]),
            k = Integer.valueOf(sp[1]);
        int[] ary = new int[n];
        sp = in.readLine().split(" ");
        for(int i = 0; i < n; i++)
        {
            ary[i] = Integer.valueOf(sp[i]);
        }

        Arrays.sort(ary);
        // use spec on k highest

        long sum = 0;
        for(int i = 0; i < n - k; i++) sum += ary[i];
        
        System.out.println(sum);
        
    }
    void b() throws Exception
    {
        String[] sp = in.readLine().split(" ");
        int h = Integer.valueOf(sp[0]),
            n = Integer.valueOf(sp[1]);
        sp = in.readLine().split(" ");
        for(int i = 0; i < n; i++)
        {
            h -= Integer.valueOf(sp[i]);
        }
        if(h <= 0) System.out.println("Yes");
        else System.out.println("No");
    }

    void a() throws Exception
    {
        String[] sp = in.readLine().split(" ");
        int h = Integer.valueOf(sp[0]),
            a = Integer.valueOf(sp[1]);
        int r = 0;
        while(h > 0)
        {
            h -= a;
            r++;
        }
        System.out.println(r);
    }
}