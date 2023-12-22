import java.awt.*;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt();
        int h[]=new int[n];
        for (int i=0;i<n;i++)h[i]=sc.nextInt();
        int dp[]=new int[n];Arrays.fill(dp,(int)1e9+5);dp[0]=0;
        for (int i=1;i<n;i++){
            for (int j=1;j<=k;j++) {
                if (i-j<0)break;
                dp[i] = Math.min(dp[i - j] + Math.abs(h[i-j] - h[i]), dp[i]);
            }
        }
        System.out.println(dp[n-1]);
    }
}