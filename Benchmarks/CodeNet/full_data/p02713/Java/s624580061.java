
import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int K;
	long sum = 0L;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		K = Integer.parseInt(tokens[0]);
	}

	void calc() {
		for (int a = 1; a <= K; ++a) {
			for (int b = 1; b <= K; ++b) {
				for (int c = 1; c <= K; ++c) {
					int temp = gcd(a, b);
					int gcd = gcd(c, temp);
					sum += gcd;
				}
			}
		}
	}

	void showResult() {
		System.out.println(sum);
	}

	int gcd(int large, int small) {
		if (large < small) {
			return gcd(small, large);
		}
		if (large % small == 0) {
			return small;
		}
		return gcd(small, large % small);
	}
}
