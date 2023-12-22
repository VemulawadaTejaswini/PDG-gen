import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {
	String S;
	boolean result = false;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		S = in.readLine();

	}

	boolean isKaibun(String s) {
		int n = s.length() / 2;
		for (int i = 0; i < n; ++i) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	void calc() {
		result = isKaibun(S);
		if (!result) {
			return;
		}
		String subStr1 = S.substring(0, (S.length() - 1) / 2);
		result = isKaibun(subStr1);
		if (!result) {
			return;
		}
		result = isKaibun(S.substring((S.length() + 3) / 2 - 1, S.length()));

	}

	void showResult() {
		System.out.println((result ? "Yes" : "No"));
	}

}
