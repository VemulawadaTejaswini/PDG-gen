import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int H, W;
	boolean[][] map;
	int[][] distMat;
	int count = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		this.H = Integer.parseInt(tokens[0]);
		this.W = Integer.parseInt(tokens[1]);
		this.map = new boolean[H][W];
		for (int i = 0; i < H; ++i) {
			String line = in.readLine();
			for (int j = 0; j < W; ++j) {
				if (line.charAt(j) == '.') {
					this.map[i][j] = true;
					++this.count;
				} else {
					this.map[i][j] = false;
				}
			}
		}

		this.distMat = new int[H * W][H * W];
		for (int i = 0; i < H * W; ++i) {
			Arrays.fill(this.distMat[i], Integer.MAX_VALUE / 2);
		}
		for (int h = 0; h < H; ++h) {
			for (int w = 0; w < W; ++w) {
				if (h + 1 != H) {
					// (h, w)と(h+1, w)がつながっているかを判定する
					if (this.map[h][w] && this.map[h + 1][w]) {
						this.distMat[h * W + w][(h + 1) * W + w] = 1;
						this.distMat[(h + 1) * W + w][h * W + w] = 1;
					}
				}
				if (w + 1 != W) {
					// (h, w)と(h, w+1)がつながっているかを判定する
					if (this.map[h][w] && this.map[h][w + 1]) {
						this.distMat[h * W + w][h * W + (w + 1)] = 1;
						this.distMat[h * W + (w + 1)][h * W + w] = 1;
					}
				}
			}
		}
	}

	void calc() {
		// ワーシャルフロイド
		for (int k = 0; k < H * W; ++k) {
			int h2 = k / W;
			int w2 = k % W;
			if (!this.map[h2][w2]) {
				continue;
			}
			for (int i = 0; i < H * W; ++i) {
				int h0 = i / W;
				int w0 = i % W;
				if (!this.map[h0][w0]) {
					continue;
				}
				for (int j = i + 1; j < H * W; ++j) {
					int h1 = j / W;
					int w1 = j % W;
					if (!this.map[h1][w1]) {
						continue;
					}
					if (i == j) {
						continue;
					}
					this.distMat[i][j] = Math.min(this.distMat[i][j], this.distMat[i][k] + this.distMat[k][j]);
					this.distMat[j][i] = this.distMat[i][j];
				}
			}
		}
	}

	void showResult() {
		int result = 0;
		for (int i = 0; i < H * W; ++i) {
			int h0 = i / W;
			int w0 = i % W;
			for (int j = i + 1; j < H * W; ++j) {
				int h1 = j / W;
				int w1 = j % W;
				if (this.map[h0][w0] && this.map[h1][w1]) {
					result = Math.max(result, this.distMat[i][j]);
				}
			}
		}
		System.out.println(result);
	}
}
