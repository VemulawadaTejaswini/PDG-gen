import java.util.*;
public class Main {
    static long MOD = (long)1e9+7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextLong();
//        Arrays.sort(arr);

        long ans = 0;

        for (int i=0; i<61; i++){
            long cnt = 0;
            for (int j=0; j<n; j++){
                if (((arr[j]>>i)&1)==1){
                    cnt++;
                }
//                ans += (cnt*(n-cnt)*((1<<i)%MOD))%MOD;
//                ans %= MOD;
//                System.out.println(cnt);
            }
            ans += ((cnt*(n-cnt))%MOD)*(((long)1<<i)%MOD)%MOD;
            ans %= MOD;

//            System.out.println(ans);
        }
//        for (int i=0; i<n; i++){
//            for (int j=0; j<100; j++) {
//                long cnt = 0;
//                if (((arr[i]>>j)&1)==1) {
//                    cnt++;
//                }
//                ans += (cnt*(n-cnt)*((1<<i)%MOD))%MOD;
//                ans %= MOD;
//            }
//        }
        System.out.println(ans);
    }
}
