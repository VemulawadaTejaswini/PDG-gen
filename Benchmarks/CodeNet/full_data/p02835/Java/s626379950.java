import java.util.*;

class Main {
	Scanner sc;
	
	private void calc() {
		sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		if (a1+a2+a3 > 21) System.out.println("bust");
		else System.out.println("win");
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}