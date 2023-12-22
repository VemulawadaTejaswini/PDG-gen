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

	int N;
	int[] p;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		p = new int[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			p[i] = Integer.parseInt(tokens[i]) - 1;
		}
	}

	void swap(int i, int j) {
		int temp = p[i];
		p[i] = p[j];
		p[j] = temp;
	}

	void calc() {
		int count = 0;
		for (int i = 0; i + 1 < N; ++i) {
			if (p[i] == i || p[i + 1] == i + 1) {
				count++;
				swap(i, i + 1);
			}
		}
		System.out.println(count);
	}

	void showResult() {
	}
}