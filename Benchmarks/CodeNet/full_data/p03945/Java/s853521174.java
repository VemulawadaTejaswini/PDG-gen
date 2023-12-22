import java.util.*;
// warm-up
public class Main {

	static boolean isEnd (String s) {
		return s.indexOf("W")==-1 || s.indexOf("B")==-1;
	}

	static int changeColor (String s, char ch) {
		int k=0, len=s.length();
		while (len-->0) {
			if (s.charAt(len)!=ch) k++;
			else break;
		}
		return k;
	}

	static String modify (String s, char ch, boolean prepend) {
		int k=0, len=0, i=0;
		boolean add = false;
		StringBuilder t = new StringBuilder();
		if (prepend) {
			while (s.charAt(i++)==ch) t.append(ch=='B' ? 'W' : 'B');
			t.append(s.substring(i-1));
		} else {
			len = s.length();
			while (s.charAt(--len)==ch) t.append(ch=='B' ? 'W' : 'B');
			t = new StringBuilder(s.substring(0,len+1)).append(t);
		}
		return t.toString();
	}

	static void solve() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(); int k=0;
		StringBuilder a = new StringBuilder(s);
		while (!isEnd(a.toString())) {
			int r = changeColor(a.toString(), a.toString().endsWith("W") ? 'B' : 'W'), 
			l = changeColor(a.toString(), a.toString().startsWith("W") ? 'B' : 'W');
			if (l>r) {
				String t = modify(a.toString(), a.charAt(0), true);
				a = new StringBuilder(a.toString().startsWith("W") ? "B" : "W").append(a);								 	
			} else {
				String t = modify(a.toString(), a.charAt(a.length()-1), false);
				a = new StringBuilder(t).append(a.toString().endsWith("W") ? "B" : "W");
			}
			k++;
		}
		System.out.println(k);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}