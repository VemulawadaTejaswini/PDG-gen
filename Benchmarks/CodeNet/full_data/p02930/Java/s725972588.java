import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		boolean[] nodeTypes = new boolean[N];
		Arrays.fill(nodeTypes, true);
		for (int i = N / 2; i < N; ++i) {
			nodeTypes[i] = false;
		}
		for (int i = 0; i + 1 < N; ++i) {
			List<Boolean> edgeTypes = new ArrayList<>();
			for (int j = i + 1; j < N; ++j) {
				edgeTypes.add(nodeTypes[i] ^ nodeTypes[j]);
			}
			System.out.println(conv(edgeTypes));
		}

	}

	static String conv(List<Boolean> edgeTypes) {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(conv(edgeTypes.get(0)));
		for (int i = 1; i < edgeTypes.size(); ++i) {
			strBuilder.append(" " + conv(edgeTypes.get(i)));
		}
		return strBuilder.toString();
	}

	static String conv(Boolean edgeType) {
		if (edgeType) {
			return "1";
		} else {
			return "2";
		}
	}
}