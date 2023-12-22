import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int[] A;
	int N;
	boolean result = true;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		A = new int[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}
	}

	void calc() {
		for (int i = 0; i < N; ++i) {
			if (A[i] % 2 == 0) {
				if (A[i] % 3 == 0 || A[i] % 5 == 0) {

				} else {
					result = false;
				}
			}
		}
	}

	void showResult() {
		System.out.println(result ? "APPROVED" : "DENIED");
	}
}
