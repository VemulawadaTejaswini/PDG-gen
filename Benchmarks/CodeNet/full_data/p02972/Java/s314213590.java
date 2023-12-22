import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]);
		}

		int dp[] = new int[n + 10];
		if (a[n - 1] == 0) {
			dp[n - 1] = 0;
		} else {
			dp[n - 1] = 1;
		}

		Deque<Integer> stack = new ArrayDeque<>();
		for (int i = n - 1; i >= 0; i--) {
			if (a[i] == 0) {
				if (dp[i] + 1 % 2 == 0) {
					dp[i] = dp[i] + 1;
					stack.add(i + 1);
				}
			} else {
				if (dp[i] + 1 % 2 != 0) {
					dp[i] = dp[i] + 1;
					stack.add(i + 1);
				}
			}
			ArrayList<Integer> list = divisor(i);
			for (int j = 0; j < list.size(); j++) {
				dp[list.get(j)]++;
			}
		}

		if (dp[0] % 2 == a[0]) {
			System.out.println(stack.size());

			if (stack.size() != 0) {
				System.out.print(stack.pop());
				for (int i : stack) {
					System.out.print(" " + i);
				}
				System.out.println();
			}
		} else {
			System.out.println("-1");
		}
	}

	public static final ArrayList<Integer> divisor(final int n) {
		final ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i * i <= n; i++) { // √n
			if (n % i == 0) {
				list.add(i); // a x b
				if (i != n / i) {
					list.add(n / i); // b x a (逆向き)
				}
			}
		}
		return list;
	}
}