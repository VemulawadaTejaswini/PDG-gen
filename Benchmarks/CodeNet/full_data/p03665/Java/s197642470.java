import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveA();
	}

	static Long[][] pre;
	private void solveA() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P = sc.nextInt();
		int zeroNum = 0;
		int oneNum = 0;
		long ans = 0L;
		for (int i = 0; i < N; i++) {
			if (sc.nextInt() % 2 == 0) {
				zeroNum++;
			} else {
				oneNum++;
			}
		}
		pre = new Long[101][];
		for (int i = 0; i < 101; i++) {
			pre[i] = new Long[101];
		}
		for (int i = 0; i <= N; i++) {
			for (int z = 0; z <= i; z++) {
				int o = i - z;
				if (o % 2 == P) {
					ans += comb(zeroNum, z) * comb(oneNum, o);
				}
			}
		}
		System.out.println(ans);
	}

	private long comb(int A, int B) {
		if (pre[A][B] == null) {
			if (A < B) {
				return 0L;
			}
			if (B == 0) {
				return 1L;
			}
			if (A / 2 < B) {
				return comb(A, A - B);
			}
			pre[A][B] = comb(A - 1, B) + comb(A - 1, B - 1);
		}
		return pre[A][B];
	}
}