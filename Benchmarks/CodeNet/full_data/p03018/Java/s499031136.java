import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		String s = in.readLine();
		char[] chars = convert(s).toCharArray();
		List<Integer> dIndexes = new ArrayList<>();
		for (int i = 0; i < chars.length; ++i) {
			if (chars[i] == 'D') {
				dIndexes.add(i);
			}
		}
		int count = 0;
		for(int i = 0; i < dIndexes.size(); ++i) {
			count += swap(chars, dIndexes.get(i));
		}
		System.out.println(count);

		in.close();
	}

	static int swap(char[] chars, int dIndex) {
		int result = 0;
		for (int i = dIndex; i >= 1; --i) {
			if (chars[i - 1] == 'A' && chars[i] == 'D') {
				++result;
				chars[i - 1] = 'D';
				chars[i] = 'A';
			} else {
				break;
			}
		}
		return result;
	}

	static String convert(String s) {
		return s.replaceAll("BC", "D");
	}

}