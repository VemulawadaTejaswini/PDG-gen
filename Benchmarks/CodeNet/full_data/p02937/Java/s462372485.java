import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
 
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] s = sc.nextLine().toCharArray();
		char[] t = sc.nextLine().toCharArray();
		
		Map<Character, List<Integer>> sMap = new HashMap<>();
		for (int i=0; i<s.length; i++) {
			List<Integer> l = sMap.get(s[i]);
			if (l == null) {
				l = new ArrayList<>();
				sMap.put(s[i], l);
			}
			l.add(i);
		}
		
		boolean contain = true;
		for (char c : t) {
			if (!sMap.containsKey(c)) {
				contain = false;
				break;
			}
		}
		
		if (!contain) {
			System.out.println(-1);
		}
		else {
			long cnt = 0;
			int length = s.length;
			for (char c : t) {
				List<Integer> l = sMap.get(c);
				cnt += getCnt(l, length);
			}
			System.out.println(cnt);
		}
	}
	
	private static int now = -1;
	
	private static int getCnt(List<Integer> l, int length) {
		for (Integer i : l) {
			if (i > now) {
				int ret = now == -1 ? i + 1 : i - now;
				now  = i;
				return ret;
			}
		}
		int ret = now == -1 ? length : length - now - 1;
		now = -1;
		return getCnt(l, length) + ret;
	}
}