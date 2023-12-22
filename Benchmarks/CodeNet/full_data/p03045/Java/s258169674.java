import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
	int N, M;
	Set<Integer>[] conns;
	boolean[] done;
	int result;

	Main(int N, int M, List<String> lines) {
		this.N = N;
		this.M = M;
		this.conns = new Set[N];
		this.done = new boolean[N];
		Arrays.fill(this.done, false);
		for (int i = 0; i < N; ++i) {
			this.conns[i] = new HashSet<>();
		}
		for (String line : lines) {
			String[] tokens = line.split(" ");
			int X = Integer.parseInt(tokens[0]);
			int Y = Integer.parseInt(tokens[1]);
			int Z = Integer.parseInt(tokens[2]);
			this.conns[X - 1].add(Y - 1);
			this.conns[Y - 1].add(X - 1);
		}
		result = calc2();
	}

	int calc2() {
		int result = 0;
		for (int i = 0; i < N; ++i) {
			if (!this.done[i]) {
				++result;
				this.calc(i);
			}
		}
		return result;
	}

	void calc(int nodeIndex) {
		this.done[nodeIndex] = true;
		for (Integer key : conns[nodeIndex]) {
			this.conns[key].remove(nodeIndex);
			calc(key);
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int M = Integer.parseInt(tokens[1]);
		List<String> lines = new ArrayList<>(M);
		for (int i = 0; i < M; ++i) {
			lines.add(in.readLine());
		}
		in.close();
		Main ins = new Main(N, M, lines);
		System.out.println(ins.result);
	}
}