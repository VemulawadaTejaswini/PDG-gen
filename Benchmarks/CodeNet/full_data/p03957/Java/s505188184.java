

import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean f = false;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == 'C' && s.charAt(j) == 'F') {
					f = true;
				}
			}
		}
		if (f) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
