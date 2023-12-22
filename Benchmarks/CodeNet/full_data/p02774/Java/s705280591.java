import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	int K;
	long[] A;
	List<Long> list;

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
		K = Integer.parseInt(tokens[1]);
		A = new long[N];
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(tokens[i]);
		}
		Arrays.sort(A);
	}

	void calc() {
		list = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			for (int j = i + 1; j < N; ++j) {
				list.add(A[i] * A[j]);
			}
		}
		Collections.sort(list);
	}

	void showResult() {
		System.out.println(list.get(K - 1));
	}
}
