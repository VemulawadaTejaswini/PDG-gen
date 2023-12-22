import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int aa = Integer.parseInt(s.substring(0, 2));
		int bb = Integer.parseInt(s.substring(2, 4));
		String ans;
		if (check(aa, bb)) {
			if (check(bb, aa)) {
				ans = "AMBIGUOUS";
			} else {
				ans = "YYMM";
			}
		} else {
			if (check(bb, aa)) {
				ans = "MMYY";
			} else {
				ans = "NA";
			}
		}
		System.out.println(ans);
	}
	
	static boolean check(int y, int m) {
		if (m >= 1 && m <= 12) {
			return true;
		} else {
			return false;
		}
	}
}
