import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	int[] vals;
	String S;
	String s0, s1;
	int result = 0;
	Map<String, String> cache;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		this.N = Integer.parseInt(in.readLine());
		this.vals = new int[N];
		S = in.readLine();
		for (int i = 0; i < N; ++i) {
			vals[i] = Integer.parseInt(S.substring(i, i + 1));
		}
		cache = new HashMap<>();

		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < S.length(); ++i) {
			char c = S.charAt(i);
			if (c == '1') {
				strBuilder.append("0");
			} else {
				strBuilder.append("1");
			}
		}
		s0 = strBuilder.toString();
		strBuilder = new StringBuilder();
		for (int i = 0; i < S.length(); ++i) {
			char c = S.charAt(i);
			if (c == '3') {
				strBuilder.append("1");
			} else {
				strBuilder.append("0");
			}
		}
		s1 = strBuilder.toString();
	}

	int calc(int[] array) {
		if (array.length == 1) {
			return array[0];
		} else if (array.length == 2) {
			return Math.abs(array[1] - array[0]);
		} else {
			int[] next = new int[array.length - 1];
			for (int i = 0; i + 1 < array.length; ++i) {
				next[i] = Math.abs(array[i + 1] - array[i]);
			}
			return calc(next);
		}
	}

	void initCache(int index, int[] array) {
		if (index == 0) {
			// cacheに値を入れる
			StringBuilder strBuilder = new StringBuilder();
			for (int i = 0; i < array.length; ++i) {
				strBuilder.append(array[i]);
			}
			int val = calc(array);
			cache.put(strBuilder.toString(), Integer.toString(val));
		} else {
			for (int i = 0; i < 2; ++i) {
				array[index - 1] = i;
				initCache(index - 1, array);
			}
		}
	}

	int calc(String str) {
		int[] array = new int[str.length()];
		for (int i = 0; i < str.length(); ++i) {
			array[i] = Integer.parseInt(str.substring(i, i + 1));
		}
		return calc(array);
	}

	int subCalc(String str) {
		if (str.length() <= 15) {
			return calc(str);
		} else {
			StringBuilder next = new StringBuilder();
			for (int i = 0; i + 14 < str.length(); ++i) {
				String s = cache.get(str.substring(i, i + 15));
				next.append(s);
			}
			return subCalc(next.toString());
		}
	}

	void calc() {
		int[] array = new int[15];
		initCache(15, array);
		int diff0 = subCalc(s0);
		int diff1 = subCalc(s1);
		result = Math.abs(diff0-diff1);
	}

	void showResult() {
		System.out.println(result);
	}

}