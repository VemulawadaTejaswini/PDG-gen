public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int ans = 0;
		for (int i = 0; i < N; i++) {
			int H = sc.nextInt();
			if (ans <= H) {
				count++;
			}
			if (H > ans) {
				ans = H;
			}
		}
		System.out.println(count);
	}
}
