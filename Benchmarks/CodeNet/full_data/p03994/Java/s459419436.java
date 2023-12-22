import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		int[] s = new int[c.length];
		for (int i = 0; i < c.length; i++) {
			s[i] = c[i] - 'a';
		}
		int MOD = 26;
		int K = sc.nextInt();
		for (int i = 0; i < s.length; i++) {
			if (MOD - s[i] <= K && s[i] != 0) {
				K -= MOD - s[i];
				s[i] = 0;
			}
		}
		s[s.length - 1] = (s[s.length - 1] + K) % MOD;
		char[] ref = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		for (int i = 0; i < s.length; i++) {
			System.out.print(ref[s[i]]);
		}
		System.out.println();
	}
}
