import java.util.*;

class Main {
	Scanner sc;
	int N;
	int[] P;
	
	private void calc() {
		sc = new Scanner(System.in);
		int N = sc.nextInt();
		P = new int[N];
		for (int i = 0; i < N; i++) P[i] = sc.nextInt();

		int c = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			if (min > P[i]) c++;
			min = Math.min(min, P[i]);
		}

		System.out.println(c);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
