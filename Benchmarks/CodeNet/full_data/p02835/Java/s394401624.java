import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int[] A;
	boolean isBurst = false;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		A = new int[3];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < 3; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}
	}

	void calc() {
		int sum = 0;
		for (int i = 0; i < 3; ++i) {
			sum += A[i];
		}
		if (sum >= 22) {
			isBurst = true;
		}
	}

	void showResult() {
		System.out.println((isBurst ? "bust" : "win"));
	}
}
