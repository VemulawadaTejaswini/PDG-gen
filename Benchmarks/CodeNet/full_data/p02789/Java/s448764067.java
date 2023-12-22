import java.util.*;

class Main {
	Scanner sc;
	
	private void calc() {
		sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		System.out.println((N==M)?"Yes":"No");
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
