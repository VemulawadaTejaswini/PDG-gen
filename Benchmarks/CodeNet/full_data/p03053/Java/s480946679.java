import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int H, W;
	Deque<Cell> queue;
	int[][] field;
	int result;

	static class Cell {
		int h, w;

		Cell(int h, int w) {
			this.h = h;
			this.w = w;
		}
	}

	void calc() {
		while (!this.queue.isEmpty()) {
			Cell cell = this.queue.pollFirst();
			List<Cell> neighbors = this.getNeighbors(cell);
			for (Cell n : neighbors) {
				this.queue.addLast(n);
			}
		}
	}

	List<Cell> getNeighbors(Cell cell) {
		List<Cell> neighbors = new ArrayList<>();
		int[][] neighborIndexes = new int[4][2];
		neighborIndexes[0][0] = cell.h - 1;
		neighborIndexes[0][1] = cell.w;
		neighborIndexes[1][0] = cell.h + 1;
		neighborIndexes[1][1] = cell.w;
		neighborIndexes[2][0] = cell.h;
		neighborIndexes[2][1] = cell.w - 1;
		neighborIndexes[3][0] = cell.h;
		neighborIndexes[3][1] = cell.w + 1;
		for (int i = 0; i < 4; ++i) {
			int w = neighborIndexes[i][1];
			int h = neighborIndexes[i][0];
			if (h >= 0 && h < H) {
				if (w >= 0 && w < W) {
					if (this.field[h][w] < 0) {
						this.field[h][w] = this.field[cell.h][cell.w] + 1;
						neighbors.add(new Cell(h, w));
						this.result = Math.max(this.result, this.field[h][w]);
					}
				}
			}
		}
		return neighbors;
	}

	Main(int H, int W, List<String> lines) {
		this.H = H;
		this.W = W;
		this.field = new int[H][W];
		this.queue = new ArrayDeque<>();
		for (int h = 0; h < H; ++h) {
			Arrays.fill(this.field[h], -1);
			String line = lines.get(h);
			for (int w = 0; w < W; ++w) {
				if (line.charAt(w) == '#') {
					this.field[h][w] = 0;
					this.queue.addLast(new Cell(h, w));
				}
			}
		}
		this.result = 0;
		calc();
		show();
	}

	void show() {
		System.out.println(this.result);
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int H = Integer.parseInt(tokens[0]);
		int W = Integer.parseInt(tokens[1]);
		List<String> lines = new ArrayList<>();
		for (int h = 0; h < H; ++h) {
			lines.add(in.readLine());
		}
		Main ins = new Main(H, W, lines);

	}
}