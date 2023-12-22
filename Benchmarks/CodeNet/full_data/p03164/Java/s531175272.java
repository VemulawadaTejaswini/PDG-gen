import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		knapSack();
	}

	public static void knapSack() {
		Scanner sc = new Scanner(System.in);
		int items = sc.nextInt();
		int weight = sc.nextInt();
		
		int[] values = new int[items];
		int[] weights = new int[items];
		int maxW = 0;
		for(int i =0;i<items;i++) {
			weights[i] = sc.nextInt();
			values[i] = sc.nextInt();
			maxW+= values[i];
		}
		weight = Math.min(weight, maxW);
		
		long[][]dp = new long[items+1][weight+1];
		knapSackHelper(dp, items,weight,weights, values);
		System.out.println(dp[items][weight]);
	}

	private static long knapSackHelper(long[][] dp, int items, int WT, int[] weights, int[] values) {
	//	System.out.println("items "+ items +" WT "+ WT + "current Item ");
		if(items <=0) {
			return 0;
		}
		
		if(dp[items][WT]!=0) {
			return dp[items][WT];
		}
		
		if(WT>=weights[items-1]) {
			dp[items][WT] = knapSackHelper(dp, items-1,WT-weights[items-1],weights,values)+values[items-1];
		}
		
		dp[items][WT] = Math.max(dp[items][WT], knapSackHelper(dp, items-1, WT, weights, values));
		//System.out.println("dp ["+ items+"]["+WT+"] "+dp[items][WT]);
		
		return dp[items][WT];
	}
}
