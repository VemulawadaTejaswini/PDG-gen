import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int endA = 0, startB = 0, both = 0, contain = 0;
	int result = 0;

	Main(List<String> list) {
		for (int i = 0; i < list.size(); ++i) {
			String str = list.get(i);
			if (str.endsWith("A") && str.startsWith("B")) {
				++both;
			} else if (str.endsWith("A")) {
				endA++;
			} else if (str.startsWith("B")) {
				startB++;
			}
			if (str.contains("AB")) {
				for (int j = 0; j < str.length() - 1; ++j) {
					if (str.substring(j, j + 2).equals("AB")) {
						++contain;
					}
				}
			}
		}
		result += contain;
		result += Math.max(both - 1, 0);
		if (endA > 0) {
			result++;
			endA--;
		}
		if (startB > 0) {
			result++;
			startB--;
		}
		result += Math.min(endA, startB);
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		List<String> list = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			list.add(in.readLine());
		}

		in.close();
		Main main = new Main(list);
		System.out.println(main.result);
	}

}