import java.util.*;


public class Main {
    static int MAX = 510000;
    static int MOD = 1000000007;
    static long[] fac = new long[MAX];
    static long[] finv= new long[MAX];
    static long[] inv = new long[MAX];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        COMinit();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        long ans = 0;
        for (int i=0;i<n;i++){
            long max = 0;
            long min = 0;
            if (i>=k-1)max = COM(i,k-1);
            if (i<=n-k)min = COM(n-i-1,k-1);
            ans=(ans+(max*a[i])%MOD-(min*a[i])%MOD+MOD)%MOD;
        }
        System.out.println(ans);
    }
    static void COMinit(){
        fac[0]=1;
        fac[1]=1;
        finv[0]=1;
        finv[1]=1;
        inv[1]=1;
        for (int i=2;i<MAX;i++){
            fac[i]=fac[i-1]*i%MOD;
            inv[i]=MOD-inv[MOD%i]*(MOD/i)%MOD;
            finv[i]=finv[i-1]*inv[i]%MOD;
        }
    }
    static long COM(int n, int k){
        if (n<k)return 0;
        if (n<0||k<0)return 0;
        return fac[n]*(finv[k]*finv[n-k]%MOD)%MOD;
    }
}
