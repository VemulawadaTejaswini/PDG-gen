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

	Main(BufferedReader in) throws IOException {
		int N = Integer.parseInt(in.readLine());
		String[] S = in.readLine().split(" ");
		Set<String> set = new HashSet<>();
		for (int i = 0; i < N; ++i) {
			set.add(S[i]);
		}
		if (set.size() == 3) {
			System.out.println("Three");
		} else {
			System.out.println("Four");
		}
	}

	void calc() {
	}

	void showResult() {
	}
}
