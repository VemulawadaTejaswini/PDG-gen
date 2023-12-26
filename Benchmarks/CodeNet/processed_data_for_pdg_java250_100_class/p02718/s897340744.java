public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		double sum = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<> (Collections.reverseOrder());
		for (int i = 0; i < N; i++) {
			int Ai = sc.nextInt();
			sum += Ai;
			pq.add(Ai);
		}
		double threshold = sum / (4 * M);
		boolean result = true;
		for (int i = 0; i < M; i++) {
			if (pq.poll() < threshold) {
				result = false;
				break;
			}
		}
		System.out.println(result?"Yes":"No");
		sc.close();
	}
}
