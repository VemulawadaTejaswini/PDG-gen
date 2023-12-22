import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, X, Y;
	int[] xDists, yDists, dists;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		X = Integer.parseInt(tokens[1]) - 1;
		Y = Integer.parseInt(tokens[2]) - 1;
	}

	void calc() {
		this.xDists = new int[N];
		this.yDists = new int[N];

		// x起点の距離
		for (int i = 0; i < N; ++i) {
			xDists[i] = i - X;
		}
		for (int i = Y; i < N; ++i) {
			xDists[i] = 1 + i - Y;
		}
		// y起点の距離
		for (int i = 0; i < N; ++i) {
			yDists[i] = i - Y;
		}
		for (int i = 0; i <= X; ++i) {
			yDists[i] = -1 - (X - i);
		}
		// 距離としては，直接いくか，xを経由するか，yを経由するかの3卓
		this.dists = new int[N];
		Arrays.fill(dists, 0);
		for (int i = 0; i < N; ++i) {
			for (int j = i + 1; j < N; ++j) {
				int dist = j - i;
				dist = Math.min(dist, Math.abs(xDists[i]) + Math.abs(xDists[j]));
				dist = Math.min(dist, Math.abs(yDists[i]) + Math.abs(yDists[j]));
				dists[dist]++;
			}
		}

	}

	void showResult() {
		for (int i = 1; i < N; ++i) {
			System.out.println(dists[i]);
		}
	}
}
