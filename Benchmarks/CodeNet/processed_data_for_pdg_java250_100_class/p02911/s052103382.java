public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int A[] = new int[Q];
		for (int i = 0; i < Q; i++) {
			A[i] = sc.nextInt();
		}
		int X[] = new int[N];
		Arrays.fill(X, K - Q);
		for (int i = 0; i < Q; i++) {
			X[A[i] - 1] = X[A[i] - 1] + 1;
		}
		for (int i = 0; i < N; i++) {
			if (X[i] <= 0) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}
}
