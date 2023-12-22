import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		int N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		int[] a = new int[N];
		for (int i = 0; i < N; ++i) {
			a[i] = Integer.parseInt(tokens[i]);
		}
		int[] b = new int[N];
		Arrays.fill(b, 0);

		for (int i = N - 1; i >= 0; --i) {
			int count = 0;
			for (int j = 2; j * (i + 1) <= N; ++j) {
				count += a[j * (i + 1) - 1];
			}
			if (count % 2 == a[i]) {
				b[i] = 0;
			} else {
				b[i] = 1;
			}
		}
		List<Integer> indexes = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			if (b[i] > 0) {
				indexes.add(i + 1);
			}
		}
		System.out.println(indexes.size());
		if (indexes.size() > 0) {
			StringBuilder strBuilder = new StringBuilder();
			strBuilder.append(Integer.toString(indexes.get(0)));
			for (int i = 1; i < indexes.size(); ++i) {
				strBuilder.append(" " + (indexes.get(i)));
			}
			System.out.println(strBuilder.toString());
		}

	}
}