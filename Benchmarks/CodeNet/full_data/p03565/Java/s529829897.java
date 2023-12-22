
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char []s = sc.next().toCharArray();
		String t = sc.next();
		
		int n = s.length;
		int m = t.length();
		boolean jdg = false;
		
		if(n < m) {
			System.out.println("UNRESTORABLE");
			return;
		}
		
		int cnt = m-1;
		int num = -1;
		
		for(int i = n-1 ;i >= 0 ;i--) {
			if(s[i] =='?' || s[i] == t.charAt(cnt)) {
				cnt--;
			}
			else {
				cnt = m-1;
			}
			if(cnt == -1) {
				num = i;
				jdg = true;
				break;
			}
			
		}
		
		cnt = 0;
		
		for(int i = 0 ;i < n ;i++) {
			if(num > i || cnt == m) {
				if(s[i] == '?') {
					s[i] = 'a';
				}
			}
			else {
				s[i] = t.charAt(cnt);
				cnt++;
			}
		}
		
		String ans = String.valueOf(s);
		if(!jdg) {
			System.out.println("UNRESTORABLE");
			return;
		}
		System.out.println(ans);
	}
}
