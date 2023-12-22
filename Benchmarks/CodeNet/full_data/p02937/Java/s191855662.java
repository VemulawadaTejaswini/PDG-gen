import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean[] used = new boolean[26];
		for (char c : s.toCharArray()) {
		    used[c - 'a'] = true;
		}
		String t = sc.next();
		int cur = 0;
		long times = 0;
		for (char c : t.toCharArray()) {
		    if (!used[c - 'a']) {
		        System.out.println(-1);
		        return;
		    }
		    cur = s.indexOf(c, cur);
		    if (cur < 0) {
		        times++;
		        cur = s.indexOf(c, 0);
		    }
		    cur++;
		}
		System.out.println(times * s.length() + cur);
   }
}
