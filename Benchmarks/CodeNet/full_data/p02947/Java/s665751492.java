import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		List<List<Character>> charList = new ArrayList<>();
		for (int j = 0; j < n; ++j) {
			String s = sc.next();
			List<Character> tmpList = new ArrayList<>();
			for (int i = 0; i < s.length(); i++) {
				tmpList.add(s.charAt(i));
			}
			Collections.sort(tmpList);
			charList.add(tmpList);
		}
		for (int i = 0; i < charList.size() - 1; i++) {
			for (int j = i + 1; j < charList.size(); j++) {
				boolean flag = true;
				for (int k = 0; k < 5; k++) {
					if (charList.get(i).get(k) != charList.get(j).get(k)) {
						flag = false;
						break;
					}
					if (charList.get(i).get(9 - k) != charList.get(j).get(9 - k)) {
						flag = false;
						break;
					}
				}
				if (flag) {
					++count;
				}
			}
		}
		System.out.println(count);
	}
}
