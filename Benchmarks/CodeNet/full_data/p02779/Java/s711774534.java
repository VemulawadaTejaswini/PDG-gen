import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	boolean result = true;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		int N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		Set<Long> set = new HashSet<>();
		for (int i = 0; i < N; ++i) {
			long A = Long.parseLong(tokens[i]);
			if (set.contains(A)) {
				result = false;
				break;
			}
			set.add(A);
		}
	}

	void calc() {
	}

	void showResult() {
		System.out.println(result ? "YES" : "NO");
	}
}
