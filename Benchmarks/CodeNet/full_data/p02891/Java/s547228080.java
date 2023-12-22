
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();
		long ans = 0;
		char front = s.charAt(0);
		int frnum = 0;
		for(int i = 0; i < s.length(); i++) {
			if(front == s.charAt(i)) {
				frnum++;
			} else {
				break;
			}
		}
		int num = 0;
		for(int i = 0; i < s.length(); i++) {
			if(front == s.charAt(i)) {
				num++;
			} else {
				ans += num / 2;
				num = 1;
				front = s.charAt(i);
			}
		}
		ans += num / 2;
		ans *= k;
		if(frnum % 2 == 1 && num % 2 == 1 && s.charAt(0) == s.charAt(s.length() - 1)) {
			ans += k - 1;
		}
		System.out.println(ans);
	}

}
