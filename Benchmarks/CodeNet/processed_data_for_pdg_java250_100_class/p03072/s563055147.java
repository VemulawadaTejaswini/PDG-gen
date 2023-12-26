public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = sc.nextInt();
		}
		sc.close();
		int ans = 0;
		for (int i = 0; i < N; i++) {
			boolean flag = true;
			for (int j = 0; j < i; j++) {
				if (list[j] > list[i]) {
					flag = false;
				}
			}
			if (flag)
				ans++;
		}
		System.out.println(ans);
	}
}
