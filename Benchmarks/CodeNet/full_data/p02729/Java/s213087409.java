import java.util.*;

class Main {
	Scanner sc;
	int N, M;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		System.out.println( N*(N-1)/2+M*(M-1)/2 );
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
