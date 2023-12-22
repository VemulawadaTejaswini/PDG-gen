import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		int N = Integer.parseInt(in.readLine());
		int LEN = (int) (Math.pow(2, N));
		String[] tokens = in.readLine().split(" ");
		Long[] S = new Long[tokens.length];
		for (int i = 0; i < tokens.length; ++i) {
			S[i] = Long.parseLong(tokens[i]);
		}
		Arrays.sort(S, new Comparator<Long>() {
			@Override
			public int compare(Long o1, Long o2) {
				return -1 * Long.compare(o1, o2);
			}
		});
		boolean result = enable(S);
		if (result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	static String array2str(Long[] array) {
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < array.length; ++i) {
			strBuilder.append(array[i] + " ");
		}
		return strBuilder.toString();
	}

	static boolean enable(Long[] array) {
		// System.out.println(array2str(array));
		if (array.length == 2) {
			if (array[0] == array[1]) {
				return false;
			} else {
				return true;
			}
		}
		// 配列を二つに分割
		Long[] array0 = new Long[array.length / 2];
		Long[] array1 = new Long[array.length / 2];
		for (int i = 0; i < array0.length; ++i) {
			array0[i] = array[i * 2];
			array1[i] = array[i * 2 + 1];
		}
		return enable(array0) && enable(array1);
	}

}
