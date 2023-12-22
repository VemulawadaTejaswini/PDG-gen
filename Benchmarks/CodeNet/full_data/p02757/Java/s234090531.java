import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, P;
	String S;
	List<BigDecimal> vals;
	long result = 0;
	Map<BigDecimal, List<Integer>> map;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		P = Integer.parseInt(tokens[1]);
		S = in.readLine();
		this.map = new HashMap<>();
		// 初期化
		BigDecimal zero = new BigDecimal(0);
		this.map.put(zero, new ArrayList<Integer>());
		map.get(zero).add(S.length());
		BigDecimal p = new BigDecimal(P);
		StringBuilder strBuilder =new StringBuilder();
		for (int i = S.length()-1; i >=0; --i) {
			// String subStr = S.substring(i, S.length());
			strBuilder.insert(0,  S.charAt(i));
			String subStr = strBuilder.toString();
			BigDecimal val = new BigDecimal(subStr);
			BigDecimal mod = val.remainder(p);
			if (!map.containsKey(mod)) {
				map.put(mod, new ArrayList<Integer>());
			}
			map.get(mod).add(i);
		}
	}

	void calc() {
		if (P != 2 && P != 5) {
			for (BigDecimal mod : map.keySet()) {
				int listSize = map.get(mod).size();
				if (listSize <= 1) {
					// 何もしない
				} else if (listSize == 2) {
					result += 1;
				} else {
					result += (listSize) * (listSize - 1) / 2;
				}
			}
		} else {
			// 右端だけ見ればよい
			for (int i = 0; i < S.length(); ++i) {
				Integer val = Integer.parseInt(S.substring(i, i + 1));
				if (val % P == 0) {
					// i+1をresultに足す
					result += i + 1;
				}
			}
		}
	}

	void showResult() {
		System.out.println(result);
	}

}
