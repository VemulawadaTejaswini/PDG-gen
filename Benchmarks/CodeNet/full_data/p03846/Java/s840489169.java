import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		ABC50C p = new ABC50C();
		p.solve();
	}
}

class ABC50C {
	public void solve() throws IOException {
		int mod = 1000000007;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] given = new int[input.length];
		int[] sorted = new int[input.length];
		for (int i = 0; i < N; i++) {
			given[i] = Integer.parseInt(input[i]);
			sorted[i] = given[i];
		}
		Arrays.sort(sorted);
		int[] ok = new int[N];
		if (N % 2 == 0 && N >= 2)
			ok[0] = ok[1] = 1;
		else if (N % 2 != 0 && N >= 2)
			ok[1] = 2;
		else if (N == 1)
			ok[0] = 1;
		for (int i = 2; i < N; i++) {
			ok[i] = ok[i - 2] + 2;
		}

		for (int i = 0; i < N; i++) {
			if (sorted[i] != ok[i]) {
				System.out.println(0);
				return;
			}
		}

		int ans = 1;
		for (int i = 0; i < N / 2; i++) {
			ans *= 2;
			ans = ans % mod;
		}
		System.out.println(ans);
	}
}

class ABC50B {
	public void solve() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] t = new int[N];
		long sum = 0;
		for (int i = 0; i < N; i++) {
			t[i] = Integer.parseInt(input[i]);
			sum += t[i];
		}
		int M = Integer.parseInt(br.readLine());
		long[] ans = new long[M];
		for (int i = 0; i < M; i++) {
			input = br.readLine().split(" ");
			int pi = Integer.parseInt(input[0]);
			int xi = Integer.parseInt(input[1]);
			ans[i] = sum - t[pi - 1] + xi;
		}

		for (int i = 0; i < M; i++) {
			System.out.println(ans[i]);
		}
	}
}

class ABC50A {
	public void solve() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		long a = Long.parseLong(input[0]);
		long b = Long.parseLong(input[2]);
		if (input[1].equals("+"))
			System.out.println((a + b));
		else
			System.out.println((a - b));
	}
}