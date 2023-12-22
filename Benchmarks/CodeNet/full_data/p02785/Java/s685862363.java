import java.util.*;

class Main {
	Scanner sc;
	
	private void calc() {
		sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] H = new int[N];
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		Arrays.sort(H);
		long s = 0;
		for (int i = 0; i < N-K; i++) {
			s += H[i];
		}
		System.out.println(s);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
