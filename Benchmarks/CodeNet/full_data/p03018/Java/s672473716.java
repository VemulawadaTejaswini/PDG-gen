import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
	static class Range {
		int start, end;

		Range(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		String s = convert(in.readLine());
		Deque<Character> deque = new ArrayDeque<>();
		for (int i = 0; i < s.length(); ++i) {
			deque.addLast(s.charAt(i));
		}

		long result = count(deque);

		System.out.println(result);

		in.close();
	}

	static long count(Deque<Character> deque) {
		long result = 0;
		int aCount = 0;
		while (!deque.isEmpty()) {
			Character c = deque.pollFirst();
			if (c == 'A') {
				++aCount;
			} else if (c == 'B' || c == 'C') {
				aCount = 0;
			} else {
				result += aCount;
			}
		}
		return result;
	}

	static int swap(char[] chars, int dIndex) {
		int result = 0;
		for (int i = dIndex - 1; i >= 0; --i) {
			if (chars[i] == 'A') {
				++result;
			} else {
				if (result == 0) {
					// 何もしない
				} else {
					chars[i + 1] = 'D';
					chars[dIndex] = 'A';
				}
				break;
			}
		}
		return result;
	}

	static String convert(String s) {
		return s.replaceAll("BC", "D");
	}

}