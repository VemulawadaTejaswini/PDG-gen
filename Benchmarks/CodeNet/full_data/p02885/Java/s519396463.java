import java.util.*;

class Main {
	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}
	
	void calc() {
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(Math.max(0, A-2*B));
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}