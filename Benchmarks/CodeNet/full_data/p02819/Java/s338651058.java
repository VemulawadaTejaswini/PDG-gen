import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	long X, result;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		X = Long.parseLong(in.readLine());
	}

	void calc() {
		for (long i = X;; ++i) {
			if (isPrime(i)) {
				result = i;
				break;
			}
		}
	}

	boolean isPrime(long val) {
		if (val == 2 || val == 3 || val == 5) {
			return true;
		}
		for (long i = 2; i < Math.sqrt((double) val) + 1; ++i) {
			if (val % i == 0) {
				return false;
			}
		}
		return true;
	}

	void showResult() {
		System.out.println(result);
	}
}
