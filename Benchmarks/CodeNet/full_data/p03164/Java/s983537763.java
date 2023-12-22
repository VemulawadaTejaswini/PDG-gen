import java.util.*;
import java.io.*;

class Item{
	int value,weight;
	public Item(int weight, int value) {
		this.value = value;
		this.weight = weight;
	}
}

public class Main {


	public static void main(String[] args) {
		Main answer = new Main();
		long solution = answer.solve();
		System.out.println(solution);
	}

	private long solve() {
		Scanner sc =  new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		// from question we know below		 
		int maxValue = N*1000;

		long [][] dp = new long[N+1][maxValue+1];
		long INF = (long)1e9+1;

		for(int i=0;i<=maxValue;i++){
			dp[1][i] = INF;
		}
		Item [] array = new Item[N+1];
		for(int i=1;i<=N;i++){
			array[i] = new Item(sc.nextInt(), sc.nextInt());
		}
		dp[1][array[1].value] = array[1].weight;
		dp[1][0] =0;

		for(int i=2;i<=N;i++){
			for(int j=0;j<=maxValue;j++){
				dp[i][j]= dp[i-1][j];
				if (array[i].value>j) continue;
				dp[i][j] = Math.min(dp[i-1][j-array[i].value]+array[i].weight, dp[i-1][j]);
			}
		}
		long bestValue=0;
		for(int i=0;i<=maxValue;i++){
			if (dp[N][i]<=W) bestValue = Math.max(bestValue, i);
		}
		return bestValue;
	}
}