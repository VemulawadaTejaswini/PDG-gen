import java.util.*;
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

	int[][] c;

	Main(BufferedReader in) throws IOException {
		c = new int[3][3];
		for (int i = 0; i < 3; ++i) {
			String[] tokens = in.readLine().split(" ");
			for (int j = 0; j < 3; ++j) {
				c[i][j] = Integer.parseInt(tokens[j]);
			}
		}
		for (int i = 0; i < 3; ++i) {
			for (int j = 1; j < 3; ++j) {
				c[j][i] -= c[0][i];
			}
		}
		for (int i = 0; i < 3; ++i) {
			c[0][i] = 0;
		}
		boolean enable = true;
		for (int i = 0; i < 3; ++i) {
			boolean cond = true;
			for (int j = 1; j < 3; ++j) {
				if (c[i][j] != c[i][0]) {
					cond = false;
				}
			}
			if (!cond) {
				enable = false;
				break;
			}
		}
		System.out.println((enable ? "Yes" : "No"));
	}

	void calc() {
	}

	void showResult() {
	}
}
