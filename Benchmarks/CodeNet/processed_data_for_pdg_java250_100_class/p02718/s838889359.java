public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int point[] = new int[n];
		for (int i = 0; i < n; i++) {
			point[i] = sc.nextInt();
		}
		Arrays.sort(point);
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += point[i];
		}
		if (point[point.length - m] * m * 4 < sum) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
