import java.util.*;
import java.io.*;
class Item {
	int weight,val;
	public Item(int weight, int val) {
		this.weight = weight;
		this.val = val;
	}
}
public class Main {


	public static void main(String[] args) {
		Main ans = new Main();
		System.out.println(ans.solve());
	}

	private long solve() {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int maxWeight = sc.nextInt();
		Item [] array = new Item[N+1];
		for(int i=1;i<=N;i++) {
			array[i] = new Item(sc.nextInt(), sc.nextInt());
		}
		int maxValue = N*1000;
		long [][] dp = new long[N+1][maxValue+1];

		for(int val=0;val<=maxValue;val++) { 
			dp[1][val] = (int) (1e9+1);
		}

		dp[1][array[1].val] = array[1].weight;
		dp[1][0] = 0;

		for(int i=2;i<=N;i++){
			for(int val=0;val<=maxValue;val++) {
				dp[i][val] = dp[i-1][val];

				if (val<array[i].val) continue;
				dp[i][val] = Math.min(dp[i-1][val], array[i].weight+ dp[i-1][val-array[i].val]);
			}
		}

		long bestTotalValue=0;
		for(int val=0;val<=maxValue;val++) {
			if (dp[N][val]<=maxWeight) {
				bestTotalValue = Math.max(bestTotalValue, val);
			}
		}
		return bestTotalValue;
	}

}