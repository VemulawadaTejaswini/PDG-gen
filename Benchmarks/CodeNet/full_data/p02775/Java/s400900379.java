import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int len = n.length();

        String[] arr = new String[len];
        for (int i=0; i<len; i++) arr[i] = n.substring(i, i+1);

        long[][] dp = new long[len+1][2];
//        long[] dpPay = new long[len];
//        long[] dpChange = new long[len];
        dp[0][0] = 0;
        dp[0][1] = 1;

//        dp[0][0] = Integer.parseInt(arr[0]);
//        dp[0][1] = (Integer.parseInt(arr[0])+1)==10 ? 1 : Integer.parseInt(arr[0])+1;

//        System.out.println(dp[0][0]);
//        System.out.println(dp[0][1]);

//        if (Integer.parseInt(arr[0])<=5){
//            dpSum[0] = Integer.parseInt(arr[0]);
//        }else if (6<=Integer.parseInt(arr[0])){
//            dpSum[0] = 11 - Integer.parseInt(arr[0]);
//        }

//        System.out.println(dpSum[0]);

        for (int i=1; i<len+1; i++){
            int tmp = Integer.parseInt(arr[i-1]);

            dp[i][0] = Math.min(dp[i-1][0]+tmp, dp[i-1][1]+10-tmp);
            dp[i][1] = Math.min(dp[i-1][0]+tmp+1, dp[i-1][1]+9-tmp);
        }

        System.out.println(dp[len][0]);
//        System.out.println(dpSum[len-1]);
    }
}
