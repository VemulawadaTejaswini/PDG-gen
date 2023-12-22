import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, K, C;
	String S;
	List<Integer> result;

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
		C = Integer.parseInt(tokens[2]);
		S = in.readLine();
	}

	void calc() {
		List<Integer> indexes = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			if (S.charAt(i) == 'o') {
				indexes.add(i);
				i += C;
			}
		}
		List<Integer> indexes2 = new ArrayList<>();
		for (int i = N - 1; i >= 0; i--) {
			if (S.charAt(i) == 'o') {
				indexes2.add(i);
				i -= C;
			}
		}
		result = new ArrayList<>();
		int n = indexes.size();
		for (int i = 0; i < n; ++i) {
			if (indexes.get(i) == indexes2.get(n - 1 - i)) {
				result.add(indexes.get(i));
			}
		}
		if (result.size() > K) {
			result.clear();
		}
	}

	void showResult() {
		for (int i = 0; i < result.size(); ++i) {
			System.out.println((result.get(i) + 1));
		}
	}
}
