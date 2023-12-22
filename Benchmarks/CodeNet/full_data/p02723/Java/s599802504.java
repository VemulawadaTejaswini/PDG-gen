import java.util.*;

class Main {
	Scanner sc;
	
	void calc() {
		sc = new Scanner(System.in);
		String s = sc.next();
		if (s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
