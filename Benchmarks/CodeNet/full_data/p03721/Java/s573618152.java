public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		 long K = sc.nextLong();
		for (int i = 0; i < N; i++) {
			int res = sc.nextInt();
			long count = sc.nextLong();
			K -= count;
			if (K <= 0) {
				System.out.println(res);
				break;
			}
		}

	}
}