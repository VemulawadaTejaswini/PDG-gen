import java.util.Scanner;

public class Main {

	static long MOD = 1000000007;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		char[] S = in.next().toCharArray();
		int[] alph = new int[26];
		for (int i = 0; i < S.length; i++) {
			alph[S[i] - 'a']++;
		}
		int ans = 1;
		for (int i = 0; i < alph.length; i++) {
			if (alph[i] > 0) {
				ans *= alph[i] + 1;
				ans %= MOD;
			}
		}
		System.out.println(ans - 1);
		in.close();
	}
}