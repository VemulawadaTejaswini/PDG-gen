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
		int[] args = new int[4];
		for (int i = 0; i < 4; ++i) {
			args[i] = Integer.parseInt(tokens[i]);
		}
		boolean enable = false;
		if (Math.abs(args[2] - args[0]) <= args[3]) {
			enable = true;
		} else if (Math.abs(args[2] - args[1]) <= args[3] && Math.abs(args[1] - args[0]) <= args[3]) {
			enable = true;
		}
		System.out.println((enable ? "Yes" : "No"));
	}

	void calc() {
	}

	void showResult() {
	}
}
