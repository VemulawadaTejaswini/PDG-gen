import java.util.Scanner;

public class Main{
    private static final int MOD = 1000000007;

    public static void main(String[] args){
        long[] fac = new long[8000];
        long[] inv = new long[8000];
        long[] fiv = new long[8000];
        fac[0]=fac[1]=fiv[0]=fiv[1]=inv[1]=1;
        for(int i=2;i<8000;i++){
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
            fiv[i] = fiv[i - 1] * inv[i] % MOD;
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[][] p = new int[4002][4002];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            p[2001-a[i]][2001-b[i]]++;
        }
        for(int i=1;i<4002;i++)for(int j=1;j<4002;j++){
            p[i][j]+=p[i-1][j]+p[i][j-1];
            p[i][j]%=MOD;
        }
        long ans = 0L;
        for(int i=0;i<n;i++){
            ans+=(long)p[2001+a[i]][2001+b[i]];
            ans%=MOD;
        }
        long dbl = 0L;
        for(int i=0;i<n;i++){
            dbl+=(fac[2*a[i]+2*b[i]])*(fiv[2*a[i]]*fiv[2*b[i]]%MOD)%MOD;
        }
        System.out.println(((ans-dbl)%MOD)*500000004%MOD);
    }
}