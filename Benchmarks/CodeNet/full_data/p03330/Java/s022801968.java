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

	int N, C;
	int[][] D;
	int[][] c;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		C = Integer.parseInt(tokens[1]);
		D = new int[C][C];
		for (int i = 0; i < C; ++i) {
			tokens = in.readLine().split(" ");
			for (int j = 0; j < C; ++j) {
				D[i][j] = Integer.parseInt(tokens[j]);
			}
		}
		c = new int[N][N];
		for (int i = 0; i < N; ++i) {
			tokens = in.readLine().split(" ");
			for (int j = 0; j < N; ++j) {
				c[i][j] = Integer.parseInt(tokens[j]) - 1;
			}
		}
	}

	long calc(int[] colPattern, int[][] counts) {
		long result = 0L;
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < C; ++j) {
				if (colPattern[i] != j) {
					result += (long) counts[i][j] * (long) D[j][colPattern[i]];
				}
			}
		}

		return result;
	}

	void calc() {
		int[][] counts = new int[3][C];
		for (int i = 0; i < 3; ++i) {
			Arrays.fill(counts[i], 0);
		}
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				counts[(i + j) % 3][c[i][j]]++;
			}
		}

		long min = Long.MAX_VALUE / 2;
		for (int i = 0; i < C; ++i) {
			for (int j = 0; j < C; ++j) {
				if (i == j) {
					continue;
				}
				for (int k = 0; k < C; ++k) {
					if (i == k || j == k) {
						continue;
					}
					int[] colPattern = new int[3];
					colPattern[0] = i;
					colPattern[1] = j;
					colPattern[2] = k;
					min = Math.min(min, calc(colPattern, counts));
				}
			}
		}
		System.out.println(min);

	}

	void showResult() {
	}
}