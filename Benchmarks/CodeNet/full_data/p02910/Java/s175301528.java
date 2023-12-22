import java.util.*;

class Main {
	Scanner sc;
	String s;

	Main() {
		sc = new Scanner(System.in);
	}
	
	void calc() {
		s = sc.next();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ((i%2)==0) {
				if (c != 'R' && c != 'U' && c != 'D') {
					System.out.println("No");
					return;
				}
			} else {
				if (c != 'L' && c != 'U' && c != 'D') {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}