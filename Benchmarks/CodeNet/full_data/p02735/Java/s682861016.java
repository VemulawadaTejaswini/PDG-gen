import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {
	int H, W;
	int[][] distances;
	boolean[][] field;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		H = Integer.parseInt(tokens[0]);
		W = Integer.parseInt(tokens[1]);
		this.distances = new int[H][W];
		this.field = new boolean[H][W];
		for (int i = 0; i < H; ++i) {
			Arrays.fill(this.distances[i], 0);
			Arrays.fill(this.field[i], true);
		}
		for (int i = 0; i < H; ++i) {
			String line = in.readLine();
			for (int j = 0; j < W; ++j) {
				char c = line.charAt(j);
				if (c == '.') {
					this.field[i][j] = true;
				} else {
					this.field[i][j] = false;
				}
			}
		}
		// まず初期化
		if (!this.field[0][0]) {
			this.distances[0][0] = 1;
		}
		// 横
		for (int i = 1; i < W; ++i) {
			if (this.field[0][i]) {
				this.distances[0][i] = this.distances[0][i - 1];
			} else {
				this.distances[0][i] = this.distances[0][i - 1] + 1;
			}
		}
		// 縦
		for (int i = 1; i < H; ++i) {
			if (this.field[i][0]) {
				this.distances[i][0] = this.distances[i - 1][0];
			} else {
				this.distances[i][0] = this.distances[i - 1][0] + 1;
			}
		}
	}

	void calc() {
		for (int i = 1; i < H; ++i) {
			for (int j = 1; j < W; ++j) {
				if (this.field[i][j]) {
					this.distances[i][j] = Math.min(this.distances[i - 1][j], this.distances[i][j - 1]);
				} else {
					this.distances[i][j] = Math.min(this.distances[i - 1][j], this.distances[i][j - 1]) + 1;
				}
			}
		}
	}

	void showResult() {
		System.out.println(this.distances[H - 1][W - 1]);
	}

}