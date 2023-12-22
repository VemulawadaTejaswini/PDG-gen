import java.util.Scanner;

class Main{
	static final long MOD = 1000000007;


	static long pow=1000000007;




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N =sc.nextInt();
		int[] h = new int[N];
		for(int i = 0;i < N;i++){
			h[i] = sc.nextInt();
		}
		int[] dp = new int[N];
		dp[0] = 0;
		dp[1] = Math.abs(h[1]-h[0]);
		for(int i = 2;i < N;i++){
			dp[i] = Math.min(dp[i-2]+Math.abs(h[i]-h[i-2]), dp[i-1]+ Math.abs(h[i]-h[i-1]));
		}
		System.out.println(dp[N-1]);

	}
}







class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

