import java.util.Scanner;
import java.util.*;
public class Main {
	
	
	
	public static int KnapsackM(int weight[] , int value[] ,int mw,int n) {
		int dp[][] = new int[n+1][mw+1];
		
		for(int i=0;i<=n;i++) {
			for(int w=0;w<=mw;w++) {
				if(i==0 || w==0) {
					dp[i][w] = 0;
				}else if(weight[i-1] <= w) {
					dp[i][w] = Math.max(value[i-1] + dp[i-1][w-weight[i-1]],  dp[i-1][w]);
				}else {
					dp[i][w] = dp[i-1][w];
				}
			}
		}
		
		return dp[n][mw];
		
	}
	
	
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int mw = s.nextInt();
        int weight[] = new int[n];
        int value[] = new int[n];
        for(int i=0;i<n;i++) {
        	int wi = s.nextInt();
        	int vi = s.nextInt();
        	weight[i] = wi;
        	value[i] = vi;
        }
        System.out.println(KnapsackM(weight,value,mw,n));
    }
}