import java.util.*;
import java.math.*;
public class Main {
	static int r; 
	static int c;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int r = s.length() - 1;
		String ans = "Yes";
		if(isPal(s.substring(0, ((r - 1) / 2) + 1)) == false) ans = "No";
		if(isPal(s.substring((r + 3) / 2, r + 1)) == false) ans = "No";
		if(isPal(s) == false) ans = "No";
		System.out.println(ans);
	}
	public static boolean isPal(String s) {
		int l = 0;
		int r = s.length() - 1;
		while(l <= r) {
			if(s.charAt(l) != s.charAt(r)) return false;
			l += 1;
			r -= 1;
		}
		return true;
	}
} 
