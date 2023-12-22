
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
        }
        long[] dp =new long[n];
        dp[0]=0;
        long max = 0;
        for (int i = 0; i < n; i++) {
            long maxVal=0;
            for (int j = 0; j < i; j++) {
                if(arr[i]>arr[j]){
                    maxVal = Math.max(maxVal,dp[j]);
                }
            }
            dp[i] = maxVal+p[i];
            max= Math.max(max,dp[i]);
        }
        System.out.println(max);
    }
}
