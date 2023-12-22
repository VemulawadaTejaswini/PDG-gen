import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	String S, T;
	String result;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		S = tokens[0];
		T = tokens[1];
	}

	void calc() {
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < N; ++i) {
			strBuilder.append(S.charAt(i));
			strBuilder.append(T.charAt(i));
		}
		result = strBuilder.toString();
	}

	void showResult() {
		System.out.println(result);
	}
}
