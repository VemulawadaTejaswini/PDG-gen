import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		long t[] = new long[n];

		for (int i = 0; i < n; i++) {
			t[i] = Long.parseLong(br.readLine());
		}

		long l = 1;

		for (int i = 0; i < n; i++) {
			l = lcm(t[i], l);
		}

		System.out.println(l);
	}

	static long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	static long lcm(long a, long b) {
		long g = gcd(a, b);
		return a / g * b; // Be careful not to overflow
	}
}
