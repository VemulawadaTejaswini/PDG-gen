import java.util.Arrays;
import java.util.Scanner;

class Main {

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
		
		//n_C_kをdp[n][k]で表す
		long[][] dp = new long[51][51];
		for(int i=0; i<=50; i++){
			dp[i][0] = 1;
		}
		for(int i=1; i<=50; i++){
			dp[i][i] = 1;
			for(int j=1; j<i; j++){	
					dp[i][j] = dp[i-1][j-1] + dp[i-1][j];		
			}
		}

		long count = 0;
		if(count1 == A){
			for(int j=A; j<=B; j++){
				count += dp[count2][j];
			}
		}else{
			count = dp[count2][count1];
		}

		System.out.println(count);		
		
	}

}
