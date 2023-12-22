import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int K = Integer.parseInt(tokens[1]);
		Map<Integer, List<Integer>> map = getMap(N, K);
		long result = 0;
		long size = map.get(0).size();
		result += size * size * size;
		if (K % 2 == 0) {
			size = map.get(K / 2).size();
			result += size * size * size;
		}
		System.out.println(result);

		in.close();
	}

	public static Map<Integer, List<Integer>> getMap(int N, int K) {
		Map<Integer, List<Integer>> result = new TreeMap<>();
		for (int i = 0; i < K; ++i) {
			result.put(i, new ArrayList<Integer>());
		}
		for (int i = 1; i <= N; i = i + K) {
			for (int j = i; j < i + K; ++j) {
				if (j > N) {
					break;
				}
				result.get(j % K).add(j);
			}
		}
		return result;
	}
}