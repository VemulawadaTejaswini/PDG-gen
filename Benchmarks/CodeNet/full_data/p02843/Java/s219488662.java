import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int X;
	int result = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		X = Integer.parseInt(in.readLine());
	}

	void calc() {
		int mul = X / 100;
		int mod = X % 100;
		if (mod > mul * 5) {
			result = 0;
		} else {
			result = 1;
		}
	}

	void showResult() {
		System.out.println(result);
	}
}
