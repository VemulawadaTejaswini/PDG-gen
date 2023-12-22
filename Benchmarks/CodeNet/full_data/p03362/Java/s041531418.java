import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	// n以下の素数のリスト
	List<Integer> eratosthenes(int n) {
		boolean[] prime = new boolean[n + 1];

		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		for (int i = 2; i * i <= prime.length; i++) {
			if (prime[i]) {
				for (int j = 2; j * i < prime.length; j++) {
					prime[j * i] = false;
				}
			}
		}

		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < prime.length; i++) {
			if (prime[i]) {
				result.add(i);
			}
		}
		return result;

	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		List<Integer> prime = eratosthenes(55556);

		int c = 0;
		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < prime.size(); i++) {
			int n = prime.get(i);
			if (n % 5 == 1) {
				ans.add(n);
				c++;
			}
			if (c >= N) {
				break;
			}
		}

		for (int x : ans) {
			out.print(x + " ");
		}
		out.println();
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
