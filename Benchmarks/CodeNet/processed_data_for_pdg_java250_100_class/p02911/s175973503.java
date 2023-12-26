public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int[] seikai = new int[N + 1];
		for(int i = 1;i <= Q;i++) {
			int A = sc.nextInt();
			seikai[A]++;
		}
		sc.close();
		for(int i = 1;i <= N;i++) {
			System.out.println(K - Q + seikai[i] > 0 ? "Yes" : "No");
		}
	}
}
