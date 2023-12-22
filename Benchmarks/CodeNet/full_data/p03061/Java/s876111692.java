import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
	int N;
	long[] A;
	long result = 0;

	long gcd(long large, long small) {
		if (large < small) {
			return gcd(small, large);
		}
		if (large == small) {
			return large;
		}
		if (large % small == 0) {
			return small;
		}
		return gcd(small, large % small);
	}

	void calc() {
		List<Long> gcds = new ArrayList<>();
		gcds.add(gcd(A[0], A[1]));
		int index = 1;
		for (int i = 2; i < N; ++i) {
			long last = gcds.get(gcds.size() - 1);
			long g = gcd(last, A[i]);
			gcds.add(g);
			if (g < last) {
				index = i;
			}
		}

		if (index >= 2) {
			// その数を置き換える
			long r = A[0];
			for (int i = 1; i < N; ++i) {
				if (i == index) {
					continue;
				}
				r = gcd(r, A[i]);
			}
			this.result = r;
		} else {
			long r0 = A[1];
			for (int i = 2; i < N; ++i) {
				r0 = gcd(r0, A[i]);
			}
			long r1 = A[0];
			for (int i = 2; i < N; ++i) {
				r1 = gcd(r1, A[i]);
			}
			this.result = Math.max(r0, r1);
		}
	}

	Main() throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		N = Integer.parseInt(in.readLine());
		A = new long[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}
		in.close();
		Arrays.sort(A);
		calc();
	}

	public static void main(String[] args) throws IOException {
		Main ins = new Main();
		System.out.println(ins.result);
	}

}