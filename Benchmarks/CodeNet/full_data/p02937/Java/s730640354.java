import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t = scan.nextLine();

		int N = s.length();
		char[] sChars = s.toCharArray();
		char[] tChars = t.toCharArray();
		int lastIndex = 0;
		int loopCnt = 0;

		// 文字と要素番号をマップに格納
		Map<Character, List<Integer>> map = new HashMap<>();
		List<Integer> tmpL = new ArrayList<>();
		for (int i = 0; i < sChars.length; i++) {
			tmpL = map.get(sChars[i]);
			if (tmpL == null) {
				tmpL = new ArrayList<>();
				map.put(sChars[i], tmpL);
			}
			tmpL.add(i);
		}

		for (char c : tChars) {
			if (!map.containsKey(c)) {
				System.out.println(-1);
				return;
			}
		}

		Map<Character, Integer> beforeMap = new HashMap<>();
		boolean exists = false;
		for (char c : tChars) {
			tmpL = map.get(c);
			int start = 0;
			Integer tmpI = beforeMap.get(c);
			if (tmpI != null) {
				start = tmpI + 1;
			}
			beforeMap.clear();

			// 続きから後ろを確認
			for (int i = start; i < tmpL.size(); i++) {
				if (tmpL.get(i) > lastIndex) {
					lastIndex = tmpL.get(i);
					beforeMap.put(c, i);
					exists = true;
					break;
				}
			}
			if (!exists) {
				loopCnt++;
				lastIndex = tmpL.get(0);
				beforeMap.put(c, 0);
			}
			else {
				exists = false;
			}
		}
		System.out.println(N * loopCnt + lastIndex + 1);
	}
}
