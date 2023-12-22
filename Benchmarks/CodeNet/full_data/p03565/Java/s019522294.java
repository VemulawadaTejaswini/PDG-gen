import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		String T = in.next();
		int sl = S.length();
		int tl = T.length();
		char[] s = new char[sl];
		char[] t = new char[tl];
		for(int i=0;i<sl;i++) {
			s[i] = S.charAt(i);
		}
		for(int i=0;i<tl;i++) {
			t[i] = T.charAt(i);
		}
		
		int idx = -1;
		for(int i=0;i<=sl-tl;i++) {
			boolean match = true;
			for(int j=0;j<tl;j++) {
				if(s[i+j]=='?') continue;
				if(s[i+j]==t[j]) continue;
				match = false;
				break;
			}
			if(match) idx = i;
		}
		
		if(idx<0) System.out.println("UNRESTORABLE");
		else {
			for(int i=idx;i<idx+tl;i++) {
				s[i] = t[i-idx];
			}
			for(int i=0;i<sl;i++) {
				if(s[i]=='?') System.out.print('a');
				else System.out.print(s[i]);
			}
		}
		in.close();

	}

}
