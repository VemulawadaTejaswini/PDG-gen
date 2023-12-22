import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char[] w = sc.next().toCharArray();
		int N = w.length;
		boolean all = true;
		for (int i = 1; i < N; ++i) {
			if (w[i] != w[0]) all = false;
		}
		if (all) {
			System.out.println(N);
			System.out.println(1);
			return;
		}
		for (int i = 2; i <= N / 2; ++i) {
			if (N % i != 0) continue;
			boolean ok = true;
			OUT: for (int j = 0; j < N / i; ++j) {
				for (int k = 0; k < i; ++k) {
					if (w[j * i + k] != w[k]) {
						ok = false;
						break OUT;
					}
				}
			}
			if (ok) {
				System.out.println(2);
				int count = (i - 1) * (N / i);
				if (N / i == 2) ++count;
				System.out.println(count);
				return;
			}
		}

		System.out.println(1);
		System.out.println(1);
	}

}
