public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		boolean judge = true;
		int voteSum = 0;
		Integer[] arrayA = new Integer[N];
		for (int i = 0; i < N; i++) {
			arrayA[i] = Integer.parseInt(sc.next());
			voteSum += arrayA[i];
		}
		sc.close();
		Arrays.sort(arrayA, Comparator.reverseOrder());
		for (int i = 0; i < M; i++) {
			if (4 * M * arrayA[i] < voteSum ) {
				judge = false;
				break;
			}
		}
		System.out.println(judge ? "Yes" : "No");
	}
}
