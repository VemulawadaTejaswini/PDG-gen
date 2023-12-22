import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static int MOD = (int)1e9+7;
    static int n = sc.nextInt();
    static int a = sc.nextInt();
    static int b = sc.nextInt();
//    static long[] facts = new long[n];

    public static void main(String[] args) {
//        facts = new long[n+1];
//        facts[0] = 1;

//        long[] comb = new long[n+2];
//        comb[0] = 1;

//        long comb = 1;

//        long comA = 0;
//        long comB = 0;


//        for (int i=1; i<=b; i++){
//            comb = ((comb*(n-i+1))/i)%MOD;
////            if (i==a) comA = comb;
//            if (i==a) comA = comb;
////            if (i==b) comB = comb;
//            if (i==b) comB = comb;
////            ans += comb%MOD;
////            ans %= MOD;
//
//        }

//        long comA = comb[a];
//        System.out.println(comA%MOD);

//        long comB = comb[b];
//        System.out.println(comB%MOD);
//        for (int i=1; i<n+1; i++){
//            facts[i] = facts[i-1]*i%MOD;
//        }
//        long comA = nck(n, a);
//        long comB = nck(n, b);

//        System.out.println(comA);
//        System.out.println(comB);

        long sum = modpow(2, n);
//        System.out.println(sum);

        long comA = nck(n, a);
        long comB = nck(n, b);

        long ans = sum-comA-comB-1+MOD*2;

        System.out.println(ans%MOD);

//        System.out.print(((ans)+MOD*2)%MOD);


    }

    public static long modpow(long a, long b){  // 計算量はlog(MOD);
        if (b==0) return 1;
        else if (b==1) return a;
        long x = modpow(a, b/2);
        return b%2==0 ? x*x%MOD : x*(x*a%MOD)%MOD;
    }
    public static long inv(long n){ // 逆元。x^(-1)≡x^(p-2) (MOD p)
        return modpow(n, MOD-2);
    }
    public static long nck(int n, int k){
        long res = 1;
        for (int i=0; i<k; i++){
            res = (res*(n-i))%MOD;
            res = (res*inv(i+1))%MOD;
        }
        return res;
    }

}
