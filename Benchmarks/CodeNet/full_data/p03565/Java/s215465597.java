import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		String ans = "!";
		char[] s = S.toCharArray();
		char[] t = T.toCharArray();
		if(t.length > s.length) {
			System.out.println("UNRESTORABLE");
			return;
		}
		for(int i = 0; i < s.length-t.length+1; i++) {
			boolean ok = true;
			String R = S;
			for(int j = i; j < i+t.length; j++) {
				if(s[j] != t[j-i] && s[j] != '?'){
					ok = false;
					break;
				}
			}
			if(ok) {
				R = R.replace('?', 'a');
				R = R.substring(0, i) + T + R.substring(i+t.length); 
				if(ans.equals("!"))
					ans = R;
				if(R.compareTo(ans) == -1)
					ans = R;
			}
		}
		if(ans.equals("!"))
			System.out.println("UNRESTORABLE");
		else
			System.out.println(ans);

	}

}
