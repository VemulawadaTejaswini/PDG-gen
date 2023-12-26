public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		int[] data = {Math.abs(a - b), Math.abs(a - c), Math.abs(a - d),
				Math.abs(a - e), Math.abs(b - c), Math.abs(b - d),
				Math.abs(b - e), Math.abs(c - d), Math.abs(c - e),
				Math.abs(d - e)};
		int BigDifference = data[0];
		for (int i = 0; i < data.length; i++) {
			int value = data[i];
			if (value > BigDifference) {
				BigDifference = value;
			}
		}
		if (BigDifference > k) {
			System.out.println(":(");
		} else {
			System.out.println("Yay!");
		}
		sc.close();
	}
}
