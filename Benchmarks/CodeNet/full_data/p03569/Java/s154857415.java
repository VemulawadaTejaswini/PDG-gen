import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		int ans = 0;
		for(int i = 0 ; i < n ; i++) {
			if(s.charAt(i) == 'x') {
				ans++;
			}
		}
		s = s.replace("x", "");
		if(s.length() == 1) {
			System.out.println(ans);
		} else {
			String x = "";
			for(int i = s.length() - 1 ; i >= 0 ; i--) {
				x += s.charAt(i);
			}
			if(s.equals(x)) {
				System.out.println(ans);
			} else {
				System.out.println(-1);
			}
		}
	}
}
