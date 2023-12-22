import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	long N, K;
	long min;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Long.parseLong(tokens[0]);
		K = Long.parseLong(tokens[1]);
	}

	void calc() {
		min = N;
		min = Math.min(min, N % K);
		min = Math.min(min, K - N % K);

	}

	void showResult() {
		System.out.println(min);
	}

}
