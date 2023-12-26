public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (y % 2 != 0) {
			System.out.println("No");
			return;
		}
		int b = x;
		if (4 * b == y) {
			System.out.println("Yes");
			return;
		} else if (4 * b < y) {
			System.out.println("No");
			return;
		} else {
			int a = (4 * b - y) / 2;
			if ((4 * b - y) % 2 != 0) {
				System.out.println("No");
				return;
			}
			b -= a;
			if (a >= 0 && b >= 0 && (2 * a + 4 * b == y)) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
