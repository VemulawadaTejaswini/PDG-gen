import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		ABC057DD solve = new ABC057DD();
		solve.main();
	}
}

class ABC057DD {
	
	int N;
	int A;
	int B;
	long[] values;
	
	ABC057DD() {
		// Input values
		Scanner cin = new Scanner(System.in);
		this.N = cin.nextInt();
		this.A = cin.nextInt();
		this.B = cin.nextInt();
		this.values = new long[N];
		for (int i = 0; i < N; i++) {
			values[i] = cin.nextLong();
		}
	}
	
	void main() {
	
		Arrays.sort(values);
		
		long sum = 0;
		for (int i = N - 1; i >= N - A; i--) {
			sum += values[i];
		}
		double average = sum / (double) A;
		
		long lastNum = values[N - A];
		int allRepetitionCount = 0;
		int repetitionCountToA = 0;
		for (int i = N - 1; i >= 0; i--) {
			if (values[i] == lastNum) {
				allRepetitionCount++;
				if (i >= N - A) {
					repetitionCountToA++;
				}
			}
		}
		
		PascalTriangle pascal = new PascalTriangle(N);
		long count = 0;
		if (lastNum == values[N - 1]) {
			int maxHand = Math.min(B, allRepetitionCount);
			for (int i = A; i <= maxHand; i++) {
				count += pascal.combination(maxHand, i);
			}
		} else {
			count = pascal.combination(allRepetitionCount, repetitionCountToA);
		}
		
		System.out.println(average);
		System.out.println(count);
	}
	
	class PascalTriangle {
		
		int N;
		long[][] dp;
		
		PascalTriangle(int N) {
			this.N = N;
			this.dp = new long[N + 1][N + 1];
			makeTriangle();
		}
		
		void makeTriangle() {
			dp[0][0] = 1;
			dp[1][0] = 1;
			dp[1][1] = 1;
			
			for (int i = 2; i <= N; i++) {
				for (int j = 0; j <= i; j++) {
					if (j == 0) {
						dp[i][j] = 1;
					} else {
						dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
					}					
				}
			}
		}
		
		long combination(int n, int k) {
			return dp[n][k];
		}
		
	}
}