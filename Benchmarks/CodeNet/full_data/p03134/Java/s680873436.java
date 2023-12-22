import java.util.*;

public class Main {
    static final long DIV = 998244353L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int num0 = 0, num1 = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '0'){
                num0+= 2;
            }else if(s.charAt(i) == '1'){
                num0++;
                num1++;
            }else{
                num1 += 2;
            }
        }

        long[] fac = new long[2100];
        fac[0] = 1;
        fac[1] = 1;
        for(int i=2; i<2100; i++){
            fac[i] = fac[i-1] * i;
            fac[i] %= DIV;
        }

        long[] ifac = new long[2100];
        for(int i=0; i<2100; i++) ifac[i] = inverseElement(fac[i], DIV);

        long ans = caluComb(num0, num1, DIV, fac, ifac);

        int cnum0 = 0, cnum1 = 0;
        long p0 = 1, p1 = 1;
        for(int i=0; i<n; i++){
            char t = s.charAt(i);
            if(t == '1'){
                cnum0++;
                cnum1++;
                continue;
            }
            if(t == '0'){
                if(cnum1 >= i+1) continue;
                ans -= p1 * caluComb(num0-(i-cnum1-1), num1-cnum1, DIV, fac, ifac);
                if(ans < 0){
                    ans += DIV*DIV;
                    ans %= DIV;
                }
                cnum0 += 2;
                p1 *= (i+2);
            }else{
                if(cnum0 >= i+1) continue;
                ans -= p0 * caluComb(num1-(i-cnum0-1), num0-cnum0, DIV, fac, ifac);
                if(ans < 0){
                    ans += DIV*DIV;
                    ans %= DIV;
                }
                cnum1 += 2;
                p0 *= (i+2);
            }
        }

        System.out.println(ans);
    }

    public static long caluComb(int a, int b, long div, long[] fac, long[] ifac){
        long ret = fac[a+b];
        ret %= DIV;
        ret *= ifac[a];
        ret %= DIV;
        ret *= ifac[b];
        ret %= DIV;
        return ret;
    }

    public static long inverseElement(long a, long n){
        long b = n, u=1, v=0;
        while(b > 0) {
            long t = a/b;
            a -= t*b;
            u -= t*v;
            //swap
            t = a;
            a = b;
            b = t;
            t = u;
            u = v;
            v = t;
        }
        u = u % n;
        if(u < 0) u += n;
        return u;
    }
}