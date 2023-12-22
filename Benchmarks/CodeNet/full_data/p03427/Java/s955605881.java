import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		String s = String.valueOf(n);
		long a = Integer.parseInt(s.charAt(0)+"");
		long l = s.length();
		boolean all = true;
		for(char c : s.toCharArray()) {
			if(c != '9') {
				all = false;
			}
		}
		int wa = 0;
		for(char c : s.toCharArray()) {
			wa += (c - '0');
		}
		if(l == 1) {
			System.out.println(s);
			return;
		}
		System.out.println(all ? Math.max(wa, 9L*l) : Math.max(9*(l-1)+a-1, wa));
	}
}
