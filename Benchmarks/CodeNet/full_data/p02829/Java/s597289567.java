import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int A, B, result;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		A = Integer.parseInt(in.readLine());
		B = Integer.parseInt(in.readLine());

	}

	void calc() {
		for (int i = 1; i <= 3; ++i) {
			if (A != i && B != i) {
				result = i;
			}
		}
	}

	void showResult() {
		System.out.println(result);
	}
}
