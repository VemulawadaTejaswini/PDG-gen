import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String S[] = new String[n];
		Map<String, Integer> map[] = new TreeMap[n];
		String abc[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		for(int i = 0; i < n; i++) {
			map[i] = new TreeMap<String, Integer>();
			for(int j = 0; j < abc.length; j++) {
				map[i].put(abc[j], 0);
			}
		}
		for(int i = 0; i < n; i++) {
			S[i] = sc.next();
			for(int j = 0; j < S[i].length(); j++) {
				String str = S[i].substring(j, j + 1);
				map[i].put(str, map[i].get(str) + 1);
			}
		}
		
		String ans = "";
		for(int i = 0; i < 26; i++) {
			int temp = Integer.MAX_VALUE;
			for(int j = 0; j < n; j++) {
				temp = Math.min(map[j].get(abc[i]), temp);
			}
			ans += repeat(abc[i], temp);
		}
		System.out.println(ans);
	}
	
	public static String repeat(String str, int n) {
		String rs = "";
		for(int i = 0; i < n; i++) {
			rs += str;
		}
		return rs;
	}
}
