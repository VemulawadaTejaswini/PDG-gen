import java.util.Arrays;
import java.util.Scanner;

class Main{
	static final long MOD = 1000000007;


	static long pow=1000000007;




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N =sc.nextInt();
		int K = sc.nextInt();
		int[] h = new int[N];
		for(int i = 0;i < N;i++){
			h[i] = sc.nextInt();
		}
		int[] dp = new int[N];
		Arrays.fill(dp, 1000000000);
		dp[0] = 0;
		for(int i= 0;i < N;i++){
			for(int j = i+1;j < N;j++){
				if(j == i+K+1){
					break;
				}
				dp[j] = Math.min(dp[j], dp[i]+ Math.abs(h[i]-h[j]));
			}
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

