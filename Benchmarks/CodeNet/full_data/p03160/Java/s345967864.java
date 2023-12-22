
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
                dp[i] = chmin(dp[i], dp[i - 1] + Math.abs(node[i] - node[i - 1]));
            if (i > 1){
                dp[i] = chmin(dp[i], dp[i - 2] + Math.abs(node[i] - node[i - 2]));            }
        }
        System.out.println(dp[num - 1]);

    }
    public static int chmin(int a, int b){
        if(a > b){
            return b;
        }else{
            return a;
        }
    }
}
