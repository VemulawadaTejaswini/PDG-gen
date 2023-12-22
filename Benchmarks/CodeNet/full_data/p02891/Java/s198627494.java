
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();
		boolean flag = false;
		long ans = 0;
		boolean corner = false;
		if(s.length() != 1 && s.charAt(0) == s.charAt(1) && s.charAt(0) == s.charAt(s.length() - 1)) {
			int i = 2;
			while(i < s.length()) {
				if(s.charAt(0) != s.charAt(i)) {
					break;
				}
				i++;
			}
			if(i % 2 != 0) {
				corner = true;
			}
		}
		char front = s.charAt(0);
		for(int i = 1; i < s.length(); i++) {
			if(flag) {
				flag = false;
			} else if(front == s.charAt(i)) {
				flag = true;
				ans++;
			}
			front = s.charAt(i);
		}
		ans *= k;
		if(!flag && corner && s.charAt(0) == s.charAt(s.length() - 1)) {
			ans += k - 1;
		}
		System.out.println(ans);
	}

}
