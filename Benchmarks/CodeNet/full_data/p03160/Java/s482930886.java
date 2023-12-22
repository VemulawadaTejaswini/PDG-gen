package Educational_DP_Contest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] node = new int[num];
        int[] dp = new int[num];
        for (int i = 0; i < num; i++){
            node[i] = sc.nextInt();
        }
        //すべて無限大で初期化
        for (int i = 0; i < num; i++){
            dp[i] = 2147483647;
        }
        dp[0] = 0;
        for (int i = 1; i < num; i++){
            int a = dp[i - 1] + Math.abs(node[i] - node[i - 1]);
            if (dp[i] > a)
                dp[i] = a;
            if (i > 1){
                int b = dp[i - 2] + Math.abs(node[i] - node[i - 2]);
                if (dp[i] > b)
                    dp[i] = b;
            }
        }
        System.out.println(dp[num - 1]);

    }
}
