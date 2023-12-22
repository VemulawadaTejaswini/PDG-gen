import java.util.*;

class Main {
	Scanner sc;
	String S;
	
	private void calc() {
		sc = new Scanner(System.in);
		S = sc.next();
		int c = 0;
		int l = S.length();
		for (int i = 0; i < l/2; i++) {
			if (S.charAt(i) != S.charAt(l-i-1)) c++;
		}
		System.out.println(c);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}