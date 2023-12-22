import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		String T = in.nextLine();

		Map<Character, Integer> sCount = new HashMap<>();
		Map<Character, Integer> tCount = new HashMap<>();
		for (int i = 0; i < S.length(); ++i) {
			Character c = S.charAt(i);
			if (!sCount.containsKey(c)) {
				sCount.put(c, 1);
			} else {
				sCount.put(c, sCount.get(c) + 1);
			}
		}
		for (int i = 0; i < T.length(); ++i) {
			Character c = T.charAt(i);
			if (!tCount.containsKey(c)) {
				tCount.put(c, 1);
			} else {
				tCount.put(c, tCount.get(c) + 1);
			}
		}
		List<Integer> sList = new ArrayList<>(sCount.size());
		List<Integer> tList = new ArrayList<>(tCount.size());
		sList.addAll(sCount.values());
		tList.addAll(tCount.values());
		Collections.sort(sList);
		Collections.sort(tList);
		if (sList.size() != tList.size()) {
			System.out.println("No");
		} else {
			boolean result = true;
			for (int i = 0; i < sList.size(); ++i) {
				if (sList.get(i) != tList.get(i)) {
					result = false;
					break;
				}
			}
			if (result) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		in.close();
	}
}