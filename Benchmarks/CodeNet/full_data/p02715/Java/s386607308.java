import java.util.*;

public class Main {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//
//        for (int i = 0; i <N ; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        if(N%2==0){
//            long ans1 =0;
//            for (int i = 0; i < N ; i=i+2) {
//                ans1+=arr[i];
//            }
//            long ans2 =0;
//            for (int i = 1; i < N ; i=i+2) {
//                ans2+=arr[i];
//            }
//            System.out.println(Math.max(ans1,ans2));
//
//        }else{
//
//            long ans = Integer.MIN_VALUE;
//            for (int j = 0; j < N; j++) {
//
//                long ans1 =0;
//                for (int i = 0; i < N ; i=i+2) {
//                    if(i==j){
//                        i++;
//                        if(i>=N) break;
//                    }
//                    ans1+=arr[i];
//                }
//                long ans2 =0;
//                for (int i = 1; i < N ; i=i+2) {
//                    if(i==j){
//                        i++;
//                        if(i>=N) break;
//                    }
//                    ans2+=arr[i];
//                }
//
//                ans = Math.max(ans,Math.max(ans1,ans2));
//
//            }
//            System.out.println(ans);
//
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        long[] gcdArr = new long[K+1];

        for (int g = K ; g>=1 ; --g){
            gcdArr[g] = (long)mpow(K/g, N);
            int gg= g *2;
            while(gg <=K){
                gcdArr[g] -=gcdArr[gg];

                gg += g;
            }
        }

        long ans =0;

        for (int i = 1; i <= K; i++) {
            ans += gcdArr[i] * i;
            ans = (ans) % 1000000007;
        }

        System.out.println(ans % 1000000007);

    }
    static final int MOD = 1_000_000_007;
    static long mpow(long a, long b) {
        if (b == 0) return 1;
        long ret = mpow(a, b >> 1);
        ret = (ret * ret) % MOD;
        if (b % 2 == 1)
            ret = (a * ret) % MOD;
        return ret;
    }

}
