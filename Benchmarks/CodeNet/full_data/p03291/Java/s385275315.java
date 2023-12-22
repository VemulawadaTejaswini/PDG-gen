import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		final int MOD = 1000000007;
		int[] sumA = new int[n + 1];
		int[] sumC = new int[n + 1];
		int[] sumX = new int[n + 1];
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == 'A') sumA[i + 1] = sumA[i] + 1;
			else sumA[i + 1] = sumA[i];
			if(s.charAt(i) == 'C') sumC[i + 1] = sumC[i] + 1;
			else sumC[i + 1] = sumC[i];
			if(s.charAt(i) == '?') sumX[i + 1] = sumX[i] + 1;
			else sumX[i + 1] = sumX[i];
		}
		long ans = 0;
		for(int i = 1; i < n; i++) {
			if(s.charAt(i) == 'B' || s.charAt(i) == '?') {
				long tailC = sumC[n] - sumC[i + 1];
				long tailX = sumX[n] - sumX[i + 1];
				long head = sumA[i] * (long)Math.pow(3, sumX[i]) + sumX[i] * (long)Math.pow(3, sumX[i] - 1);
				long tail = tailC * (long)Math.pow(3, tailX) + tailX * (long)Math.pow(3, tailX - 1);
				ans = (ans + head * tail) % MOD;
			}
		}
		System.out.println(ans);
	}
}
