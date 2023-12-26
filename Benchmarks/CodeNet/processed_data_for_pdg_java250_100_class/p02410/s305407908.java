public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] list = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				list[i][j] = sc.nextInt();
			}
		}
		int[] list2 = new int[m];
		for (int i = 0; i < m; i++) {
				list2[i] = sc.nextInt();
		}
int ans;
		for(int i = 0; i < n; i++) {
			ans = 0;
			for(int j = 0; j < m; j++) {
				ans += list[i][j] * list2[j];
			}
			System.out.println(ans);
		}
	}
}
