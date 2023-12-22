import java.util.*;
import java.math.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int l = s.length();
		int x = 0;
		int y = 0;
		String mozi = null;
		
		for (int i = 0; i < l; i++) {
			if (i != l - 1) {
				mozi = s.substring(i, i+1);
			} else {
				mozi = s.substring(i);
			}
			if (mozi.equals("N") || mozi.equals("S")) {
				x++;
			} else {
				y++;
			}
		}
		
		if (x == 1 || y== 1) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}