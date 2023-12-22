import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len = s.length(), i=0, j=0;
		for (i=len-1; i>=0; i--) if (s.charAt(i)=='Z') break;
		for (j=0; j<len; j++) if (s.charAt(j)=='A') break;
		System.out.println(j>i ? 0 : (i-j)+1);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}