public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		boolean[] arrayGetSweets = new boolean[N];
		for (int i = 0; i < K; i++) {
			int d = sc.nextInt();
			for (int j = 0; j < d; j++) {
				int GetSweets = sc.nextInt();
				if (!arrayGetSweets[GetSweets - 1]) {
					arrayGetSweets[GetSweets - 1] = true;
				}
			}
		}
		sc.close();
		int count = 0;
		for (boolean bool : arrayGetSweets) {
			if (!bool) {
				count++;
			}
		}
		System.out.println(count);
	}
}
