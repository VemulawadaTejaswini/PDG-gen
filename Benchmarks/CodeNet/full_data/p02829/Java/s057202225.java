import java.util.*;

class Main {
	Scanner sc;
	
	private void calc() {
		sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(6-A-B);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}