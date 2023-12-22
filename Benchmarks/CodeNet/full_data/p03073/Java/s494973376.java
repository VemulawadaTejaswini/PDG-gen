import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] s = S.toCharArray();
		int ans1 = 0, ans2 = 0;
		for(int i = 0; i < S.length(); i++) {
			if(i % 2 == 0) {
				if(s[i] == '0')
					ans2 += 1;
				else
					ans1 += 1;
			}
			else {
				if(s[i] == '0')
					ans1 += 1;
				else
					ans2 += 1;
			}
		}
		System.out.println(Math.min(ans1,  ans2));

	}

}