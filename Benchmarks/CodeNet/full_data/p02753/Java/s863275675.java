import java.util.*;

class Main {
	Scanner sc;
	String S;
	
	private void calc() {
		sc = new Scanner(System.in);
		S = sc.next();
		
		if (S.equals("AAA") || S.equals("BBB")) System.out.println("No");
		else System.out.println("Yes");
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
