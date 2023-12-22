import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
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
	char[] s;
	char[] result;
	boolean enable = false;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		s = in.readLine().toCharArray();
	}

	boolean enable(char first, char second) {
		char[] pat = new char[N];
		pat[0] = first;
		pat[1] = second;
		for (int i = 2; i < N; ++i) {
			if (s[i - 1] == 'o') {
				if (pat[i - 1] == 'S') {
					pat[i] = pat[i - 2];
				} else {
					pat[i] = pat[i - 2] == 'S' ? 'W' : 'S';
				}
			} else {
				if (pat[i - 1] == 'S') {
					pat[i] = pat[i - 2] == 'S' ? 'W' : 'S';
				} else {
					pat[i] = pat[i - 2];
				}
			}
		}
		// 矛盾がないかチェック
		if (s[N - 1] == 'o') {
			if (pat[N - 1] == 'S') {
				if (pat[0] == pat[N - 2]) {
					result = Arrays.copyOf(pat, N);
					return true;
				} else {
					return false;
				}
			} else {
				if (pat[0] != pat[N - 2]) {
					result = Arrays.copyOf(pat, N);
					return true;
				} else {
					return false;
				}
			}
		} else {
			if (pat[N - 1] == 'S') {
				if (pat[0] != pat[N - 2]) {
					result = Arrays.copyOf(pat, N);
					return true;
				} else {
					return false;
				}
			} else {
				if (pat[0] == pat[N - 2]) {
					result = Arrays.copyOf(pat, N);
					return true;
				} else {
					return false;
				}
			}
		}
	}

	void calc() {
		if (enable('S', 'S')) {
			enable = true;
			return;
		} else if (enable('S', 'W')) {
			enable = true;
			return;
		} else if (enable('W', 'S')) {
			enable = true;
			return;
		} else {
			enable = enable('W', 'W');
		}
	}

	void showResult() {
		if (!enable) {
			System.out.println("-1");
		} else {
			for (int i = 0; i < N; ++i) {
				System.out.print(result[i]);
			}
			System.out.println("");
		}
	}
}