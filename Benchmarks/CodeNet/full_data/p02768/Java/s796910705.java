import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        final int mod = 1000000007;

        long val = modularExponentiation(n, mod);

        long val1 = ncr(n, a, mod);
        long val2 = ncr(n, b, mod);

        long ans = val - val1 - val2 - 1;

        ans += mod;
        ans %= mod;

        pw.println(ans);


        
        
        
        
        
        
        
        pw.flush();
        pw.close();
    }

    static long modularExponentiation(long n, int mod) {
        if(n == 1) return 2;
        long val = modularExponentiation(n/2, mod);
        val *= val;
        val %= mod;
        if(n%2==1) {
            val *= 2;
            val %= mod;
        }
        return val;
    }

    static long ncr(int n, int r, int mod) {
        if(r > n-r) {
            r = n-r;
        }

        long prod = 1;
        for(int i=1 ; i<=r ; i++) {
            int cn = n - r + i;
            prod *= cn;
            prod %= mod;

            prod *= modInverse(i, mod);
            prod %= mod;
        }

        return prod;
    }

    static int modInverse(int a, int m) {
        int m0 = m;
        int y = 0, x = 1;
        if (m == 1) return 0;
        while(a > 1) {
            int q = a / m;
            int t = m;
            m = a % m;
            a = t;
            t = y;
            y = x - q * y;
            x = t;
        }
        if (x < 0) x += m0;
        return x;
    }
}
