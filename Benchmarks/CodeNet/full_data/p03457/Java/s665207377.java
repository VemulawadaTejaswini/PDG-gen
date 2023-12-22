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
	Tuple[] points;
	boolean enable = true;

	static class Tuple {
		int t, x, y;

		Tuple(int t, int x, int y) {
			this.t = t;
			this.x = x;
			this.y = y;
		}
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		points = new Tuple[N + 1];
		points[0] = new Tuple(0, 0, 0);
		for (int i = 0; i < N; ++i) {
			String[] tokens = in.readLine().split(" ");
			int t = Integer.parseInt(tokens[0]);
			int x = Integer.parseInt(tokens[1]);
			int y = Integer.parseInt(tokens[2]);
			points[i + 1] = new Tuple(t, x, y);
		}
	}

	void calc() {
		for (int i = 0; i < N; ++i) {
			Tuple prev = points[i];
			Tuple next = points[i + 1];
			if (next.t - prev.t < Math.abs(next.x - prev.x) + Math.abs(next.y - prev.y)) {
				enable = false;
				return;
			} else if ((Math.abs(next.x - prev.x) + Math.abs(next.y - prev.y) - next.t - prev.t) % 2 != 0) {
				enable = false;
				return;
			}
		}
	}

	void showResult() {
		System.out.println((enable ? "Yes" : "No"));
	}
}