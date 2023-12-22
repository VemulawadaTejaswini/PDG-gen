import java.util.ArrayDeque;
import java.util.Scanner;

class Main {
	static int N;
	static long[] x;
	final static long MODULO = 1_000_000_000 + 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		x = new long[N];
		for (int i = 0; i < N; ++i) {
			x[i] = sc.nextLong();
		}

		long ans = 1;
		ArrayDeque<Long> stack = new ArrayDeque<>();
		int p = 0;
		while (true) {
			while (p < N && stack.size() * 2 + 1 <= x[p]) {
				stack.add(x[p]);
				++p;
			}
			ans = (ans * (stack.size() + (p != N ? 1 : 0))) % MODULO;
			stack.pollFirst();
			if (stack.size() == 0 && p == N)
				break;
		}
		System.out.println(ans);
	}
}