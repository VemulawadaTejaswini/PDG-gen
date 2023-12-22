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

	int N, K;
	long count = 0;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		K = Integer.parseInt(tokens[1]);
	}

	void calc() {
		for (int b = K + 1; b <= N; ++b) {
			int div = N / b;
			count += (long) (div * (b - K));
			// System.out.println(b + " " + ((long) (div * (b - K))));
			if (N % b != 0) {
				int mod = N % b;
				count += Math.max(0, mod - Math.max(0, (K - 1)));
			}
		}
		System.out.println(count);
	}

	void showResult() {
	}
}