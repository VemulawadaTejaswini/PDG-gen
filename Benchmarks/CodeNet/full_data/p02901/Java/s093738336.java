import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
class Main{


	static final int MOD = 1000000007;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		int inf = 1000000007;
		int[][] dp = new int[M+1][1<<N];				//i番目以降の鍵は購入せずに状態jにするのに必要な最小費用

		for(int i = 0;i <= M;i++){
			for(int j = 0;j<1<<N; j++){
				dp[i][j] = inf;
			}
		}
		
		
		dp[0][0] = 0;
		for(int i = 1;i <= M;i++){
			int a = sc.nextInt();			//値段
			int n = sc.nextInt();			//開けれる箱の個数
			int bit = 0;						//bit
			for(int j = 0;j < n;j++){			//開けれる鍵を全部表示=状態(0001000みたいな)
				int k = sc.nextInt()-1;
				bit += 1<<k;
			}
			for(int j = 0;j<1<<N;j++){
				dp[i][j] = dp[i-1][j];
			}
			for(int j = 0;j<1<<N;j++){
				int k = j|bit;					
				dp[i][k] = Math.min(dp[i][k], dp[i-1][j] + a);
			}
						
		}
		int ans = dp[M][(1<<N)-1];

		
		System.out.println(ans==inf?-1:ans);




	}

	static void sieve(ArrayList<Long> list){
		int n = 50000000;
		boolean[] is_prime = new boolean[n+1];
		int[] prime = new int[n];
		for(int i= 0;i <=n;i++){
			is_prime[i] = true;
		}
		list.add((long) 1);
		for(int i = 2;i <= n;i++){
			if(is_prime[i]){
				list.add((long)i);
				for(int j = 2*i;j <= n;j+=i){
					is_prime[j] = false;
				}
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




