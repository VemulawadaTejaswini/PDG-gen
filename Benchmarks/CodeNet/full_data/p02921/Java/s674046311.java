import java.util.*;
public class Main {
	Scanner sc;
	String S,T;

	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		S = sc.next();
		T = sc.next();
		int c = 0;
		for (int i = 0; i < 3; i++) {
			if (S.charAt(i) == T.charAt(i)) c++;
		}
		System.out.println(c);
		System.out.flush();
	}

	public static void main(String[] args) {
		new Main().calc();
	}

}