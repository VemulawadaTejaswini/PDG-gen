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
			// ただし以前に現れた文字だった場合はその組み合わせの数だけ減る
			char c = s.charAt(i);
			Integer cnt = found.get(c);
			System.out.printf("r: %d\n", ret);
			if (cnt == null) {
				found.put(c, 1);
				System.out.printf("! [%d] : '%c'\n", i, c);

				// とる場合ととらない場合の2倍ずつ増える
				ret *= (2);
			} else {
				found.put(c, cnt + 1);
				System.out.printf("# [%d] : '%c' (%d)\n", i, c, cnt);
				// 今回取らない場合は全採用できる。少なくとも1倍以上。
				// 今回取る場合、以前に現れた同じ字がすべてOFFの場合、残りの文字数の組み合わせの数だけ増える。
				ret += Math.pow(2, i - cnt) - 1;
			}
		}
		// 最後に長さ0の数を惹く。
		ret --;
		ret %= (1_000_000_000L + 7);
		System.out.println(ret);
	}

}
