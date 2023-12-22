import java.util.*;
// warm-up
// Dont think this solution (ugly) will work. TLE/WA for sure.
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder(sc.next());
		boolean first = true;
		int i = (s.length()>=5) ? 2 : 0;
		while (true) {
			int len = s.length();
			if (len<=2) break;
			if (len>=5) {
				if (s.charAt(i-2)==s.charAt(i+1) || s.charAt(i-1)==s.charAt(i+2)) {
					if (s.charAt(i-1)!=s.charAt(i+1)) {
						s.deleteCharAt(i); first=!first; continue;
					} else if (len==5) break;
				}						
			} else {
				i=0;
				if (len==4) {
					if (s.charAt(i)!=s.charAt(i+2)) {
						s.deleteCharAt(i+1); first=!first; continue;
					} else if (s.charAt(i+1)!=s.charAt(i+3)) {
						s.deleteCharAt(i+2); first=!first; continue;
					} else break;
				} else if (len==3) {
					if (s.charAt(i)!=s.charAt(i+2)) {
						s.deleteCharAt(i+1); first=!first;
					}
					break;
				}
			}
			i++;
		}
		System.out.println(first ? "Second" : "First");
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}