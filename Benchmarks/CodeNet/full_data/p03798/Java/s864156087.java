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

	boolean enable(char first, char second, char third) {
		char[] pat = new char[N];
		pat[0] = first;
		pat[1] = second;
		pat[2] = third;
		// ここでは矛盾しないものが来ているとする
		for (int i = 3; i < N; ++i) {
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
		boolean isOK = true;
		if (s[N - 1] == 'o') {
			if (pat[N - 1] == 'S') {
				if (pat[0] != pat[N - 2]) {
					isOK = false;
				}
			} else {
				if (pat[0] == pat[N - 2]) {
					isOK = false;
				}
			}
		} else {
			if (pat[N - 1] == 'S') {
				if (pat[0] == pat[N - 2]) {
					isOK = false;
				}
			} else {
				if (pat[0] != pat[N - 2]) {
					isOK = false;
				}
			}
		}
		if (s[0] == 'o') {
			if (pat[0] == 'S') {
				if (pat[1] != pat[N - 1]) {
					isOK = false;
				}
			} else {
				if (pat[1] == pat[N - 1]) {
					isOK = false;
				}
			}
		} else {
			if (pat[0] == 'S') {
				if (pat[1] == pat[N - 1]) {
					isOK = false;
				}
			} else {
				if (pat[1] != pat[N - 1]) {
					isOK = false;
				}
			}
		}
		if (isOK) {
			result = Arrays.copyOf(pat, N);
		}
		return isOK;
	}

	void calc() {
		if(s[1] == 'o') {
			if(enable('S', 'S', 'S')) {
				enable = true;
				return;				
			}
			if(enable('W', 'S', 'W')) {
				enable = true;
				return;				
			}
			if(enable('S', 'W', 'W')) {
				enable = true;
				return;				
			}
			if(enable('W', 'W', 'S')) {
				enable = true;
				return;				
			}
		}else {
			if(enable('S', 'S', 'W')) {
				enable = true;
				return;				
			}
			if(enable('W', 'S', 'S')) {
				enable = true;
				return;				
			}
			if(enable('S', 'W', 'S')) {
				enable = true;
				return;				
			}
			if(enable('W', 'W', 'W')) {
				enable = true;
				return;				
			}
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