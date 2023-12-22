import java.util.*;

class Main {
	Scanner sc;
	
	private void calc() {
		sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		System.out.println(T+S);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}