import java.util.*;

// ABC 50-C
// http://abc050.contest.atcoder.jp/tasks/arc066_a

public class Main {
	
	static int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] freq = new int[n];
		for (int i = 0; i < n; i++) {
			freq[in.nextInt()]++;
		}
		
		boolean isValid = true;
		
		if (n % 2 == 1) {
			if (freq[0] != 1) {
				isValid = false;
			}
			for (int i = 2; i < n; i += 2) {
				if (freq[i] != 2) {
					isValid = false;
					break;
				}
			}
		} else {
			for (int i = 1; i < n; i += 2) {
				if (freq[i] != 2) {
					isValid = false;
					break;
				}
			}
		}
		
		long answer = 1;
		if (isValid) {
			for (int i = 0; i < n / 2; i++) {
				answer *= 2;
				answer %= MOD;
			}
		} else {
			answer = 0;
		}
		System.out.println(answer);
		
	}
}