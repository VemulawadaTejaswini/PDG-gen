import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		String s1 = replace(s);
		String t1 = replace(t);
		if (s1.equals(t1)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	public static String replace(String str) {
		char count = 0;
		StringBuilder sb = new StringBuilder();
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		for (int i = 0; i < str.length(); i++) {
			Character ct = map.get(str.charAt(i));
			if (ct == null) {
				map.put(str.charAt(i), (char) ('A' + count));
				ct = (char) ('A' + count);
				count++;
			}
			sb.append(ct);
		}
		return sb.toString();		
		
	}
}