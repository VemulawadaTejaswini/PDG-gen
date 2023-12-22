import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		String[] str;
		int N, Q, k;
		HashMap<Character, Integer> order = new HashMap<>();

		N = stdin.nextInt();
		str = new String[N];
		for (int i = 0; i < N; i++) {
			str[i] = stdin.next();
		}
		Q = stdin.nextInt();
		for (int i = 0; i < Q; ++i) {
			k = stdin.nextInt();
			String s = stdin.next();
			for (int j = 0; j < s.length(); j++) {
				order.put(s.charAt(j), j);
			}
			System.out.println(getOrder(str, k - 1, order));
		}

	}

	private static int getOrder(String[] str, int k, HashMap<Character, Integer> order) {
		String[] tmp = new String[str.length];
		for (int i = 0; i < str.length; i++) {
			tmp[i] = str[i];
		}
		Arrays.sort(tmp, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				for (int i = 0; i < s1.length(); i++) {
					if (i == s2.length()) {
						return 1;
					}
					if (order.get(s1.charAt(i)) < order.get(s2.charAt(i))) {
						return -1;
					}
					if (order.get(s2.charAt(i)) < order.get(s1.charAt(i))) {
						return 1;
					}
				}
				return -1;
			}
		});
		for (int i = 0; i < tmp.length; i++) {
			if (tmp[i].equals(str[k])) {
				return i + 1;
			}
		}
		return k;
	}

}
