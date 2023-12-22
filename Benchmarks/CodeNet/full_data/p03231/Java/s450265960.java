import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length[] = {sc.nextInt(), sc.nextInt()};
		String st[] = {sc.next(), sc.next()};
		int gcd = (int)gcd(length[0], length[1]);
		boolean ok = true;
		for(int i = 0; i < gcd; i ++) {
			if(st[0].charAt(length[0] / gcd * i) != st[1].charAt(length[1] / gcd * i)) {
				ok = false;
				break;
			}
		}
		System.out.println(ok ? length[0] * length[1] / gcd : -1);
	}

	public static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}