public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Integer[] A = new Integer[N];
		int all = 0; 
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			all += A[i];
		}
		sc.close();
		Arrays.sort(A, Collections.reverseOrder()); 
		if (A[M - 1] < Math.ceil(all / (4.0 * M))) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}
}
