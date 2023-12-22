import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		String s = in.next();
		long ret = 1;
		Map<Character, Integer> found = new TreeMap<>();

		for (int i = 0; i < n; i++) {
			// とる場合ととらない場合の2倍ずつ増える
			ret *= (2);
			// ただし以前に現れた文字だった場合はその組み合わせの数だけ減る
			char c = s.charAt(i);
			Integer cnt = found.get(c);
			if (cnt == null) {
				found.put(c, 1);
			} else {
				found.put(c, cnt + 1);
				ret -= ret / 4;
			}
		}
		// 最後に長さ0の数を惹く。
		ret --;
		System.out.println(ret);
	}

}
