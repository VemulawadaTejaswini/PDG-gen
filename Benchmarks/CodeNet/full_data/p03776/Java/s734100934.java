import java.util.Arrays;
import java.util.Scanner;

class Main {
	
static long combination(int n, int k){
	long[][] dp = new long[n+1][n+1];
	for(int i=0; i<=n; i++){
		dp[i][0] = 1;
	}
	for(int i=1; i<=n; i++){
		for(int j=1; j<=i; j++){
			if(i==j){
				dp[i][j] = 1;		
			}else{
				dp[i][j] = dp[i-1][j-1] + dp[i-1][j];		
			}
		}
	}
	return dp[n][k];
}

static long combination_sum(int A, int B, int count2){
	long[][] dp = new long[51][51];
	for(int i=0; i<=B; i++){
		dp[i][0] = 1;
	}
	for(int i=1; i<=50; i++){
		for(int j=1; j<=50; j++){
			if(i==j){
				dp[i][j] = 1;
			}else{
				dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
			}
		}
	}
	long sum = 0;
	for(int j=A; j<=B; j++){
			sum += dp[count2][j];
	}
	return sum;
}

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		long[] v = new long[N];
		for(int i=0; i<N; i++){
			v[i]  = sc.nextLong();
		}
		
		Arrays.sort(v);

		//最大値を調べるにはA個だけ選ぶ
		long max_sum = 0;
		for(int i=N-1; i>=N-A; i--){
			max_sum += v[i];
		}
		double max_ave = (double) max_sum / (double) A;
		System.out.println(max_ave);
		
		//選んだA個の中でv[N-A]と同じ値のものの個数
		int count1 = 1;
		long max_value = v[N-A];
		for(int i=N-A+1; i<N-1; i++){
			if(v[i]==max_value){
				count1++;
			}else{
				break;
			}
		}
		
		//vの中でv[N-A]と同じ値のものの個数
		int count2 = count1;
		for(int i=N-A-1; i>=0; i--){
			if(v[i]==max_value){
				count2++;
			}else{
				break;
			}
		}

		long count;
		if(count1 == A){
			count = combination_sum(A, B, count2);
		}else{
			count = combination(count2, count1);
		}

		System.out.println(count);		
		
	}

}
