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
		String[] tokens = in.readLine().split(" ");
		Integer val = Integer.parseInt(tokens[0] + tokens[1]);
		for (int i = 1;; ++i) {
			int v = i * i;
			if (v > val) {
				System.out.println("No");
				break;
			} else if (v == val) {
				System.out.println("Yes");
				break;
			}
		}
	}

	void calc() {
	}

	void showResult() {
	}
}
