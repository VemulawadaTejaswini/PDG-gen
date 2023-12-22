import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		Set<Character> set1 = new HashSet<>();
		Set<Character> set2 = new HashSet<>();
		int max = 0;
		
		for (int i = 1; i < N; i++) {
			int count = 0;
			
			String s1 = s.substring(0, i);
			String s2 = s.substring(i);
			
			for (int j = 0; j < s1.length(); j++) {
				set1.add(s1.charAt(j));
			}
			for (int j = 0; j < s2.length(); j++) {
				set2.add(s2.charAt(j));
			}
			for (char c : set1) {
				if (set2.contains(c)) {
					count++;
				}
			}
			set1.clear();
			set2.clear();
			//System.out.println(s1 + ":" + s2 + "=" + count);
			max = Math.max(count, max);
		}
		System.out.println(max);
	}
}
