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

	int H, W;
	int[] a;
	int N;
	int[] cell;
	int[][] result;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		H = Integer.parseInt(tokens[0]);
		W = Integer.parseInt(tokens[1]);
		N = Integer.parseInt(in.readLine());
		a = new int[N];
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			a[i] = Integer.parseInt(tokens[i]);
		}
		cell = new int[H * W];
		int index = 0;
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < a[i]; ++j) {
				cell[index] = i + 1;
				++index;
			}
		}
	}

	void calc() {
		result = new int[H][W];
		for (int i = 0; i < H * W; ++i) {
			int h = i / W;
			int w = i % W;
			if (h % 2 == 1) {
				w = W - 1 - w;
			}
			result[h][w] = cell[i];
		}
	}

	void showResult() {
		for (int i = 0; i < H; ++i) {
			System.out.print(result[i][0]);
			for (int j = 1; j < W; ++j) {
				System.out.print(" " + result[i][j]);
			}
			System.out.println("");
		}
	}
}