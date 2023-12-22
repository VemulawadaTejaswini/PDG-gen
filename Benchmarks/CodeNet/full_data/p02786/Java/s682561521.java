import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long[] dp = new long[50];
        for (int i=0;i<49;i++) {
            dp[i+1] = dp[i]+(1L<<i);
            if (H<=(1L<<i)-1) {
                System.out.println(dp[i]);
                break;
            }
        }
    }
}