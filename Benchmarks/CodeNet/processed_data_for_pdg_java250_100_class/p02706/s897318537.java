public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long sum = 0;
		for (int i = 0; i < M; i++) {
			sum += sc.nextInt();
			if (sum > N) {
				System.out.println(-1);
				sc.close();
				return;
			}
		}
		System.out.println(N - sum);
		sc.close();
	}
}
