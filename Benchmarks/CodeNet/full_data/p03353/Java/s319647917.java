import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int K = Integer.parseInt(in.nextLine());
		in.close();
		Set<String> targetStrs = getTargetStrs(s);
		Set<String> subStrs = new TreeSet<>();
		for (String targetStr : targetStrs) {
			subStrs.addAll(getSubStrs(targetStr)[1]);
		}
		List<String> subStrList = new ArrayList<>();
		subStrList.addAll(subStrs);
		Collections.sort(subStrList);
		System.out.println(subStrList.get(K - 1));
	}

	public static Set<String> getTargetStrs(String s) {
		Set<Character> headChars = new TreeSet<>();
		for (int i = 0; i < s.length(); ++i) {
			headChars.add(s.charAt(i));
		}
		List<Character> list = new ArrayList<>();
		list.addAll(headChars);
		Collections.sort(list);
		Character limitChar = list.get(Math.min(4, headChars.size() - 1));
		Set<String> result = new HashSet<>();
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) <= limitChar) {
				result.add(s.substring(i, Math.min(i + 5, s.length())));
			}
		}
		return result;
	}

	/**
	 * [0]: 今回生成したもの [1]: 全体
	 * 
	 * @param s
	 * @return
	 */
	public static Set<String>[] getSubStrs(String s) {
		Set<String>[] result = new Set[2];
		if (s.length() == 1) {
			result[0] = new HashSet<String>();
			result[1] = new HashSet<String>();
			result[0].add(s);
			result[1].add(s);
			return result;
		} else {
			Set<String>[] subStrs = getSubStrs(s.substring(1, s.length()));
			result[1] = subStrs[1];
			result[0] = new HashSet<String>();
			String head = s.substring(0, 1);
			result[0].add(head);
			for (String subStr : subStrs[0]) {
				result[0].add(head + subStr);
			}
			result[1].addAll(result[0]);
			return result;
		}
	}
}