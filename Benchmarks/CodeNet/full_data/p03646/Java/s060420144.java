import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	long K;
	int N;
	long[] a;

	Main(BufferedReader in) throws IOException {
		K = Long.parseLong(in.readLine());
		N = 50;
		a = new long[N];
	}

	void eval() {
		int index = -1;
		long max = -1;
		for (int i = 0; i < N; ++i) {
			if (max < a[i]) {
				index = i;
				max = a[i];
			}
		}
		a[index] -= (long) N;
		for (int i = 0; i < N; ++i) {
			if (i != index) {
				a[i]++;
			}
		}
	}

	void calc() {
		if (K % 50 == 0) {
			a[0] = K / 50L;
			for (int i = 1; i < N; ++i) {
				a[i] = 49L + K / 50L;
			}
		} else {
			a[0] = K / 50L + 1L;
			for (int i = 1; i < N; ++i) {
				a[i] = 49L + K / 50L + 1L;
			}
			for (int i = 0; i < (50L - K % 50L); ++i) {
				eval();
			}
		}
	}

	void showResult() {
		System.out.println(N);
		System.out.print(a[0]);
		for (int i = 1; i < N; ++i) {
			System.out.print(" " + a[i]);
		}
		System.out.println("");
	}
}