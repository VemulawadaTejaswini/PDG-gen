import java.util.*;

class Main {
	Scanner sc;
	String N;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.next();
		int ans = 0;
		int carry = 0;
		for (int i = N.length()-1; i >= 0; i--) {
			int d = N.charAt(i) - '0' + carry;
			if (d > 5) {
				carry = 1;
				ans += 10-d;
			} else {
				carry = 0;
				ans += d;
			}
		}
		System.out.println(ans+carry);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
