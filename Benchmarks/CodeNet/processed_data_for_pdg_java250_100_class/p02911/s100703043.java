public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int q = scanner.nextInt();
			int[] sankasha = new int[n];
			for (int i = 0; i < n; i++) {
				sankasha[i] = k;
			}
			for (int i = 0; i < q; i++) {
				int index = scanner.nextInt();
				sankasha[index-1]++;
			}
			for (int i = 0; i < n; i++) {
				System.out.println((sankasha[i] - q) > 0 ? "Yes" : "No");
			}
		}
	}
}
