import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int s01 = Integer.parseInt(s.substring(0,2));
		int s23 = Integer.parseInt(s.substring(2));
		String ans;
		if(s01 == 0) {
			if(s23 == 0) {
				ans = "NA";
			} else if(1 <= s23 && s23 <= 12) {
				ans = "YYMM";
			} else {
				ans = "NA";
			}
		} else if(1 <= s01 && s01 <= 12) {
			if(s23 == 0) {
				ans = "MMYY";
			} else if(1 <= s23 && s23 <= 12) {
				ans = "AMBIGUOUS";
			} else {
				ans = "MMYY";
			}
		} else {
			if(s23 == 0) {
				ans = "NA";
			} else if(1 <= s23 && s23 <= 12) {
				ans = "YYMM";
			} else {
				ans = "NA";
			}
		}
		System.out.println(ans);
	}
}
