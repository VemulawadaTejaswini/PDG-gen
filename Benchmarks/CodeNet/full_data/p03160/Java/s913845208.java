
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int num = sc.nextInt();
    static int[] h = new int[num];
    static int[] dp = new int[num];

    public static void main(String[] args) {
        for (int i = 0; i < num; i++){
            h[i] = sc.nextInt();
            dp[i] = 2147483647;
        }
        System.out.println(check(num - 1));
    }
    public static int check(int i){
        if(dp[i] < 2147483647)
            return dp[i];
        if (i == 0)
            return 0;
        if (i == 1)
            return Math.abs(h[1] - h[0]);
        dp[i] = chmin(check(i - 1) + Math.abs(h[i] - h[i - 1]), check(i - 2) + Math.abs(h[i] - h[i - 2]));
        return dp[i];
    }
    public static int chmin(int a, int b){
        if(a > b){
            return b;
        }else{
            return a;
        }
    }
}
