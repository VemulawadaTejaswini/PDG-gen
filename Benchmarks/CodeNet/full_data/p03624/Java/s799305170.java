import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	private static Map<String, Integer> map = new HashMap<String, Integer>() {
		{
			put("a", 0);
			put("b", 0);
			put("c", 0);
			put("d", 0);
			put("e", 0);
			put("f", 0);
			put("g", 0);
			put("h", 0);
			put("i", 0);
			put("j", 0);
			put("k", 0);
			put("l", 0);
			put("m", 0);
			put("n", 0);
			put("o", 0);
			put("p", 0);
			put("q", 0);
			put("r", 0);
			put("s", 0);
			put("t", 0);
			put("u", 0);
			put("v", 0);
			put("w", 0);
			put("x", 0);
			put("y", 0);
			put("z", 0);
		}
	};

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String[] S = sc.next().split("");
		Set<String> alph = new HashSet<>();
		for (int i = 0; i < S.length; i++)
			alph.add(S[i]);
		for (String string : alph) {
			map.put(string, 1);
		}
		String ans = "None";
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 0) {
				ans = entry.getKey();
				break;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}