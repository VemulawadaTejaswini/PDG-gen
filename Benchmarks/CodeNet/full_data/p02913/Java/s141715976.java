import java.util.*;

public class Main {
	Scanner sc;
	int N;
	String S;
	int l;
	
	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		S = sc.next();
		l = S.length();
		
		int max = 0;
		for (int s = 1; s < l; s++) {
			int eq = match(s);
			if (eq > max) max = eq;
		}
		System.out.println(max);
	}
	
	private int match(int s) {
		int m = 0;
		int eq = 0;
		for (int i = s; i < l; i++) {
			if (S.charAt(i) == S.charAt(i-s)) {
				eq++;
				if (eq > m) {
					m = eq;
					if (m >= s) return s;
				}
			}
			else eq = 0;
		}
		return m;
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}

}
