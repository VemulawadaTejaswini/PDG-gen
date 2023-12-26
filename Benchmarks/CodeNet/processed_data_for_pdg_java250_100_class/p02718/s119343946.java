public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		int wa = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			wa += A[i];
		}
		sc.close();
		int ok = 0;
		for(int i = N - 1; i >= 0; i--) {
			ok += A[i] * (4 * M) >= wa ? 1 : 0;
		}
		System.out.println(ok >= M ? "Yes" : "No");
	}
}
