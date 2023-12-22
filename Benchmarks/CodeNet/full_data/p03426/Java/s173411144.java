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

	static class Tuple {
		int h, w;

		Tuple(int h, int w) {
			this.h = h;
			this.w = w;
		}
	}

	int H, W, D;
	int[][] A;
	int Q;
	int[] L, R;
	Map<Integer, Tuple> map;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		H = Integer.parseInt(tokens[0]);
		W = Integer.parseInt(tokens[1]);
		D = Integer.parseInt(tokens[2]);
		A = new int[H][W];
		for (int i = 0; i < H; ++i) {
			tokens = in.readLine().split(" ");
			for (int j = 0; j < W; ++j) {
				A[i][j] = Integer.parseInt(tokens[j]);
			}
		}
		Q = Integer.parseInt(in.readLine());
		L = new int[Q];
		R = new int[Q];
		for (int i = 0; i < Q; ++i) {
			tokens = in.readLine().split(" ");
			L[i] = Integer.parseInt(tokens[0]);
			R[i] = Integer.parseInt(tokens[1]);
		}
		map = new HashMap<>();
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				Tuple tuple = new Tuple(i, j);
				map.put(A[i][j], tuple);
			}
		}
	}

	int sub(int l, int r) {
		int cost = 0;
		int current = l;
		while (current != r) {
			Tuple from = map.get(current);
			Tuple to = map.get(current + D);
			cost += Math.abs(to.h - from.h) + Math.abs(to.w - from.w);
			current += D;
		}
		return cost;
	}

	void calc() {
		for (int i = 0; i < Q; ++i) {
			int cost = sub(L[i], R[i]);
			System.out.println(cost);
		}

	}

	void showResult() {
	}
}