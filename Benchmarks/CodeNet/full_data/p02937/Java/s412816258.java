import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] s = scan.nextLine().toCharArray();
		char[] t = scan.nextLine().toCharArray();
		Map<Character, ArrayList<Integer>> map = new HashMap<>();

		int lastIndex = -1;
		int loopCnt = 0;
		boolean notExists = false;
		ArrayList<Integer> tmpL = new ArrayList<>();

		// 最大値を超えるような条件は与えられない
//		double max = Math.pow(10, 100);

		// 文字と要素番号をマップに格納
		for (int i = 0; i < s.length; i++) {
			tmpL = map.get(s[i]);
			if (tmpL == null) {
				tmpL = new ArrayList<>();
				map.put(s[i], tmpL);
			}
			tmpL.add(i);
		}

		// 文字が存在するかチェック
		for (char c : t) {
			if (!map.containsKey(c)) {
				notExists = true;
				break;
			}
		}
		if (notExists) {
			System.out.println(-1);
		}
		else {
			notExists = true;
			// 文字列tの文字を前方から順次比較
			for (char c : t) {
				tmpL = map.get(c);
				for (int i : tmpL) {
					if (i > lastIndex) {
						lastIndex = i;
						notExists = false;
						break;
					}
				}
				if (notExists) {
					loopCnt++;
					lastIndex = tmpL.get(0);
				}
				notExists = true;
			}
			System.out.println((s.length * loopCnt) + lastIndex + 1);
		}
	}
}
