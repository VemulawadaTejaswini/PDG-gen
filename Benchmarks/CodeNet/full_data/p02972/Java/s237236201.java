import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");
		int a[] = new int[n + 1];

		for (int i = 0; i < n; i++) {
			a[i + 1] = Integer.parseInt(str[i]);
		}

		int dp[] = new int[n + 10];

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = n; i >= 1; i--) {
			int sum = 0;
			for (int j = i; j <= n; j += i) {
				sum += dp[j];
			}
			if ((sum + a[i]) % 2 == 1) {
				dp[i]++;
				list.add(i);
			}
		}

		Collections.sort(list);

		System.out.println(list.size());
		if (list.size() != 0) {
			System.out.print(list.get(0));
			for (int i = 1; i < list.size(); i++) {
				System.out.print(" " + list.get(i));
			}
			System.out.println();
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