public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] H = new int[N];
		boolean error = false;
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
			if (H[i] > 100 || H[i] < 1) {
				error = true;
			}
		}
		if (N > 20 || N < 1) {
			System.out.println("無効な入力値です");
			return;
		}
		if (error) {
			System.out.println("無効な入力値です");
			return;
		}
		int count = 0;
		int max = 0;
		for (int i = 0; i < N; i++) {
			if (max <= H[i]){
				max = H[i];
				count++;
			}
		}
		System.out.println(count);
	}
}
