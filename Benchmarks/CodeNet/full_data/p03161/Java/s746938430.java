import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N+1000];
        int[] memo = new int[N+1000];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            memo[i]=-1;
        }

//        int[] dp = new int[N+1000];
//        for (int i = 0; i <dp.length ; i++) {
//            dp[i] = Integer.MAX_VALUE;
//        }
//        dp[1] = 0;
//        for (int i = 2; i <= N ; i++) {
//            for (int j = Math.max(1,i-K) ; j <= i-1 ; j++) {
//                int val  =Math.min(dp[i], dp[j] +Math.abs(arr[j-1]-arr[i-1]));
//                dp[i] = val;
//            }
//        }
//        System.out.println(dp[N]);
        System.out.println(recur(arr,memo,K,N-1));

    }

    static public int recur(int[] arr,int[] memo,int K, int idx){
        if(memo[idx]!=-1) return memo[idx];
        if(idx <=0){
            return 0;
        }

        int min = Integer.MAX_VALUE;
        for (int i = Math.max(0,idx-K); i <= idx-1; i++) {
            min = Math.min(min, recur(arr,memo,K,i) + Math.abs(arr[idx] - arr[i]));
        }

        memo[idx] =min;
        return min;
    }


}
