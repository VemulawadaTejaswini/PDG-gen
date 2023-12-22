import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	char[] S;
	int Q;
	Query[] queries;
	Map<Character, Set<Integer>> map;

	static class Query {
		int type;
		int i, l, r;
		char c;

		Query(String line) {
			String[] tokens = line.split(" ");
			type = Integer.parseInt(tokens[0]);
			if (type == 1) {
				i = Integer.parseInt(tokens[1]) - 1;
				c = tokens[2].charAt(0);
			} else {
				l = Integer.parseInt(tokens[1]) - 1;
				r = Integer.parseInt(tokens[2]) - 1;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		S = in.readLine().toCharArray();
		Q = Integer.parseInt(in.readLine());
		queries = new Query[Q];
		for (int i = 0; i < Q; ++i) {
			queries[i] = new Query(in.readLine());
		}
		this.map = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			Character c = S[i];
			if (!map.containsKey(c)) {
				map.put(c, new HashSet<>());
			}
			map.get(c).add(i);
		}
	}

	int eval(Query query) {
		if (query.type == 1) {
			// replaceする
			char old = S[query.i];
			S[query.i] = query.c;
			map.get(old).remove(query.i);
			if(!map.containsKey(query.c)) {
				map.put(query.c, new HashSet<>());
			}
			map.get(query.c).add(query.i);
			return -1;
		} else {
			// countする
			int count = 0;
			for (Set<Integer> set : map.values()) {
				long num = set.stream().filter(x -> x >= query.l && x <= query.r).count();
				if (num > 0) {
					++count;
				}
			}
			return count;
		}
	}

	void calc() {
		for (int i = 0; i < Q; ++i) {
			int count = eval(queries[i]);
			if (count >= 0) {
				System.out.println(count);
			}
		}
	}

	void showResult() {
	}

}