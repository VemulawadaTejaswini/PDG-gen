import java.util.*;

class Main {
	Scanner sc;
	
	private void calc() {
		sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println((char)(s.charAt(0)+1));
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}