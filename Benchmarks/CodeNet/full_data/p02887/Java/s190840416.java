import java.util.*;

class Main {
	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}
	
	void calc() {
		int N = sc.nextInt();
		String S = sc.next();
		
		int prev = -1;
		int cnt = 0;
		for (int i = 0; i < S.length(); i++) {
			int col = S.charAt(i);
			if (col != prev) cnt++;
			prev = col;
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}