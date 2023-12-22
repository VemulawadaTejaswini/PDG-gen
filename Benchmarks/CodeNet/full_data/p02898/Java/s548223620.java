import java.util.*;

class Main {
	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}
	
	void calc() {
		int N = sc.nextInt();
		int K = sc.nextInt();
		int c = 0;
		for (int i = 0; i < N; i++) {
			int h = sc.nextInt();
			if (h >= K) c++;
		}
		System.out.println(c);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}