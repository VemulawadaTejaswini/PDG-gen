import java.util.*;

class Main {
	Scanner sc;
	String S;
	
	private void calc() {
		sc = new Scanner(System.in);
		S = sc.next();
		int N = S.length();
		if (isRev(S) && isRev(S.substring(0, (N-1)/2)) && isRev(S.substring( (N-1)/2+1)))
			System.out.println("Yes");
		else System.out.println("No");
	}
	
	private boolean isRev(String s) {
		int n = s.length();
		for (int i = 0; i < n / 2; i++) {
			if (s.charAt(i) != s.charAt(n-1-i)) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
