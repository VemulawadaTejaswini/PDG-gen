import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int M1, D1, M2, D2;
	boolean result = false;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		M1 = Integer.parseInt(tokens[0]);
		D1 = Integer.parseInt(tokens[1]);
		tokens = in.readLine().split(" ");
		M2 = Integer.parseInt(tokens[0]);
		D1 = Integer.parseInt(tokens[1]);

	}

	void calc() {
		if (M1 != M2) {
			result = true;
		}
	}

	void showResult() {
		System.out.println(result ? 1 : 0);
	}
}
