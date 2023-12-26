public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int working = 0;
		for (int i = 0; i < m; ++i) {
			working += sc.nextInt();
		}
		int vacation = Math.max(n - working, -1);
		System.out.println(vacation);
	}
}
