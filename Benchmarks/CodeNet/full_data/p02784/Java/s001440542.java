import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		long H = Long.parseLong(tokens[0]);
		int N = Integer.parseInt(tokens[1]);
		tokens = in.readLine().split(" ");
		int[] A = new int[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}
		long sum = 0;
		for (int i = 0; i < N; ++i) {
			sum += A[i];
		}
		if (sum >= H) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	void calc() {
	}

	void showResult() {
	}
}
