import java.util.*;

 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		
		HashMap<Character, TreeSet<Integer>> map = new HashMap<>();
		for (int i=0;i<26;i++) {
			map.put((char)('a'+i), new TreeSet<Integer>());
		}
		
		for (int i=0;i<s.length();i++) {
			map.get(s.charAt(i)).add(i);
		}
		int pos = -1;
		long num = 0;
		for (int i=0;i<t.length();i++) {
			if (map.get(t.charAt(i)).isEmpty()) {
				System.out.println(-1);
				return;
			} else {
				if (map.get(t.charAt(i)).higher(pos) != null) {
					pos = map.get(t.charAt(i)).higher(pos);
				} else {
					num++;
					pos = map.get(t.charAt(i)).first();
				}
			}
		}
		
		
		System.out.println(num*s.length()+pos+1);
	}
}
 