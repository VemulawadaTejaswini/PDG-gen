import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class Main{


	static final int MOD = 1000000007;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();


		long dp[][] = new long[n][n];
		for(int i = 0;i < n;i++){
			Arrays.fill(dp[i], Integer.MAX_VALUE);
		}
		
		for(int i = 0;i < m;i++){
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			int c = sc.nextInt();
			if(c > l){
				dp[a][b] = Integer.MAX_VALUE;
				dp[b][a] = Integer.MAX_VALUE;
			}else{
				dp[a][b] = c;
				dp[b][a] = c;
			}
		}
		
		
		
		for(int k = 0;k < n;k++){
			for(int i = 0;i < n;i++){
				for(int j = 0;j < n;j++){
					dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
				}
			}
		}
		
		long[][] edge = new long[n][n];
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++){
				if(dp[i][j] <= l){
					edge[i][j] = 1;
				}else{
					edge[i][j] = Integer.MAX_VALUE;
				}
			}
		}
		
		for(int k = 0;k < n;k++){
			for(int i = 0;i < n;i++){
				for(int j = 0;j < n;j++){
					edge[i][j] = Math.min(edge[i][j], edge[i][k] + edge[k][j]);
				}
			}
		}

//		for(int i= 0;i < n;i++){
//			for(int j = 0;j < n;j++){
//				System.out.println("i " + i + " j " + j + " "+edge[i][j]);
//			}
//		}
		
		
		int q = sc.nextInt();
		for(int i = 0;i < q;i++){
			int ans = 0;
			int s = sc.nextInt()-1;
			int t = sc.nextInt()-1;
			if(edge[s][t] >= Integer.MAX_VALUE){
				System.out.println(-1);
			}else{
				System.out.println(edge[s][t] -1);
			}
		}

		
		
	}




	static int upperbond(int k,int min,int[] data){		//kより小さい最大の値をdataの中から探し、返す二分探索
		int max = data.length;
//		if(min == data.length-1){
//			if(data[min] > k){
//				return min;
//			}
//		}

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data[mid] >= k){
				max = mid;
			}else{
				min = mid;
			}
		}

		return max;
	}

	static int lowerbond(int k,int min,int[] data){		//kより大きい最小の値をdataの中から探し、返す二分探索
		int max = data.length;

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data[mid] >= k){
				max = mid;
			}else{
				min = mid;
			}
		}
		return min;
	}



	static int gcd(int a,int b){				//最大公約数を返す
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}
	static long gcd(long a,long b){
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}



	static long lcm (long a, long b) {
		long g = gcd(a,b);
		return a/g*b;
	}




}


class Edge extends ArrayList<P>{

}

class P{
	int to;
	long cost;
	P(int to,long cost){
		this.to = to;
		this.cost = cost;
	}
}


class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return   from- otherpair.from;
	}








}




