import java.util.*;

public class Main {
    public static void main(String[] args) {
        int mod = 1000000007;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        long[] a0 = new long[x];
        long[] b0 = new long[y];
        long[] c0 = new long[z];
        for (int i=0;i<x;i++) a0[i] = sc.nextLong();
        for (int i=0;i<y;i++) b0[i] = sc.nextLong();
        for (int i=0;i<z;i++) c0[i] = sc.nextLong();
        Arrays.sort(a0);
        Arrays.sort(b0);
        Arrays.sort(c0);
        long[] a = new long[x];
        long[] b = new long[y];
        long[] c = new long[z];
        for (int i=0;i<x;i++) a[i] = a0[x-1-i];
        for (int i=0;i<y;i++) b[i] = b0[y-1-i];
        for (int i=0;i<z;i++) c[i] = c0[z-1-i];
        int kx = Math.min(x,k);
        int ky = Math.min(y,k);
        int kz = Math.min(z,k);
        long[] ab0 = new long[kx*ky];
        long[] ab = new long[kx*ky];
        int index = 0;
        for(int i=0;i<kx;i++) {
            for(int j=0;j<ky;j++) {
                ab0[index] = a[i]+b[j];
                index++;
            }
        }
        Arrays.sort(ab0);
        for(int i=0;i<kx*ky;i++) ab[i] = ab0[kx*ky-1-i];
        int kxy = Math.min(k,kx*ky);
        long[] abc0 = new long[kxy * kz];
        index = 0;
        for(int i=0;i<kxy;i++) {
            for(int j=0;j<kz;j++) {
                abc0[index] = ab[i] + c[j];
                index++;
            }
        }
        Arrays.sort(abc0);
        for(int i=0;i<k;i++) {
            System.out.println(abc0[kxy*kz-1-i]);
        }
    }
    public static int modPow(int value,int exponent,int mod) {
        if (exponent == 0) return(1);
        if (exponent == 1) return(value%mod);
        long longValue = (long) value;
        int res = exponent%2;
        int q = exponent/2;
        long answer = 1;
        if(res == 1) answer *= longValue;
        longValue *= longValue;
        longValue %= mod;
        answer = (answer * ((long) modPow((int) longValue, q, mod)))%mod;
        return((int) answer);
    }
}   