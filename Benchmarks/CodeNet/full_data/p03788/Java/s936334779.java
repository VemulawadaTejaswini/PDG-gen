import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	final long MODULO = 924844033L;

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		String s = sc.next();
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		for (int i = 0; i < s.length(); ++i) {
			dq.add(s.charAt(i) == 'A' ? 1 : -1);
		}
		int cur = 1;
		long res = K;
		for (int i = 0; i < K; ++i, res = K - i) {
			int v = dq.pollFirst();
			if (v * cur == 1) {
				dq.addFirst(cur * (-1));
				continue;
			}
			cur *= -1;
			dq.addLast(cur);
			if (i > N && cur * dq.peekFirst() == -1) {
				break;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while (!dq.isEmpty()) {
			sb.append(dq.pollFirst() * cur == 1 ? 'A' : 'B');
		}
		System.out.println(sb);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}