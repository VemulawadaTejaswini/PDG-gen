
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

	int N;
	int[][] A;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		A = new int[2][N];
		for (int i = 0; i < 2; ++i) {
			String[] tokens = in.readLine().split(" ");
			for (int j = 0; j < N; ++j) {
				A[i][j] = Integer.parseInt(tokens[j]);
			}
		}
		int[][] memo = new int[2][N];
		memo[0][0] = A[0][0];
		for (int i = 1; i < N; ++i) {
			memo[0][i] = memo[0][i - 1] + A[0][i];
		}
		memo[1][0] = memo[0][0] + A[1][0];
		for (int i = 1; i < N; ++i) {
			memo[1][i] = Math.max(memo[0][i], memo[1][i - 1]) + A[1][i];
		}
		System.out.println(memo[1][N - 1]);

	}

	void calc() {
	}

	void showResult() {
	}
}