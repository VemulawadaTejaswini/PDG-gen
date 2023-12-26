public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		int Q = sc.nextInt();
		long[] A = new long[N];
		Arrays.fill(A, K - Q);
		for(int i = 0; i < Q; i++) {
			int a = sc.nextInt();
			A[a - 1]++;
		}
		sc.close();
		for(int i = 0; i < N; i++) {
			if(A[i] > 0) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}
