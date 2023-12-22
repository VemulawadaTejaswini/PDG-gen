import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        long ans = solve(s, t);
        System.out.println(ans);
	}

	private static long solve(String s, String t) {
		int [] a = {0,0};
		int b = 0;
		for( ; b < t.length(); b++) {
			index(t.charAt(b), s, a);
			if(a[0] == -1) {
				return -1;
			}
		}
		long ans = a[0] * s.length() + (a[1] + 1);
		return ans;
	}

	private static void index(char c, String s, int [] position) {
		if(s.indexOf(c) == -1) {
			position[0] = -1;
		} else {
			for(int i = position[1]; i < s.length(); i++) {
				if(c == s.charAt(i)) {
					position[1] = i;
					return;
				}
			}
			for(int i = 0; i < s.length(); i++) {
				if(c == s.charAt(i)) {
					position[0]++;
					position[1] = i;
					return;
				}
			}
		}
	}
}