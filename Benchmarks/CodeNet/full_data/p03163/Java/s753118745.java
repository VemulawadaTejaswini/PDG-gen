import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static long inf = 1000000000000000000l;
    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int item = scanner.nextInt();
        int maxw = scanner.nextInt();
        
        int[] weight = new int[110];
        long[] value = new long[110];
        
        for(int i = 0; i < item; i++) {
            weight[i] = scanner.nextInt();
            value[i] = scanner.nextLong();
        }
        
        long[][] dp = new long[110][100100];
        
        for(int i = 0; i < item; i++) {
            for (int sumw = 0; sumw <= maxw; sumw++) {
                if(sumw - weight[i] >= 0) {
                    dp[i+1][sumw] = chmax(dp[i+1][sumw], dp[i][sumw - weight[i]]+ value[i]);
                }
                dp[i+1][sumw] = chmax(dp[i+1][sumw], dp[i][sumw]);
            }
        }
        
        
        System.out.println(dp[item][maxw]);
    }
    public static long chmax(long a, long b) {
        if (a < b) return b;
        return a;
    }
}